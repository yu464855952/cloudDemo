package com.cloud.example.servicefeign.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 */
@FeignClient(value = "eurekaclient")
public interface IEurekaClient {

	@GetMapping(value = "/hi")
	String sayHiToEurekaClient(@RequestParam(value = "name") String name);
}






