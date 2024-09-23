package kr.or.ddit.lab05.objs;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import kr.or.ddit.lab03.objs.Hunter;
import kr.or.ddit.lab03.objs.HuntingDog;
import kr.or.ddit.lab03.objs.ShotGun;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@RequiredArgsConstructor
public class HuntingGameComposite {
	// 사냥꾼 사냥개 총 dbinfo
	// list set  map properties
	// 필수 	필수	필수	노필수
	
	private final List<Hunter> hunterList;
	private final Set<HuntingDog> dogSet;
	private final Map<String, ShotGun> gunMap;
	private Properties dbInfo;
	
	private String[] StringArray; // optional
}
