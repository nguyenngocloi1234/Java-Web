package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichCondimentsController {
        @GetMapping("/home")
        public String home() {
            return "home";
        }
    @RequestMapping("/save")
    public String save(@RequestParam("lettuce") String lettuce, @RequestParam(required = false) String tomato, @RequestParam(required = false) String mustard, @RequestParam(required = false) String sprouts, Model model) {
        model.addAttribute("tomato", tomato);
        model.addAttribute("lettuce", lettuce);

        model.addAttribute("mustard", mustard);
        model.addAttribute("sprouts", sprouts);
        return "display";
    }
}
//chú ý: default value là phòng trường hợp null và empty
// required = false là không bắt buộc request được paramater nếu như  empty hoăc null
// empty là không tick gì hêt, null là không tìm thấy parameter
// nếu trùng tên thì không cần name();