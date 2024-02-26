package com.example.demo.service;


import com.example.demo.model.StudentModel;
import com.example.demo.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class studentService {
  @Autowired
  private static Studentrepository studentrepo;
  
  public static String AddStudent(String name, String age, String adhar, String university){
    String rid = UUID.randomUUID().toString();
    StudentModel studentmodel = studentrepo.addStudent(rid,name,age,adhar,university);
    return studentmodel.getId();
  }
  
  public static ArrayList GetAllStudentByUniversity(String university){
    return studentrepo.getAllStudentByUniversity(university);
  }
  public static StudentModel GetStudentById(String id){
    return studentrepo.GetStudentById(id);
  }
}
