package hello.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    public String Hello(Model model){
        model.addAttribute("data", "Spring!!!");
        return "hello";     // hello.html인건 이제 말안해도 알지
    }
}
