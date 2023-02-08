package ibf2022.ssf.day12.service;

import java.util.List;

import ibf2022.ssf.day12.model.Country;
import ibf2022.ssf.day12.repo.CountryRepo;

public class CountryService {

    CountryRepo ctyRepo;

    public CountryService() {
        ctyRepo = new CountryRepo();
    }

    public List<Country> getAllCountries() {
        return ctyRepo.getAllCountries();
    }

    public Boolean createCountry(Country cty) {
        Boolean result = ctyRepo.createCountry(cty);
        return result;
    }
}
