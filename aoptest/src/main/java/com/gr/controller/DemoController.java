package com.gr.controller;

import com.gr.annotation.OptionalLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gaorun
 * @Description
 * @create 2021-06-30 11:23
 */
@Controller
@RequestMapping("/home")
public class DemoController {

	@OptionalLog(modules="操作日志", methods="查询操作日志")
	@RequestMapping("/index")
	public String index() {
		System.out.println("444444444444");
		return "index";
	}
}
