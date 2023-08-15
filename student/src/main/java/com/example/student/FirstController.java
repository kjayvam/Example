package com.example.student;

import org.springframework.web.bind.annotation.GetMapping;

public class FirstController {

    //    처음 시작할 때 사용하는 html 지정
    @GetMapping("/")
    public String firstHTML() {
        return "index";
    }
}
