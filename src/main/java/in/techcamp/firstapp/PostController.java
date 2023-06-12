package in.techcamp.firstapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/hello")
    @ResponseBody
    public String showHello(){
        return "<h1>Hello World!</h1>";
    }
}
