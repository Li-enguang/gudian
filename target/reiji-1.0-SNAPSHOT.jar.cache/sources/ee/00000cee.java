package com.lieng.reiji.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lieng.reiji.common.R;
import com.lieng.reiji.common.Utils;
import com.lieng.reiji.pojo.Student;
import com.lieng.reiji.service.StudentService;
import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping({"/student"})
@RestController
/* loaded from: reiji-1.0-SNAPSHOT.jar:BOOT-INF/classes/com/lieng/reiji/controller/StudentController.class */
public class StudentController {
    private static final Logger log = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;

    private static /* synthetic */ Object $deserializeLambda$(SerializedLambda lambda) {
        String implMethodName = lambda.getImplMethodName();
        boolean z = true;
        switch (implMethodName.hashCode()) {
            case -75308287:
                if (implMethodName.equals("getName")) {
                    z = false;
                    break;
                }
                break;
            case 1965090012:
                if (implMethodName.equals("getScore")) {
                    z = true;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
                if (lambda.getImplMethodKind() == 5 && lambda.getFunctionalInterfaceClass().equals("com/baomidou/mybatisplus/core/toolkit/support/SFunction") && lambda.getFunctionalInterfaceMethodName().equals("apply") && lambda.getFunctionalInterfaceMethodSignature().equals("(Ljava/lang/Object;)Ljava/lang/Object;") && lambda.getImplClass().equals("com/lieng/reiji/pojo/Student") && lambda.getImplMethodSignature().equals("()Ljava/lang/String;")) {
                    return (v0) -> {
                        return v0.getName();
                    };
                }
                break;
            case true:
                if (lambda.getImplMethodKind() == 5 && lambda.getFunctionalInterfaceClass().equals("com/baomidou/mybatisplus/core/toolkit/support/SFunction") && lambda.getFunctionalInterfaceMethodName().equals("apply") && lambda.getFunctionalInterfaceMethodSignature().equals("(Ljava/lang/Object;)Ljava/lang/Object;") && lambda.getImplClass().equals("com/lieng/reiji/pojo/Student") && lambda.getImplMethodSignature().equals("()Ljava/lang/Integer;")) {
                    return (v0) -> {
                        return v0.getScore();
                    };
                }
                break;
        }
        throw new IllegalArgumentException("Invalid lambda deserialization");
    }

    @PostMapping
    public R<String> save(HttpServletRequest request, @RequestBody Student student) {
        String name = (String) request.getSession().getAttribute("employeeName");
        student.setUpdateUser(name);
        int score = 0 + (Utils.getValue(student.getShibatiao1()) * 100);
        student.setScore(Integer.valueOf(score + (Utils.getValue(student.getShibatiao2()) * 80) + (Utils.getValue(student.getShibatiao3()) * 10) + (Utils.getValue(student.getJazz1()) * 100) + (Utils.getValue(student.getJazz2()) * 80) + (Utils.getValue(student.getJazz3()) * 10) + (Utils.getValue(student.getBebeshiwu1()) * 100) + (Utils.getValue(student.getBebeshiwu2()) * 80) + (Utils.getValue(student.getBebeshiwu3()) * 10) + (Utils.getValue(student.getBebeshoujiao1()) * 100) + (Utils.getValue(student.getBebeshoujiao2()) * 80) + (Utils.getValue(student.getBebeshoujiao3()) * 10) + (Utils.getValue(student.getMark1()) * 100) + (Utils.getValue(student.getMark2()) * 80) + (Utils.getValue(student.getMark3()) * 10) + (Utils.getValue(student.getLiushi1()) * 100) + (Utils.getValue(student.getLiushi2()) * 80) + (Utils.getValue(student.getLiushi3()) * 10) + (Utils.getValue(student.getGhostnote1()) * 100) + (Utils.getValue(student.getGhostnote2()) * 80) + (Utils.getValue(student.getGhostnote3()) * 10) + (Utils.getValue(student.getGudian1()) * 100) + (Utils.getValue(student.getGudian2()) * 80) + (Utils.getValue(student.getGudian3()) * 10) + (Utils.getValue(student.getJibengong1()) * 100) + (Utils.getValue(student.getJibengong2()) * 80) + (Utils.getValue(student.getJibengong3()) * 10) + (Utils.getValue(student.getPoly1()) * 100) + (Utils.getValue(student.getPoly2()) * 80) + (Utils.getValue(student.getPoly3()) * 10)));
        this.studentService.save(student);
        return R.success("新增学生成功");
    }

    @GetMapping({"/page"})
    public R<Page> page(int page, int pageSize, String name) {
        log.info("page = {},pageSize = {},name = {}", Integer.valueOf(page), Integer.valueOf(pageSize), name);
        Page pageInfo = new Page(page, pageSize);
        LambdaQueryWrapper<Student> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(StringUtils.isNotEmpty(name), (boolean) (v0) -> {
            return v0.getName();
        }, (Object) name);
        queryWrapper.orderByDesc((LambdaQueryWrapper<Student>) (v0) -> {
            return v0.getScore();
        });
        this.studentService.page(pageInfo, queryWrapper);
        return R.success(pageInfo);
    }

    @PutMapping
    public R<String> update(HttpServletRequest request, @RequestBody Student student) {
        String name = (String) request.getSession().getAttribute("employeeName");
        student.setUpdateUser(name);
        int score = 0 + (Utils.getValue(student.getShibatiao1()) * 100);
        student.setScore(Integer.valueOf(score + (Utils.getValue(student.getShibatiao2()) * 80) + (Utils.getValue(student.getShibatiao3()) * 10) + (Utils.getValue(student.getJazz1()) * 100) + (Utils.getValue(student.getJazz2()) * 80) + (Utils.getValue(student.getJazz3()) * 10) + (Utils.getValue(student.getBebeshiwu1()) * 100) + (Utils.getValue(student.getBebeshiwu2()) * 80) + (Utils.getValue(student.getBebeshiwu3()) * 10) + (Utils.getValue(student.getBebeshoujiao1()) * 100) + (Utils.getValue(student.getBebeshoujiao2()) * 80) + (Utils.getValue(student.getBebeshoujiao3()) * 10) + (Utils.getValue(student.getMark1()) * 100) + (Utils.getValue(student.getMark2()) * 80) + (Utils.getValue(student.getMark3()) * 10) + (Utils.getValue(student.getLiushi1()) * 100) + (Utils.getValue(student.getLiushi2()) * 80) + (Utils.getValue(student.getLiushi3()) * 10) + (Utils.getValue(student.getGhostnote1()) * 100) + (Utils.getValue(student.getGhostnote2()) * 80) + (Utils.getValue(student.getGhostnote3()) * 10) + (Utils.getValue(student.getGudian1()) * 100) + (Utils.getValue(student.getGudian2()) * 80) + (Utils.getValue(student.getGudian3()) * 10) + (Utils.getValue(student.getJibengong1()) * 100) + (Utils.getValue(student.getJibengong2()) * 80) + (Utils.getValue(student.getJibengong3()) * 10) + (Utils.getValue(student.getPoly1()) * 100) + (Utils.getValue(student.getPoly2()) * 80) + (Utils.getValue(student.getPoly3()) * 10)));
        this.studentService.updateById(student);
        return R.success("学生信息修改成功");
    }

    @GetMapping({"/{id}"})
    public R<Student> getById(@PathVariable Long id) {
        log.info("根据id查询学生信息...");
        Student student = this.studentService.getById(id);
        if (student != null) {
            return R.success(student);
        }
        return R.error("没有查询到对应学生信息");
    }

    @RequestMapping(value = {"/{id}"}, method = {RequestMethod.DELETE})
    public R<String> delete(@PathVariable Long id) {
        this.studentService.removeById((Serializable) id);
        return R.success("学生信息删除成功");
    }
}