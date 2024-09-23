package kr.or.ddit.lab01.objs.dao;

public class DummyDAOFactory {
	
	public static DummyDAO generateDummyDAO() {
		return new OracleDAOImpl();
	}
}
