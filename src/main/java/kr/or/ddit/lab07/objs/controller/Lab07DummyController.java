package kr.or.ddit.lab07.objs.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;

import kr.or.ddit.lab07.objs.service.Lab07DummyService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class Lab07DummyController {
	
	private Lab07DummyService service;
	@Required
	@Autowired
	public void setService(Lab07DummyService service) {
		this.service = service;
	}
	
	@PostConstruct
	public void init() {
		log.info("생성 및 주입 완료 : {}, 주입된 객체 : {}",this, service);
		// service 가 주입되었는지 확인
	}	
}
