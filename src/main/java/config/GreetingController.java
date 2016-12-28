package config;

import domain.Flight;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.SupplierService;

import java.util.List;

@Controller
public class GreetingController {



    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping("/flights")
    public List<Flight> getFlights(){

        return SupplierService.getInstance().getFlights();
    }


}