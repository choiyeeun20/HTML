package com.yeeun.web.member;

public interface MemberService  {
	public void add (Member member);
	public Member [] list();
	public Member detail(String userid);
	public int Count();
	public void update(Member member);
	public void delete(Member memebr);
	
}
