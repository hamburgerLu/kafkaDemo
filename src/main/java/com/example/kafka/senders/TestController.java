package com.example.kafka.senders;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    KafkaTemplate kafkaTemplate;


    @RequestMapping("/Kafka")
    @ResponseBody
    public void testkafka() throws Exception {
        JSONObject json = new JSONObject();
        json.put("id",110L);
        json.put("Cproductname","腾讯");

        kafkaTemplate.send("boot", json.toString());
    }

}
