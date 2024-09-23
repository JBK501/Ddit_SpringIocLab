package kr.or.ddit.lab01.objs.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ddit.lab01.objs.dao.DummyDAO;
import kr.or.ddit.lab01.objs.dao.DummyDAOFactory;
import kr.or.ddit.lab01.objs.dao.MariaDBDAOImpl;
import kr.or.ddit.lab01.objs.dao.OracleDAOImpl;

@Service
public class DummyServiceImpl implements DummyService {

	// 1. 필요한 의존객체를 new 키워드로 직접 생성 (결합력 최상).
	//<단점>
	// 관계를 형성하는 코드가 사방에 분산되어 있다.
	// 그래서 말도 안되는 코드가 만들어진다.
	// 다른쪽 서비스에서는 maria를 구현체로 사용함.
	// 그런데 여기 서비스에서는 oracle를 구현체로 사용함.
//	private DummyDAO dao = new MariaDBDAOImpl();
	
	
	// 2. Factory object(객체의 생성을 전담하는 객체) pattern
	//<장점>
	// 객체가 만들어지는 위치가 바뀜.
	// 구현체를 만드는 책임을 팩토리가 가져감.
	//<단점>
	// 팩토리 객체와 그 안에서 생성되는 객체사이의 결합력은 해결하지 못했다.
	// 팩토리 객체의 메소드를 변경하면, 해당 팩토리를 이용하는 모든 곳을 수정해야함.
//	private DummyDAO dao = DummyDAOFactory.generateDummyDAO();
	
	
	// 3. Strategy pattern
	// [외부 전략의 주입자]로부터 필요한 객체를 주입받는 구조다.
	// [외부 전략의 주입자]가 결합력을 가진다.
	// <방법>
	// 기본 생성자를 없앤다. -> 필요한 객체를 주입한다.
	// 컨트롤러에서 service를 사용할 때, daoImpl을 생성하여 사용한다.
	// <결과> 
	// DummyServiceImpl에서 결합에 관하여 처리할 내용이 사라졌다.
	// 결합력이 컨트롤러로 이동했다.
	@Autowired
	private final DummyDAO dao;
	
	// 4. 주입자를 컨트롤러가 아닌 외부로 빼기
	// 스프링 컨테이너를 사용한다. - 전략패턴의 확장판
	// [외부 전략의 주입자]가 스프링 컨테이너다.
	
	
	public DummyServiceImpl(DummyDAO dao) {
		this.dao = dao;
	}


	@Override
	public String retrieveInfomation(String pk) {
		String rawData = dao.selectByPK(pk);
		return String.format("%s 를 가공해서 만들어진 정보", rawData);
	}

}
