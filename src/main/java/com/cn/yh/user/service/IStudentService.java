package com.cn.yh.user.service;

import com.cn.yh.user.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author Mr.Wang
 */
public interface IStudentService extends IService<Student> {
    List<Student> findAll(int id);
    List<Student> update(Student student);
    void updateOne(Student student);
}
