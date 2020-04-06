package com.initializing.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @Author Axun
 * @Create 2020/3/18 16:43
 */
@Service
public class IndexService {

	@Autowired
	private UserService userService;

	public IndexService(){
		System.out.println("index init.");
	}

	@PostConstruct
	public void postIndex(){
		System.out.println("constructor from IndexService");
	}
}
