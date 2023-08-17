package com.example.student.move.first;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    //    ó�� ������ �� ����ϴ� html ����
    @GetMapping("/index")
    public String firstPage(Model model) {
        model.addAttribute("message", "Hello from the controller!");
        return "articles/index";
    }
}
