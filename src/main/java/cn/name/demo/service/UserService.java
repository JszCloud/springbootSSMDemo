package cn.name.demo.service;

import cn.name.demo.domain.User;
import cn.name.demo.domain.UserExample;

import java.util.List;

/**
 * Created by Nominal on 2018/1/9 0009.
 * 微博：@李明易DY
 */
public interface UserService {
    /**
     * 查询User中所有信息
     * @param userExample
     * @return
     */
    List<User> findAll(UserExample userExample);
}
