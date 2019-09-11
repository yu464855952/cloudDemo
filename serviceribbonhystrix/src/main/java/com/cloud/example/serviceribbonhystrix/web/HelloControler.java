package com.cloud.example.serviceribbonhystrix.web;

import com.cloud.example.serviceribbonhystrix.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program clouddemo
 * @description: RestTemplate+Ribbon去消费服务
 * @author: yubing
 * @create: 2019/09/11 11:18
 */
@RestController
public class HelloControler {

	@Autowired
	HelloService helloService;

	@RequestMapping(value = "/hi")
	public String hi(@RequestParam String name) {
		return helloService.hiService(name);
	}


}
