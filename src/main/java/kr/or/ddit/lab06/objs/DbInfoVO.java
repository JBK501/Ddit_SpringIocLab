package kr.or.ddit.lab06.objs;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class DbInfoVO {
	private String driverClassName;
	private String url;
	private String user;
	private String password;
	private boolean autoCommit;
	private long  connectionTimeout;
	private String connectionTestQuery; 
	private int minimumIdle;
	private int maximumPoolSize;
	
	public void init() {
		log.info("객체 초기화 완료 : {}", this);
		log.info("maximunPoolSize (using + 3) : {}", maximumPoolSize);
		log.info("minimumIdle (using * 3) : {}", minimumIdle);
		log.info("connectionTestQuery (using * 2) : {}",connectionTestQuery);
	}
}
