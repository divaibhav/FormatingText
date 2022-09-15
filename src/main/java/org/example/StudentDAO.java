package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public List<Student> getAllStudent() {
        List<Student> studentList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root","admin");
            Statement statement = conn.createStatement();
            String sql = "Select * from student";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                int rollNO = resultSet.getInt(1);
                String name = resultSet.getString(2);
                studentList.add(new Student(rollNO,name));
            }
        } catch (SQLException e) {
           e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
