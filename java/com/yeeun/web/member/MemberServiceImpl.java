package com.yeeun.web.member;

public class MemberServiceImpl implements MemberService{
	private Member [] members;
	private int count;
	
	public MemberServiceImpl() {
		members = new Member[5];
		count = 0;
	}

	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
		
	}

	@Override
	public Member[] list() {
		return members;
	}
	
	@Override
	public Member detail(String userid) {
		Member returnDetail = null;
		for(int i=0;i<count;i++) {
			if(userid.equals(members[i].getUserid())) {
				returnDetail = members[i];
				break;
			}
		}
		return returnDetail;
	}
	

	@Override
	public int Count() {
		return count;
	}

	@Override
	public void update(Member member) {
		for(int i=0;i<count;i++) {
			if(member.getUserid().equals(members[i].getUserid())) {
				members[i].setPassword(member.getPassword());
				break;
			}
		}
	}

	@Override
	public void delete(Member member) {
		for(int i=0;i<count;i++) {
			if(member.getUserid().equals(members[i].getUserid())
					&& member.getPassword().equals(members[i].getPassword())){
				members[i] = members[count-1];
				members[count-1] =null;
				count--;
				}
	}
		}

	@Override
	public boolean login(Member member) {
		return true;
	}


	
}
