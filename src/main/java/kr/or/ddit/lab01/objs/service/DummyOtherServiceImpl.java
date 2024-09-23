package kr.or.ddit.lab01.objs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ddit.lab01.objs.dao.DummyDAO;
import kr.or.ddit.lab01.objs.dao.DummyDAOFactory;
import kr.or.ddit.lab01.objs.dao.OracleDAOImpl;

@Service
public class DummyOtherServiceImpl implements DummyOtherService {

	
//	private DummyDAO dao = new OracleDAOImpl();
	
//	private DummyDAO dao = DummyDAOFactory.generateDummyDAO();
	
	@Autowired
	private DummyDAO dao;
	
	@Override
	public StringBuffer readOtherInfo(String pk) {
		String rawData = dao.selectByPK(pk);
		return new StringBuffer(
				String.format("%s를 가져와서 other service가 가공한 정보", rawData));
	}

}
