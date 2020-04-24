package com.yeeun.web.user;

public interface UserService {
	public void add(User user);/* join기능 */

	public int count();

	public User login(User user);

	public User detail(String userid);

	public boolean update(User user);

	public boolean remove(String userid);

}
