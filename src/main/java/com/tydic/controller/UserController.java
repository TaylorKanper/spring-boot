package com.tydic.controller;

import com.tydic.bean.UserBean;
import com.tydic.service.IUserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
@Slf4j
public class UserController {
    @Autowired
    private IUserService userService;

    @ApiOperation(value = "查找用户", notes = "根据用户名查找用户")
    @ApiImplicitParam(name = "name", value = "用户名称", required = true, dataType = "java.lang.String", paramType = "path")
    @RequestMapping(value = "/findByName", method = RequestMethod.POST)
    public UserBean findUserByName(String name) {
        try {
            return userService.findUserByUserName(name);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
        }
        return null;
    }

    @ApiOperation(value = "查找用户", notes = "根据用户id查找用户")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public UserBean findUserById(@PathVariable Integer id) {
        try {
            return userService.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
        }
        return null;
    }


}
