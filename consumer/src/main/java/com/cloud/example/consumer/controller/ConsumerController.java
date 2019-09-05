package com.cloud.example.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program consumer
 * @description: 服务消费者demo
 * @author: yubing
 * @create: 2019/09/03 19:06
 */
@RestController
@RequestMapping(value = "consumer")
public class ConsumerController {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("demo")
	public String demo(){
		//ip+端口改为应用名
		return restTemplate.getForObject("http://provider-demo/provider/demo",String.class);
	}
}
