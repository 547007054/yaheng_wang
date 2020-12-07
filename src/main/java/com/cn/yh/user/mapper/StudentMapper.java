package com.cn.yh.user.mapper;

import com.cn.yh.user.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author Mr.Wang
 */

public interface StudentMapper extends BaseMapper<Student> {
      List<Student> findAll(int id);
      List<Student> update(Student student);
      void updateOne(Student student);
}
