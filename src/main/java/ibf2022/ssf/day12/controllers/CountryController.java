package ibf2022.ssf.day12.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ibf2022.ssf.day12.model.Country;
import ibf2022.ssf.day12.service.CountryService;

@Controller
@RequestMapping("/country")
public class CountryController {
    CountryService ctySvc;

    public CountryController() {
        ctySvc = new CountryService();
    }

    // @GetMapping(produces = {"application/xml"})
    @GetMapping
    public @ResponseBody List<Country> getAllCountries() {
        return ctySvc.getAllCountries();
    }

    @PostMapping
    public @ResponseBody Boolean createCountry(@RequestBody Country cty) {
        return ctySvc.createCountry(cty);
    }

    //to call this get method need to key in -> /country/list
    @GetMapping ("/list")
    //another way to do similar thing
    // @RequestMapping(path = "/list", method=RequestMethod.GET);

    public String displayCountries(Model model) {

        List<Country> ctyList = ctySvc.getAllCountries();

        model.addAttribute("countryList",ctyList);

        return "countryList";
    }
}
