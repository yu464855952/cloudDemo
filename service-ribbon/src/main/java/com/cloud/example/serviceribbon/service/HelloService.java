package com.cloud.example.serviceribbon.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: yubing
 * @create: 2019/09/03 19:03
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://eurekaclient/hi?name="+name,String.class);
    }

}
