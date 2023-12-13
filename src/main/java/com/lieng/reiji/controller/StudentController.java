package com.lieng.reiji.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lieng.reiji.common.R;
import com.lieng.reiji.common.Utils;
import com.lieng.reiji.pojo.Student;
import com.lieng.reiji.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public R<String> save(HttpServletRequest request, @RequestBody Student student) {

        //获得当前登录用户的id
//        Long empId = (Long) request.getSession().getAttribute("employee");

        String name = (String) request.getSession().getAttribute("employeeName");
        student.setUpdateUser(name);

        int score = 0;
        score += Utils.getValue(student.getShibatiao1()) * 100;
        score += Utils.getValue(student.getShibatiao2()) * 80;
        score += Utils.getValue(student.getShibatiao3()) * 10;
        score += Utils.getValue(student.getJazz1()) * 100;
        score += Utils.getValue(student.getJazz2()) * 80;
        score += Utils.getValue(student.getJazz3()) * 10;
        score += Utils.getValue(student.getBebeshiwu1()) * 100;
        score += Utils.getValue(student.getBebeshiwu2()) * 80;
        score += Utils.getValue(student.getBebeshiwu3()) * 10;
        score += Utils.getValue(student.getBebeshoujiao1()) * 100;
        score += Utils.getValue(student.getBebeshoujiao2()) * 80;
        score += Utils.getValue(student.getBebeshoujiao3()) * 10;
        score += Utils.getValue(student.getMark1()) * 100;
        score += Utils.getValue(student.getMark2()) * 80;
        score += Utils.getValue(student.getMark3()) * 10;
        score += Utils.getValue(student.getLiushi1()) * 100;
        score += Utils.getValue(student.getLiushi2()) * 80;
        score += Utils.getValue(student.getLiushi3()) * 10;
        score += Utils.getValue(student.getGhostnote1()) * 100;
        score += Utils.getValue(student.getGhostnote2()) * 80;
        score += Utils.getValue(student.getGhostnote3()) * 10;
        score += Utils.getValue(student.getGudian1()) * 100;
        score += Utils.getValue(student.getGudian2()) * 80;
        score += Utils.getValue(student.getGudian3()) * 10;
        score += Utils.getValue(student.getJibengong1()) * 100;
        score += Utils.getValue(student.getJibengong2()) * 80;
        score += Utils.getValue(student.getJibengong3()) * 10;
        score += Utils.getValue(student.getPoly1()) * 100;
        score += Utils.getValue(student.getPoly2()) * 80;
        score += Utils.getValue(student.getPoly3()) * 10;

        student.setScore(score);

        studentService.save(student);

        return R.success("新增学生成功");
    }

    /**
     * 学生信息分页查询
     *
     * @param page
     * @param pageSize
     * @param name
     * @return
     */
    @GetMapping("/page")
    public R<Page> page(int page, int pageSize, String name) {
        log.info("page = {},pageSize = {},name = {}", page, pageSize, name);

        //构造分页构造器
        Page pageInfo = new Page(page, pageSize);

        //构造条件构造器
        LambdaQueryWrapper<Student> queryWrapper = new LambdaQueryWrapper();
        //添加过滤条件
        queryWrapper.like(StringUtils.isNotEmpty(name), Student::getName, name);
        //添加排序条件
        queryWrapper.orderByDesc(Student::getScore);

        //执行查询
        studentService.page(pageInfo, queryWrapper);

        return R.success(pageInfo);
    }

    @PutMapping
    public R<String> update(HttpServletRequest request, @RequestBody Student student) {
        String name = (String) request.getSession().getAttribute("employeeName");
        student.setUpdateUser(name);

        int score = 0;
        score += Utils.getValue(student.getShibatiao1()) * 100;
        score += Utils.getValue(student.getShibatiao2()) * 80;
        score += Utils.getValue(student.getShibatiao3()) * 10;
        score += Utils.getValue(student.getJazz1()) * 100;
        score += Utils.getValue(student.getJazz2()) * 80;
        score += Utils.getValue(student.getJazz3()) * 10;
        score += Utils.getValue(student.getBebeshiwu1()) * 100;
        score += Utils.getValue(student.getBebeshiwu2()) * 80;
        score += Utils.getValue(student.getBebeshiwu3()) * 10;
        score += Utils.getValue(student.getBebeshoujiao1()) * 100;
        score += Utils.getValue(student.getBebeshoujiao2()) * 80;
        score += Utils.getValue(student.getBebeshoujiao3()) * 10;
        score += Utils.getValue(student.getMark1()) * 100;
        score += Utils.getValue(student.getMark2()) * 80;
        score += Utils.getValue(student.getMark3()) * 10;
        score += Utils.getValue(student.getLiushi1()) * 100;
        score += Utils.getValue(student.getLiushi2()) * 80;
        score += Utils.getValue(student.getLiushi3()) * 10;
        score += Utils.getValue(student.getGhostnote1()) * 100;
        score += Utils.getValue(student.getGhostnote2()) * 80;
        score += Utils.getValue(student.getGhostnote3()) * 10;
        score += Utils.getValue(student.getGudian1()) * 100;
        score += Utils.getValue(student.getGudian2()) * 80;
        score += Utils.getValue(student.getGudian3()) * 10;
        score += Utils.getValue(student.getJibengong1()) * 100;
        score += Utils.getValue(student.getJibengong2()) * 80;
        score += Utils.getValue(student.getJibengong3()) * 10;
        score += Utils.getValue(student.getPoly1()) * 100;
        score += Utils.getValue(student.getPoly2()) * 80;
        score += Utils.getValue(student.getPoly3()) * 10;
        student.setScore(score);

        studentService.updateById(student);

        return R.success("学生信息修改成功");
    }

    @GetMapping("/{id}")
    public R<Student> getById(@PathVariable Long id) {
        log.info("根据id查询学生信息...");
        Student student = studentService.getById(id);
        if (student != null) {
            return R.success(student);
        }
        return R.error("没有查询到对应学生信息");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public R<String> delete(@PathVariable Long id) {

        studentService.removeById(id);

        return R.success("学生信息删除成功");
    }

}
