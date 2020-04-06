package com.initializing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @Author Axun
 * @Create 2020/3/18 16:43
 */
@Service
public class UserService {

	@Autowired
	private IndexService indexService;

	public UserService(){
		System.out.println("user init.");
	}

	@PostConstruct
	public void postUser(){
		System.out.println("constructor from UserService.");
	}
}
