package com.aradhyagupta25.SpringJDBCEx;
import com.aradhyagupta25.SpringJDBCEx.model.Student;
import com.aradhyagupta25.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

		Student s =  context.getBean(Student.class);
		s.setName("Aradhya");
		s.setRollno(45);
		s.setAge(20);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students = service.getStudents(s);


	}

}
