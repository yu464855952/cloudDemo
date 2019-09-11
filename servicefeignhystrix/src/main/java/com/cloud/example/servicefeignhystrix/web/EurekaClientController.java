package com.cloud.example.servicefeignhystrix.web;


import com.cloud.example.servicefeignhystrix.service.IEurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program clouddemo
 * @description: 通过Feign去消费服务。
 * @author: yubing
 * @create: 2019/09/11 11:18
 */

@RestController
public class EurekaClientController {

	@Autowired
	IEurekaClient iEurekaClient;

	@GetMapping(value = "/hi")
	public String sayHi(@RequestParam String name){
		return iEurekaClient.sayHiToEurekaClient(name);
	}


}



