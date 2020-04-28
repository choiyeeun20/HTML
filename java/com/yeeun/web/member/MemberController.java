package com.yeeun.web.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yeeun.web.util.Messenger;

@RestController /* url을 처리하는 controller */
@RequestMapping("/member") /*pakaga명과 일치시키는게 일반적이다 */
public class MemberController {
	@Autowired MemberService memberService;

	@PostMapping("/join")
	public Messenger add(@RequestBody Member member) {
		int current = memberService.Count();
		String s = "";
		memberService.add(member);
		return (memberService.Count()==(current+1))? Messenger.SUCCESS: Messenger.FAIL;

	}
	@PostMapping("/login")
	public Messenger login(@RequestBody Member member) {
		return (memberService.login(member))?Messenger.SUCCESS : Messenger.FAIL;
	}
	@GetMapping("/detail")
	public Member detail(@RequestBody String userid) {
		Member returnDetail = new Member();
		memberService = new MemberServiceImpl();
		memberService.detail(userid);
	return returnDetail;	
	}
	@GetMapping("/list")
	public Member[] list(@RequestBody Member member) {
		Member [] returnMember = new Member[5];
		return returnMember;
	}
	@PutMapping("/count")
	public int Count (@RequestBody Member member) {
		int returnCount = 0;
		return returnCount;
	}
	@PutMapping("/update")
	public Member update(@RequestBody Member member) {
		Member returnMember = new Member();
		return returnMember;
	}
	@DeleteMapping("/delete")
	public Member delete(@RequestBody Member member) {
		Member returnMember = new Member();
		return returnMember;
	
}
}