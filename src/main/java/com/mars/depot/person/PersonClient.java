package com.mars.depot.person;

import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @project depot
 * @author: FannieXue
 * @time 2019-04-17
 */
@FeignClient(name = "person", configuration = FeignAutoConfiguration.class)
public interface PersonClient {

    @RequestMapping(value = "/api/person/v1/users/{userId}", method = RequestMethod.GET)
    String getUser(@PathVariable("userId") Long userId);
}
