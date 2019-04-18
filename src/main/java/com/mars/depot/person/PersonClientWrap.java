package com.mars.depot.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @project depot
 * @author: FannieXue
 * @time 2019-04-17
 */
@Component
public class PersonClientWrap implements PersonClient {

    @Autowired
    PersonClient personClient;

    @Override
    public String getUser(Long userId) {
        return personClient.getUser(userId);
    }
}
