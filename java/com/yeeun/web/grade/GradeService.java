package com.yeeun.web.grade;

public interface GradeService {
	public void add(Grade grade); 
	public Grade[] list();
	public Grade detail(Grade grade); 
	public int Count();
	public int total(Grade grade);
	public int average(Grade grade);
	public String record(Grade grade);
	public void update(Grade grade);
	public void delete(Grade grade);
}
