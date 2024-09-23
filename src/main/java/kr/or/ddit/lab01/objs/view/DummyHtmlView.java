package kr.or.ddit.lab01.objs.view;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class DummyHtmlView {
	public void generateContent(String information) {
		StringBuffer content = new StringBuffer();
		content.append("<html>     ");
		content.append("<body>     ");
		content.append(String.format("<h4>%s</h4>", information));	
		content.append("</body>    ");
		content.append("</html>    ");
		log.info("최종 컨텐츠 : {}", content);
	}
}
