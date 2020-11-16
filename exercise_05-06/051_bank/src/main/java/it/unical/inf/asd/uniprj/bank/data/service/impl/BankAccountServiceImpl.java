package it.unical.inf.asd.uniprj.bank.data.service.impl;

import it.unical.inf.asd.uniprj.bank.data.dao.BankAccountDao;
import it.unical.inf.asd.uniprj.bank.data.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService {

  @Autowired
  private BankAccountDao bankAccountDao;



}
