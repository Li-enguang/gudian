package com.lieng.reiji.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lieng.reiji.pojo.Employee;
import com.lieng.reiji.service.EmployeeService;
import com.lieng.reiji.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

/**
* @author Admin
* @description 针对表【employee(员工信息)】的数据库操作Service实现
* @createDate 2023-11-25 15:46:52
*/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
    implements EmployeeService{

}




