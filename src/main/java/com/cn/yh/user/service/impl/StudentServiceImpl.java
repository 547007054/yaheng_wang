package com.cn.yh.user.service.impl;

import com.cn.yh.user.entity.Student;
import com.cn.yh.user.mapper.StudentMapper;
import com.cn.yh.user.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mr.Wang
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

    @Autowired
    StudentMapper mapper;
/*    @Caching(
            cacheable = {
                    @Cacheable(value = "stu")
            },
            put = {
                    @CachePut(value="stu",key = "#result.id")
            }
    )*/
    /*@Cacheable(cacheNames = "stu",key="#root.methodName+'['+#id+']'")*/
    /*@Cacheable(cacheNames = "stu",keyGenerator = "keyGenerator")*/
   /* @Cacheable(cacheNames = "stu",key="#id")
    public Student findById(int id){
        return mapper.findById(id);
    }
    @CachePut(value = "stu",key="#id")
    public Student findId(int id){
        return mapper.findById(id);
    }*/

    @Cacheable(cacheNames = "stu",key="#a0")
    public List<Student> findAll(int id){
        return mapper.findAll(id);
    }

    @CachePut(value = "stu",key="#student.id")
    public List<Student> update(Student student){
        mapper.updateOne(student);
     return   mapper.findAll(1);
}
    public void updateOne(Student student){
        mapper.updateOne(student);

    }
}
