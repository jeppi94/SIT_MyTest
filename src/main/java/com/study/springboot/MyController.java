package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController
{

	@RequestMapping("/")
	public @ResponseBody String root() throws Exception
	{
		return "JSP in Gradle";
	}

	@RequestMapping("/test1")
	public String test1()
	{

		return "test1";

	}

	@RequestMapping("/test2")
	public @ResponseBody String test2()
	{
		return "test2";
	}

	@RequestMapping("/test3")
	public String test3()
	{

		return "test3";

	}

	@RequestMapping("/test4")
	public String test4()
	{

		return "test4";

	}
	
	@RequestMapping("/test5")
	public @ResponseBody String test5()
	{
		return "test5";
	}

}
