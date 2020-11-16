package it.unical.inf.asd.restex.data.service.impl;

import it.unical.inf.asd.restex.data.dao.CompanyDao;
import it.unical.inf.asd.restex.data.entities.Company;
import it.unical.inf.asd.restex.data.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

  @Autowired
  private CompanyDao companyDao;

  @Override
  public Company add(Company company) {
    return companyDao.save(company);
  }

}
