package com.aradhyagupta25.SpringJDBCEx.repository;

import com.aradhyagupta25.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {

        String sql =  "insert into students (rollno, name, age) values (?, ?, ?)";  // saving the values in the table.

        int rows = jdbc.update(sql, s.getRollno(), s.getName(), s.getAge());    // update function will return 0/1 if table updated.
        System.out.println(rows + " rows inserted");
    }

    public List<Student> findAll() {
//        List<Student> students = new ArrayList<>();
//        return students;

        String sql = "select * from student";

        RowMapper <Student> rowMapper = (ResultSet rs, int rowNum) -> {

                Student s = new Student();
                s.setRollno(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setAge(rs.getInt("age"));
                return s;
        };

        return jdbc.query(sql,rowMapper );
    }
}
