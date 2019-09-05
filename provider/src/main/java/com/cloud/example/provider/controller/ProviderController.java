package com.cloud.example.provider.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program provider
 * @description: 服务提供者demo
 * @author: yubing
 * @create: 2019/09/03 19:03
 */
@RestController
@RequestMapping(value = "provider")
public class ProviderController {

	@RequestMapping("/demo")
	public String demo(){
		return "ProviderController";
	}

}
