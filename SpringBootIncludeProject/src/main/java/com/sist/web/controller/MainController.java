package com.sist.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
/*
 * 	1. MVC 동작 과정
 *  2. 어노테이션 역할
 *     => 메모리 할당
 *  3. ROM (Mybatis)
 *  4. HttpSession / Cookie
 *  5. 요청 데이터 => @RequestParam / @ModelAttribute
 *                 Vue, React (JSON) => @RequestBody
 *  6. @Controller / @RestController
 *  7. @ControllerAdvice : 예외 처리 공통으로 처리
 *  8. @Aspect : AOP
 *  9. interceptor
 *  10. FileUpload
 *  11. Security / Batch / WebSocket
 *  
 *  FullStack : JavaScript
 */
// 화면 변경 => 요청 처리
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainController {
	@GetMapping("/")
	public String main_page(Model model)
	{
		model.addAttribute("main_html", "main/home");
		return "main/main";
	}
}
