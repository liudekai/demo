package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by DK on 2018/11/27.
 */
@Controller
public class HelloControllerTwo {
    @RequestMapping("/helloTwo")
    public String helloTwo(Model model){
        model.addAttribute("nowTime", DateFormat.getDateTimeInstance().format(new Date()));
        return "helloTwo";
    }

    @RequestMapping("/helloThree")
    @ResponseBody
    public String helloThree(){
       return "hello world";
    }

}
