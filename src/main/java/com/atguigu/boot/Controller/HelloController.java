package com.atguigu.boot.Controller;

import com.atguigu.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

@Autowired
    Car car;

    @RequestMapping("/car")
    public Car car(){
        return car;
    }


    @RequestMapping("/hello")
    public String handle01(){
        return "hello,springboot2";
    }
}
