package com.shanshuan.redistest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    RedisService redisService;

    @RequestMapping("/get/{key}")
    public String getVaule(@PathVariable("key")String key){
        return redisService.get(key);
    }

    @RequestMapping("/set/{key}/{value}")
    public String set(@PathVariable("key")String key, @PathVariable("value")String value){
         redisService.set(key,value);
        return "1";
    }
}
