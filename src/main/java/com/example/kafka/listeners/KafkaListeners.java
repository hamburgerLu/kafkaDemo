package com.example.kafka.listeners;

import com.alibaba.fastjson.JSONObject;
import com.example.kafka.constant.Constants;
import org.springframework.kafka.annotation.KafkaListener;

public class KafkaListeners {


    /**
     * 相当于一个consumer只能对应一个group-id，同一个groupId只能收到一条信息
     * @param content
     */
    @KafkaListener(topics = {Constants.topic},id = "lu-group-1")
    public void processMessage1(String content) {
        Object obj = JSONObject.parse(content);
        System.out.println("1===================================="+obj.toString());
    }



    @KafkaListener(topics = {Constants.topic},id = "lu-group-2")
    public void processMessage2(String content) {
        Object obj = JSONObject.parse(content);
        System.out.println("2===================================="+obj.toString());
    }
}