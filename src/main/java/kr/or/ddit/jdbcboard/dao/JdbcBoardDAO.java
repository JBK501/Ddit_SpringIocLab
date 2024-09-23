package kr.or.ddit.jdbcboard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import kr.or.ddit.vo.JdbcBoardVO;

/**
 	JDBC_BOARD 엔터티를 대상으로 crud 를 위한 PERSISTENCE LAYER
 */
@Mapper() 
// mapper 스캔의 대상이 된다. (= proxy가 빈으로 등록된다.) 
public interface JdbcBoardDAO {
	
	public int insertJdbcBoard(JdbcBoardVO boardVO);
	public List<JdbcBoardVO> selectJdbcBoardList();
	public JdbcBoardVO selectJdbcBoard(@Param("no") int boardNo);
	public int updateJdbcBoard(JdbcBoardVO boardVO);
	public int deleteJdbcBoard(@Param("boardNo") int boardNo);
	
	
	// Param 어노테이션으로 마이바티스는 내부적으로 맵을 만든다.
	// 따라서 xml 파일에서 컨트롤 스페이스를 통해, 미리설정한 식별자로 값을 접근할 수 있다.
	// Param(key) value
}
