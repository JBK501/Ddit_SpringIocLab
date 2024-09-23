package kr.or.ddit.lab05;

import java.awt.RenderingHints.Key;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.ddit.lab03.objs.Hunter;
import kr.or.ddit.lab03.objs.HuntingDog;
import kr.or.ddit.lab03.objs.ShotGun;
import kr.or.ddit.lab05.objs.HuntingGameComposite;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Playground {
	public static void main(String[] args) {
		
		try(
			ConfigurableApplicationContext context =
				new GenericXmlApplicationContext("classpath:kr/or/ddit/lab05/conf/lab05-context.xml");
		){
			 context.registerShutdownHook();
			
//			 // list
//			 List<Hunter> hunterList = context.getBean("hunterList", List.class);
//			 
//			 for(Hunter single : hunterList) {
//				 log.info("{}", single);
//			 }
//			 
//			 // set
//			 Set<HuntingDog> dogSet = context.getBean("dogSet", Set.class);
//			 log.info("{}", dogSet.size());
//			 
//			 // map
//			 Map<String,ShotGun> gunMap = context.getBean("gunMap", Map.class);
//			 gunMap.forEach((k,v)->log.info("key : {} value : {}",k,v));
//			 
//			 // properties
//			 Properties dbInfo = context.getBean("dbInfo",Properties.class);
//			 dbInfo.forEach((k,v)->log.info("key : {} value : {}",k,v));
			 
			 // composite
			 HuntingGameComposite game = context.getBean(HuntingGameComposite.class);
			 log.info("{}",game);
			 
			 List<Hunter> hunterList = game.getHunterList();
			 Set<HuntingDog> dogSet = game.getDogSet();
			 Map<String, ShotGun> gunMap = game.getGunMap();
			 Properties dbInfo = game.getDbInfo();
			 
			 String[] stringArray = game.getStringArray();
			 log.info("array : {}", Arrays.toString(stringArray));
			 
			 String[] array = context.getBean("stringArray",String[].class);
			 log.info("array : {}",array);
		}
		
	}
}
