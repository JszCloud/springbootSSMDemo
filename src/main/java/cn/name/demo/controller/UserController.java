package cn.name.demo.controller;

import cn.name.demo.domain.User;
import cn.name.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Nominal on 2018/1/9 0009.
 * 微博：@李明易DY
 */

//controller层并且返回json
@RestController
public class UserController {
    //注入service
    @Autowired
    UserService userService;

    //请求映射
    @RequestMapping(value = "user")
    public List<User> cs() {
        //调用userService的findAll查询所有信息存入泛型集合
        List<User> user = userService.findAll(null);
        return user;
    }
}
