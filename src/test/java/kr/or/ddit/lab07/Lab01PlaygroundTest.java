package kr.or.ddit.lab07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import kr.or.ddit.lab01.objs.controller.DummyController;

@SpringJUnitConfig(locations = "file:src/main/resources/kr/or/ddit/lab07/conf/lab01-context.xml")
class Lab01PlaygroundTest {

	@Autowired
	DummyController dummyController;
	
	@Test
	void test() {
		String param = "P10101";
		dummyController.receiveCommand(param);
	}

}

