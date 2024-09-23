package kr.or.ddit.lab09;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringJUnitConfig(locations = "file:src/main/resources/kr/or/ddit/lab09/conf/datasource-context.xml")
//@ContextConfiguration(locations = "file:src/main/resources/kr/or/ddit/lab09/conf/datasource-context.xml")
class DataSourceTest {

	@Autowired
	DataSource dataSource;
	
	@Test
	void test() throws SQLException {
		log.info("주입된 객체 : {}", dataSource);
		log.info("connection : {}",dataSource.getConnection());
	}

}
