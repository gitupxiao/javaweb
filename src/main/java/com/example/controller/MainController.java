package com.example.controller;


import com.example.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){

        return "欢迎你，我的朋友";
    }

    @RequestMapping("/student")
    @ResponseBody
    public Student student(){
        Student student = new Student();
        student.setId(1);
        student.setName("小米");
        student.setSex("男");
        return student;
    }
}
