package ibf2022.ssf.day12.controllers;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = { "/home", "/index" })
public class HomeController {

    @GetMapping
    public String home(Model model) {

        Calendar cal = Calendar.getInstance();
        model.addAttribute("currTime", new Date().toString());
        model.addAttribute("currHour", cal.get(Calendar.HOUR_OF_DAY));

        // must return to the exact name of index.html in template folder
        return "index";
    }

}
