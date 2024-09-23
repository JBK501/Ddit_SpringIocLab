package kr.or.ddit.lab03.objs;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@RequiredArgsConstructor
public class Hunter {
	private final ShotGun shotGun;
	private HuntingDog huntingDog;
	
	public void init() {
		log.info("사냥 준비 완료. 총 : {}, 개 : {}", shotGun, huntingDog);
	}
	
	public void destroy() {
		log.info("사냥꾼 사망");
	}
}
