package CountryCity;

public class CountyFactory {
    public static Country createCountry(String line) {
        String[] parts = line.split(",");
        if (parts.length <=7) {
            return new Country(line);
        }else {
            return new CountrywithLeader(line);
        }
    }

}
