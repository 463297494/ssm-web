package com.yx.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yx.entity.Student;
import com.yx.service.IStudentService;

@Controller
public class TestController {
	private final Logger log = LoggerFactory.getLogger(TestController.class);
	@Autowired
	private IStudentService studentService;

	@RequestMapping("/out")
	@ResponseBody
	public String test(int stuno, String stuname, int stuage) {
		Student student = new Student(stuno, stuname, stuage);
		studentService.addStudent(student);
		return "测试输出成功444!";
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView login(String id, String username) {
		ModelAndView mav = new ModelAndView();
		// 跳转至成功页
		mav.addObject("id", id);
		mav.addObject("name", username);
		mav.addObject("gender", "男");
		mav.setViewName("success");
		return mav;
	}

}
