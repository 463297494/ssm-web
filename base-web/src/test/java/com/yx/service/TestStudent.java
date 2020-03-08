package com.yx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.yx.utils.RedisUtil;

//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext-*.xml")
public class TestStudent {
	
	@Autowired
	private IStudentService studentService;
	@Autowired
	private RedisUtil redisUtil;
//	@Test
//	public void addStudent() {
//		Student student = new Student(222,"xiaoai",99);
//		studentService.addStudent(student);
//	}
//	
//	@Test
//	public void queryStudent() {
//		List<Student> students = studentService.queryStudents();
//		System.out.println(students);
//	}
//	
//	@Test
//	public void testRedis(){
//		redisUtil.set("name", "张三123");
//		System.out.println(redisUtil.get("name"));
//	}
}
