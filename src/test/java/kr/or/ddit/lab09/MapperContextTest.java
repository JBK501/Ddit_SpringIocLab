package kr.or.ddit.lab09;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

import kr.or.ddit.jdbcboard.dao.JdbcBoardDAO;
import kr.or.ddit.vo.JdbcBoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringJUnitConfig(locations = "file:src/main/resources/kr/or/ddit/lab09/conf/*-context.xml")
@Transactional
class MapperContextTest {
	
	@Autowired
	SqlSessionFactory factory;
	
	// 첫문자를 소문자로 바꾸면 기본네임이 된다. (COC 개념)
	@Resource(name = "jdbcBoardDAO")
	JdbcBoardDAO dao;
	
	@Test
	void testInsert() {
		JdbcBoardVO board = new JdbcBoardVO();
		board.setBoardTitle("신규 제목===");
		board.setBoardWriter("신규 작성자===");
		board.setBoardContent("신규 컨텐츠===");
		assertEquals(1, dao.insertJdbcBoard(board));
	}
	
	@Test
	void testDAO() {
		dao.selectJdbcBoardList();
	}
	
	@Test
	void test() {
		log.info("주입된 factory : {}",factory);
	}

}
