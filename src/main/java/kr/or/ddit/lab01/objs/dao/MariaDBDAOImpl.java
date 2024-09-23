package kr.or.ddit.lab01.objs.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MariaDBDAOImpl implements DummyDAO {
	
	@Override
	public String selectByPK(String pk) {
		return String.format("%s 로 %s 에서 조회한 raw data", pk, "마리아DB");
	}
}
