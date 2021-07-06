package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputCurrency {
    @GetMapping(value = "/input-currency")
    public String Input(){
        return "input";
    }

    @RequestMapping(value = "/convert", method = RequestMethod.POST)
    public String Convert(Model model, @RequestParam("usd") int usd, @RequestParam("rate") int rate){
        int vnd = usd*rate;
        model.addAttribute("rate",rate);
        model.addAttribute("vnd",vnd);
        model.addAttribute("usd",usd);
        return "input";

    }



}
