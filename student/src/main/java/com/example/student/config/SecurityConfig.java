package com.example.student.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests().antMatchers("/index").permitAll() // "/index" URL�� ���� ���� ���� ���
                .anyRequest().authenticated() // ������ ��û�� ���� �ʿ�
                .and().formLogin().loginPage("/login") // �α��� ������ ����
                .permitAll();

    }
}
