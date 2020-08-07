package com.zdp.example.controller;


import com.zdp.example.dtos.Teacher;
import com.zdp.example.model.Classmates;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        Teacher teacherDto =new Teacher();
        teacherDto.setName("王老师");
        Classmates build = Classmates.builder().age("12").name("小雨").build();

        return "aa"+build.toString()+teacherDto.getName();
    }
}
