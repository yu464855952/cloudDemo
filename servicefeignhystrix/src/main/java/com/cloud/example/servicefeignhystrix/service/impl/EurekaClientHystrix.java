package com.cloud.example.servicefeignhystrix.service.impl;

import com.cloud.example.servicefeignhystrix.service.IEurekaClient;
import org.springframework.stereotype.Component;

/**
 * @program clouddemo
 * @description:
 * @author: yubing
 * @create: 2019/09/11 14:33
 */
@Component
public class EurekaClientHystrix implements IEurekaClient {

	@Override
	public String sayHiToEurekaClient(String name) {
		return "sorry "+name + "error";
	}

}
