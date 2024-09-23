package kr.or.ddit.lab01.objs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.or.ddit.lab01.objs.dao.MariaDBDAOImpl;
import kr.or.ddit.lab01.objs.dao.OracleDAOImpl;
import kr.or.ddit.lab01.objs.service.DummyService;
import kr.or.ddit.lab01.objs.service.DummyServiceImpl;
import kr.or.ddit.lab01.objs.view.DummyHtmlView;

@Controller
public class DummyController {
	
	private DummyService service;
	
	@Autowired
	public void setService(DummyService service) {
		this.service = service;
	}
	
	private DummyHtmlView view;
	
	@Autowired
	public void setViewSub(DummyHtmlView view) {
		this.view = view;
	}
	
	public void receiveCommand (String param){
		String model = service.retrieveInfomation(param);
		view.generateContent(model);
	}
}
