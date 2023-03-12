package com.mysite.proj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	//홈
	
	@RequestMapping(value = "/")
	public String index() {
		
		return "index";
	}
	
	
	//로그인
	
	/*
	@GetMapping("/login")
	public String login() {
		 
		return "login";
	}
	*/
	//공지사항
	@RequestMapping(value = "/notice")
	public String notice() {
		 
		return "notice";
	}
	
	//상품리스트
	@RequestMapping(value = "/list")
	public String list() {
		 
		return "list";
	}
	//상품상세
		@RequestMapping(value = "/product")
		public String product() {
			 
			return "product";
		}
		
		
	//카카오 로그인
		@RequestMapping(value = "/kakao")
		public String kakao() {
			return "kakao";
		}
		
		
	//네이버 로그인	
		@RequestMapping("/naver")
	    public String naver() {
	        return "naver";
	    }
		
		//질문상세보기
		@GetMapping("/notice/detail")
		public String detail() {
			return "notice_detail";
		}
		
		//질문상세보기
				@GetMapping("/signup_2")
				public String sign2() {
					return "signup_2";
				}
		
	
	

}
