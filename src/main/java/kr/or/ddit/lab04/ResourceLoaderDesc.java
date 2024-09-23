package kr.or.ddit.lab04;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import lombok.extern.slf4j.Slf4j;

/**
 	[스프링에서 자원관리]
 	Resource : 모든 자원의 접근 방법을 정의한 인터페이스
 	- 자원의 위치에 따른 구현체(built-in 구현체)가 존재한다.
 	ex) FileSystemResource (파일자원),
 	    ClassPathResource(클래스패스 자원)
 	    UrlResource()
 	ResourceLoader : 제시된 자원의 경로에따라 Resource 구현체를 결정하고, 자원을 검색하는 역할.
 	- 개발자가 자원 경로앞에 prefix를 지정한다. 
 	- classpath: | file: | http:(https:)  
 */

@Slf4j
public class ResourceLoaderDesc {
	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext();
		
		Resource fsr = context.getResource("file:D:\\00.medias\\images\\cat1.jpg");
		log.info("검색된 자원의 크기 : {}, 구현체 : {}", 
				fsr.contentLength(), fsr.getClass().getSimpleName());
		Resource cpr = context.getResource("classpath:kr/or/ddit/db/DbInfo.properties");
		log.info("검색된 자원의 크기 : {}, 구현체 : {}", 
				cpr.contentLength(), cpr.getClass().getSimpleName());
		Resource ur = context.getResource("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		log.info("검색된 자원의 크기 : {}, 구현체 : {}", 
				ur.contentLength(), ur.getClass().getSimpleName());
	}
}
