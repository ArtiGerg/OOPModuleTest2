package CountryCity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WorldStatistics {
    public static void main(String[] args) throws IOException {

        List<Country> countries = new ArrayList<>();
        List<City> cities = new ArrayList<>();


        try {
            countries = loadCountry("docs/orszagok.txt");
            cities = loadCity("docs/varosok.txt");


            System.out.println(countries.size());
            System.out.println(cities.size());
           /* System.out.println(getPopularFirstLetter());

            */
/*
            System.out.println(lastIndependentCountryCode());*/



        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }


       /* List<Country> countryList= countries;
        for (Country country:countries){
            System.out.println(country.getPopulationDensity());
 }

        */

    }


    private static List<Country> loadCountry(String path) throws IOException {
        List<Country> countryList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {

                Country country = CountyFactory.createCountry(line);
                countryList.add(country);
            }
        }
        return countryList;
    }

    static List<City> loadCity(String path) throws IOException {
        List<City> cityList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                City city = new City(line);
                cityList.add(city);
            }
        }
        return cityList;
    }


    // 5.feladat

    public Country findCountryBySoCode(String isoCode) throws IOException {
        List<Country> countries = new ArrayList<>();

        countries = loadCountry("docs/orszagok.txt");
        for (Country country : countries) {
            if (country.getCountryCode().equals(isoCode)) {
                return country;
            }
        }
        return null;
    }

    // 6.feladat

    public List<String> getCountriesOfContinent(String continentName) throws IOException {
        List<String> countriesofContinent = new ArrayList<>();
        List<Country> countryList = new ArrayList<>();
        countryList = loadCountry("docs/orszagok.txt");
        for (Country country : countryList) {
            if (continentName.equals(country.getContinent())) {
                countriesofContinent.add(country.getCountryCode());
            }

        }
        return countriesofContinent;
    }


    // 7.feladat

    public Set<String> getCitiesOfCountry(String countryCode) throws IOException {
        Set<String> cities = new TreeSet<>();
        List<City> cities1 = new ArrayList<>();
        cities1 = loadCity("docs/varosok.txt");

        for (City city : cities1) {
            if (city.getCountryCode().equalsIgnoreCase(countryCode)) {
                cities.add(city.getCityName());
            }

        }
        return cities;
    }

    //8. feladat


    public int countAhneds() throws IOException {
        List<Country> countryList = new ArrayList<>();
        countryList = loadCountry("docs/orszagok.txt");
        int counter=0;
        for (Country country:countryList){
            if (country.getLeader()!=null) {
                if (country.getLeader().contains("Ahmed") ||
                        country.getLeader().contains("Ahmad") ||
                        country.getLeader().contains("Hamad")) {
                    counter++;


                }
            }
        }
        return counter;
    }


    //9. feladat

    public static String getPopularFirstLetter() throws IOException {
        List<Country> countryList = new ArrayList<>();
        countryList = loadCountry("docs/orszagok.txt");
        Map<String, Integer> codeLetters =new TreeMap<>();
        int max = Integer.MIN_VALUE;
        String popular = null;
        for (Country country: countryList){
            String code = country.getCountryCode();
            String[] letters = code.split("");
            String firstLetter= letters[0];
            int total = codeLetters.getOrDefault(firstLetter, 0)+1;
            codeLetters.putIfAbsent(firstLetter, total);
        }
        for (Map.Entry<String, Integer> entry: codeLetters.entrySet()){
            if (entry.getValue()>max){
                max =entry.getValue();
            }
            popular= entry.getKey();

        }

        return popular;
    }

    //10.feladat
    public static String lastIndependentCountryCode() throws IOException {
        List<Country> countryList = new ArrayList<>();
        countryList = loadCountry("docs/orszagok.txt");
        int max = Integer.MIN_VALUE;
        Country land = new Country();
        String back = null;
        for (Country country : countryList) {
            if (!country.getIndependenceYear().equals("NULL")) {
                int year = Integer.parseInt(country.getIndependenceYear());
                if (year > max) {
                    max = year;
                 back =  country.getCountryCode();

                }

            }

        }
        return back;
    }
}

