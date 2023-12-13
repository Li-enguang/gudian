package com.lieng.reiji.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lieng.reiji.pojo.Student;
import com.lieng.reiji.service.StudentService;
import com.lieng.reiji.mapper.StudentMapper;
import org.springframework.stereotype.Service;

/**
* @author Admin
* @description 针对表【student(学生信息)】的数据库操作Service实现
* @createDate 2023-11-25 17:44:47
*/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
    implements StudentService{

}




