package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsServiseImpl;

@Controller
public class CarsController {

     CarsServiseImpl carsServise = new CarsServiseImpl();

    @GetMapping(value = "/cars")
    public String printCars(Model model, @RequestParam(name ="count", required = false) Integer count) {

        if (count != null) {
            model.addAttribute("messages", carsServise.getCars(count));
            return "cars";
        } else {
            model.addAttribute("messages", carsServise.getCars());
        }
        return "cars";
    }


}