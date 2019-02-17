package com.example.demo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by DK on 2018/12/4.
 */
@Component
public class TestTask {

    @Scheduled(fixedRate = 2000)
    public void reportCurrentTime(){
        System.out.println("现在时间：---》》》"+ new Date());
    }
}
