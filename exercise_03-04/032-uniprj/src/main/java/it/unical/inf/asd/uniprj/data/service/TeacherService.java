package it.unical.inf.asd.uniprj.data.service;

import it.unical.inf.asd.uniprj.data.entities.Teacher;

import java.util.List;

public interface TeacherService {
  List<Teacher> getAllTeacher();

  void deleteTeacherAndEmptyCourse();

}
