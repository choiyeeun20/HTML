package com.yeeun.web.semi;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class SemiServiceImpl implements SemiService {
	private Map<String, Object> map;
	
	public SemiServiceImpl() {
		map = new HashMap<>();
		}
	
	
	@Override
	public void add(Semi semi) {
		
	}

	@Override
	public Semi login(Semi semi) {
		return null;
	}

}
