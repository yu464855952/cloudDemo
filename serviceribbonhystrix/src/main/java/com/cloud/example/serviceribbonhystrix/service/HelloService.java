package com.cloud.example.serviceribbonhystrix.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

	@HystrixCommand(fallbackMethod = "hiError")
	public String hiService(String name) {
		return restTemplate.getForObject("http://eurekaclient/hi?name=" + name, String.class);
	}

	public String hiError(String name) {
		return "hi," + name + ",sorry,error!";
	}
}
