package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StudentModel {
  public String id;
  public String name;
  public String age;
  public String adhar;
  public String university;
}