package com.yeeun.web.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yeeun.web.util.Credit;
import com.yeeun.web.util.Messenger;

@RestController /*페이지이동없이 현재페이지에서 처리*/
@RequestMapping("/grade") /*클라이언트가 요청한 URL를 처리할 메서드 */

public class GradeController {
	@Autowired GradeService gradeService; /*의존하고있는 bean을 가져다 쓸수있음*/ 
	@PostMapping("/register")/*POST:새로운 데이터 생성;등록이므로 Create개념의 POST* ("/URL의 자리.")/
					/*register는 key. key는 String 타입이다*/
	public Messenger register(@RequestBody Grade grade) {/*클라이언트가 URL을 통해 데이터를 입력하면 HTML의 body에 넣어짐. 그  body에 입력된 데이러를 통째로 불러와서  Grade grade에 그대로 세팅함*/
		int current  = gradeService.count();
		gradeService.add(grade);
		return gradeService.count()==(current+1)? Messenger.SUCCESS: Messenger.FAIL;
		
	}
	@GetMapping("/report/{userid}")/*GET:생성된 데이터를 불러오는것 Read개념의 Get*/
	public Credit report(@PathVariable String userid) {/*@PathVariable:URL경로에 변수를 넣어주는것.*/
		return gradeService.detail(userid);
		
	}
	
}
	
