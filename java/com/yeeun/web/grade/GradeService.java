package com.yeeun.web.grade;

import com.yeeun.web.util.Credit;

public interface GradeService {
	public void add(Grade grade);
	public int count();
	Credit detail(String userid);
	
	
}
