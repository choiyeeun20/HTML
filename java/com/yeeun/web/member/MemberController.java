package com.yeeun.web.member;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /* url을 처리하는 controller */
@RequestMapping("/member") /*pakaga명과 일치시키는게 일반적이다 */

public class MemberController {
	public MemberService memberService;

	@PostMapping("/join")
	public Member add(@RequestBody Member member) {
		System.out.println(">>>>");
		System.out.println(member.toString());
		memberService = new MemberServiceImpl();
		memberService.add(member);
		return member;

	}
	@PostMapping("/login")
	public String login(@RequestBody Member member) {
		memberService = new MemberServiceImpl();
		return (memberService.login(member))? "SUCCESS" : "FAIL";
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