package com.example.demo.repository;

import com.example.demo.model.StudentModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Studentrepository {
  private Map<String, StudentModel> StudentMap;
  public Studentrepository(){
    StudentMap = new HashMap<>();
  }
  public StudentModel addStudent(String id, String name, String age, String adhar, String university){
    StudentMap.put(id,new StudentModel(id,name,age,adhar,university));
    return null;
  }
  public StudentModel GetStudentById(String id){
    return StudentMap.get(id);
  }
  public ArrayList<StudentModel> getAllStudentByUniversity(String University){
    ArrayList<StudentModel> al = new ArrayList<>();
    for(Map.Entry<String, StudentModel> entry : StudentMap.entrySet()){
      StudentModel student = entry.getValue();
      if(student.getUniversity().equals(University)){
        al.add(student);
      }
    }
    return al;
  }
}
