package com.cn.yh.user.service.impl;

import com.cn.yh.user.entity.User;
import com.cn.yh.user.mapper.UserMapper;
import com.cn.yh.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author Mr.Wang
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
