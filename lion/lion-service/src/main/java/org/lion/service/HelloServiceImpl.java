package org.lion.service;

import java.util.Date;

import org.lion.domain.HelloDomain;
import org.lion.export.HelloService;
import org.springframework.stereotype.Service;


@Service("helloService")
public class HelloServiceImpl implements HelloService{

	public HelloDomain sayHello(String userName) {
		HelloDomain helloDomain=new HelloDomain();
		helloDomain.setMessage("你好");
		helloDomain.setName(userName);
		helloDomain.setRightTime(new Date());
		return helloDomain;
	}

}
