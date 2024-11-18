package com.lieng.reiji.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lieng.reiji.pojo.Teacher;
import com.lieng.reiji.service.TeacherService;
import com.lieng.reiji.mapper.TeacherMapper;
import org.springframework.stereotype.Service;

/**
* @author lieng
* @description 针对表【teacher(教师信息)】的数据库操作Service实现
* @createDate 2024-01-06 14:29:49
*/
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher>
    implements TeacherService{

}




