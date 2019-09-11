package com.cloud.example.servicefeignhystrix.service;


import com.cloud.example.servicefeignhystrix.service.impl.EurekaClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 */
@FeignClient(value = "eurekaclient",fallback = EurekaClientHystrix.class)
public interface IEurekaClient {

	@GetMapping(value = "/hi")
	String sayHiToEurekaClient(@RequestParam(value = "name") String name);
}






