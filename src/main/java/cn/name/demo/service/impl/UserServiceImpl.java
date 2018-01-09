package cn.name.demo.service.impl;

import cn.name.demo.dao.UserMapper;
import cn.name.demo.domain.User;
import cn.name.demo.domain.UserExample;
import cn.name.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Nominal on 2018/1/9 0009.
 * 微博：@李明易DY
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public List<User> findAll(UserExample userExample) {
        return (List<User>)userMapper.selectByExample(userExample);
    }
}
