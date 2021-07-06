package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String returnHome(){
        return "home";
    }
    @RequestMapping(value = "/calculate",method = RequestMethod.POST)
    public String calculator(@RequestParam String operator, @RequestParam("firstOperand") double firstOperand, @RequestParam("secondOperand") double secondOperand, ModelMap model){
        double result=0;
        switch (operator){
            case "+":
                result = firstOperand + secondOperand;
                break;


            case "-":
                result = firstOperand - secondOperand;
                break;


            case "*":
                result = firstOperand * secondOperand;
                break;

            default:
                if(secondOperand != 0)
                    result = firstOperand/secondOperand;
                else
                    model.addAttribute("message","not divide to 0");

                break;

        }
        model.addAttribute("secondOperand",secondOperand);
        model.addAttribute("firstOperand",firstOperand);
        model.addAttribute("result",result);
        return "home";
    }
}
