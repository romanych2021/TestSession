package com.testsession.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ActiveUserService {


    List<String > getAllActiveUser();

}
