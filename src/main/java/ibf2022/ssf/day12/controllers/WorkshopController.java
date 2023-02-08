package ibf2022.ssf.day12.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/workshop")
public class WorkshopController {

    @GetMapping
    public String workshop() {
        return "workshop";
    }

    // must map to the action name on the workshop html page
    //considered as subset of requestmapping: workshop/processNumber
    @PostMapping("/processNumber")
    public String processNumber(@RequestParam(name = "inputNumber", defaultValue = "1") Integer unit, Model model) {

        List<Integer> lstIntegers = new ArrayList<Integer>();

        Integer loopValue = unit;
        Integer currentValue = 1;

        while (currentValue <= loopValue) {

            Random rand = new Random();
            int randomNum = rand.nextInt(31);

            // int result = (int) (Math.random() * loopValue) + 1;

            if (!lstIntegers.contains(Integer.valueOf(randomNum))) {
                lstIntegers.add(randomNum);
                currentValue++;
            }
        }

        model.addAttribute("numbers", lstIntegers);

        return "workshopresult";
    }

}
