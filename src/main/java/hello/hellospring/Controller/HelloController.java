package hello.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    public String Hello(Model model){
        model.addAttribute("data", "Spring!!!");
        return "hello";     // hello.html인건 이제 말안해도 알지
    }

    @RequestMapping("/helloMvc")
    public String helloMvc(@RequestParam(value = "name") String name, Model model){

        model.addAttribute("name", name);

        return "index1.html";
    }

    @RequestMapping("/helloString")
    @ResponseBody
    public String helloString(@RequestParam(value = "name") String name){
        return "hello" + name;
    }

    @RequestMapping("/helloApi")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

}
