package com.example.student;

import org.springframework.web.bind.annotation.GetMapping;

public class FirstController {

    //    ó�� ������ �� ����ϴ� html ����
    @GetMapping("/index")
    public String firstHTML() {
        return "index";
    }
}
