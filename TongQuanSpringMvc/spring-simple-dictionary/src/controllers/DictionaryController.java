package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    private static Map<String,String> dictionary;
    static {
        dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");
    }
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String returnHome(){
        return "home";
    }
    @RequestMapping(value = "/translate", method = RequestMethod.POST)
    public static String check(@RequestParam("txtsearch") String search, ModelMap model){
        String result =dictionary.get(search);
        model.addAttribute("txtsearch",search);
        if(result==null){
            model.addAttribute("message","Not found");
            return "home";
        }else {
            model.addAttribute("result",result);
            return "home";
        }
    }
}
