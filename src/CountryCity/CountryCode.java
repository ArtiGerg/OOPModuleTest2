package CountryCity;

public abstract class CountryCode {
    private String countryCode;

    public CountryCode() {
    }

    public CountryCode(String countryName, String countryCode) {

        this.countryCode = countryCode;
    }



    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}

