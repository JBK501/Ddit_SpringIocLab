package kr.or.ddit.lab08.objs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
//@Data
//@RequiredArgsConstructor
@Component
public class ResourceComposite {
	
	// [핵심]
	// @Data, @RequiredArgsConstructor 가 우선순위가 높다.
	// 따라서 @Value 가 어디에서 사용해야하는지 명확하게 지정해주어야 한다.
	
	private final Resource cpr; 	// required, cat1.jpg
	
	private final Resource fsr; 	// required, cat2.png
	
	@Value("#{resourceInfo.urlR}")
	private Resource urlR; 		// optional, google.logo

	public ResourceComposite(@Value("#{resourceInfo.cpr}") Resource cpr, @Value("#{resourceInfo.fsr}") Resource fsr) {
		this.cpr = cpr;
		this.fsr = fsr;
	}
	
	public void setUrlR(Resource urlR) {
		this.urlR = urlR;
	}
}
