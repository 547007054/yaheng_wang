package com.cn.yh.user.controller;


import com.cn.yh.user.entity.Student;
import com.cn.yh.user.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mr.Wang
 */
@RestController
@RequestMapping("/user/student")
public class StudentController {
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;
    @Autowired
    StudentServiceImpl service;

    @GetMapping("/findAll")
    public Map<String,Object> findAll(@RequestParam int id){
        Map<String,Object> map =new HashMap<>();
        List<Student> list =service.findAll(id);
        map.put("data", list );

        return map;
    }
    @GetMapping("/updateOne")
    public Map<String,Object> updateOne( Student student){
        Map<String,Object> map =new HashMap<>();
        service.update(student);
        map.put("data",  "成功");

        return map;
    }
   /* @PostMapping("/getUser")
    public Map<String,Object> getUser(@RequestParam int id){
        Map<String,Object> map =new HashMap<>();
        map.put("data",  service.findId(id));

        return map;
    }

    @GetMapping("/redis")
    public Map<String,Object> contextLoads(@RequestParam int id) {
       *//* //字符串
        redisTemplate.opsForValue().set("myKey",service.findById(id));
        redisTemplate.opsForValue().get("myKey");
        //集合
        redisTemplate.opsForList().leftPush("myList","1");
        redisTemplate.opsForList().leftPush("myList","2");
        redisTemplate.opsForList().leftPop("myList");*//*

        Map<String,Object> map =new HashMap<>();
        map.put("data",  service.findById(id));

        return map;
    }
*/
}
