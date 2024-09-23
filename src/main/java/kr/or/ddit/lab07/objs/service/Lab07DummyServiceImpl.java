package kr.or.ddit.lab07.objs.service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ddit.lab07.objs.dao.Lab07DummyDAO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class Lab07DummyServiceImpl implements Lab07DummyService {
//	@Autowired  // 생략가능
	@Resource(name = "oracleDAO")
	private final Lab07DummyDAO dao;
	
	@PostConstruct
	public void init() {
		log.info("생성 및 주입 완료 : {}, 주입된 객체 : {}",this, dao);
		// dao 가 주입되었는지 확인
	}	
}
