package com.example.kafka.listeners;

import com.alibaba.fastjson.JSONObject;
import org.springframework.kafka.annotation.KafkaListener;

public class KafkaListeners {

//    private Gson gson = new GsonBuilder().create();

    @KafkaListener(topics = {"boot"})
    public void processMessage(String content) {
//        BiddingUserBean m = gson.fromJson(content, BiddingUserBean.class);

        Object obj = JSONObject.parse(content);
        System.out.println(obj.toString());
    }

}