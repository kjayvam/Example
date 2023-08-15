package com.example.student.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests().antMatchers("/index").permitAll() // "/index" URL은 인증 없이 접근 허용
                .anyRequest().authenticated() // 나머지 요청은 인증 필요
                .and().formLogin().loginPage("/login") // 로그인 페이지 설정
                .permitAll();

    }
}
