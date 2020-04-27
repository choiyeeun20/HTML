package com.yeeun.web.hum;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class HumServiceImpl implements HumService {
	private Map<String, Object> map;
	
	public HumServiceImpl() {
		map = new HashMap<>();
	}
	
	@Override
	public void add(Hum hum) {
		map.put(hum.getUserid(), hum);
	}

	@Override
	public Hum login(Hum hum) {
		return null;
	}

	@Override
	public int count() {
		return map.size();
	}

}
