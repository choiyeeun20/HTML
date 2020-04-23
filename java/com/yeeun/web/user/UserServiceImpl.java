package com.yeeun.web.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	private Map<String, Object> map;
	
	public UserServiceImpl() {
		map = new HashMap<>();
	}
	@Override
	public void add(User user) {
		map.put(user.getUserid(),user);
		
	}
	@Override
	public int count() {
		return map.size();/*count++할 필요없이 map이 알아서 카운트를해줌*/
	}
	@Override
	public User login(User user) {
		User returnUser = null;
		if(map.containsKey(user.getUserid())) {
			User u = detail(user.getUserid());
			if(user.getPassword().equals(u.getPassword())) {
				return u;
				
			}
		}
		return returnUser;
	}
	@Override
	public User detail(String userid) {
		return (User) map.get(userid);
	}
	

}
