package it.unical.inf.asd.uniprj.data.service;

import it.unical.inf.asd.uniprj.data.dao.CourseDao;
import it.unical.inf.asd.uniprj.data.dao.CourseMaterialDao;
import it.unical.inf.asd.uniprj.data.entities.CourseMaterial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseMaterialServiceImpl implements CourseMaterialService {

  @Autowired
  private CourseMaterialDao courseDao;

}
