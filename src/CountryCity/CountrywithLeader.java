package CountryCity;

public class CountrywithLeader extends Country {
    private String countryLeader;

    public CountrywithLeader(Country country, String line){
        super(country,line );
        String[] parts = line.split(",");
        this.countryLeader=parts[7];
    }
    public CountrywithLeader(String line){
        String[] parts =line.split(",");
        setCountryCode(parts[0]);
        setName(parts[1]);
        setContinent(parts[2]);
        setRegion(parts[3]);
        setArea(Double.parseDouble(parts[4]));
        setIndependenceYear(parts[5]);
        setPopulation(Double.parseDouble(parts[6]));
        this.countryLeader=parts[7];
    }

    @Override
    public String getLeader(){
        return countryLeader;
    }

    public void setCountryLeader(String countryLeader) {
        this.countryLeader = countryLeader;
    }
}
