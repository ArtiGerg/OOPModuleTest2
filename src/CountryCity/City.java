package CountryCity;

public class City extends CountryCode {
    private String cityName;
    private int cityPopulation;

    public City() {
    }
    public City(String line) {
        String[] parts = line.split(",");
        this.cityName=parts[0];
        setCountryCode(parts[1]);
        this.cityPopulation= Integer.parseInt(parts[2]);
    }



    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(int cityPopulation) {
        this.cityPopulation = cityPopulation;
    }
}
