package CountryCity;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Country extends CountryCode{

    private String name;
    private String continent;
    private String region;
    private double area;
    private String independenceYear;
    private double population;
    private String leaderName;

    public Country() {
    }

    public Country(String name, String continent, String region, double area, String independenceYear, double population, String leaderName) {
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.area = area;
        this.independenceYear = independenceYear;
        this.population = population;
        this.leaderName = leaderName;
    }

    public Country(String countryName, String countryCode, String name, String continent, String region, double area, String independenceYear, double population, String leaderName) {
        super(countryName, countryCode);
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.area = area;
        this.independenceYear = independenceYear;
        this.population = population;
        this.leaderName = leaderName;
    }

    public Country(String line) {
        String[] parts =line.split(",");
        setCountryCode(parts[0]);
        this.name=parts[1];
        this.continent=parts[2];
        this.region = parts[3];
        this.area = Double.parseDouble(parts[4]);
        this.independenceYear= parts[5];
        this.population = Double.parseDouble(parts[6]);



    }

    public Country(Country country, String line) {
    }

    public double getPopulationDensity(){
           if (getPopulation() !=0 && getArea() !=0){
              return  getPopulation()/getArea();
           }else
           return  -1;
    }



    public String getLeader(){
        return null;
    }

    public double getRuralPopulation() throws IOException {
        List<City> cities = new ArrayList<>();
        cities = WorldStatistics.loadCity("docs/varosok.txt");
        List<City> countryCities = new ArrayList<>();
        int cityPopulation = 0;
        if (getPopulation() != 0) {
            for (City city : cities) {
                if (city.getCountryCode().equals(getCountryCode())) {
                    countryCities.add(city);
                }
            }
            for (City city : countryCities) {
                cityPopulation += city.getCityPopulation();
            }

        }
        return getPopulation() - cityPopulation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getIndependenceYear() {
        return independenceYear;
    }

    public void setIndependenceYear(String independenceYear) {
        this.independenceYear = independenceYear;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", area=" + area +
                ", independenceYear='" + independenceYear + '\'' +
                ", population=" + population +
                ", leaderName='" + leaderName + '\'' +
                '}';
    }
}


