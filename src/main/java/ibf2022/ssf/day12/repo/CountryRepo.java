package ibf2022.ssf.day12.repo;

import java.util.ArrayList;
import java.util.List;

import ibf2022.ssf.day12.model.Country;

public class CountryRepo {

    List<Country> countryList;

    public List<Country> getAllCountries() {
        countryList = new ArrayList<Country>();

        Country cty = new Country("SG", "Singapore", 6000000);
        countryList.add(cty);

        cty = new Country("MY", "Malaysia", 33000000);
        countryList.add(cty);

        cty = new Country("TH", "Thailand", 80000000);
        countryList.add(cty);

        return countryList;
    }

    public Boolean createCountry(Country cty) {

        if (countryList == null) {
            countryList = new ArrayList<Country>();
        }
        countryList.add(cty);
        return true;
    }

}
