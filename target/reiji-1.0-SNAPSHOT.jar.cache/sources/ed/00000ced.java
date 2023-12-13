package com.lieng.reiji.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lieng.reiji.common.R;
import com.lieng.reiji.pojo.Employee;
import com.lieng.reiji.service.EmployeeService;
import java.lang.invoke.SerializedLambda;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping({"/employee"})
@RestController
/* loaded from: reiji-1.0-SNAPSHOT.jar:BOOT-INF/classes/com/lieng/reiji/controller/EmployeeController.class */
public class EmployeeController {
    private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    private EmployeeService employeeService;

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
            case 98245393:
                if (implMethodName.equals("getId")) {
                    z = true;
                    break;
                }
                break;
            case 1812186700:
                if (implMethodName.equals("getUsername")) {
                    z = true;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
                if (lambda.getImplMethodKind() == 5 && lambda.getFunctionalInterfaceClass().equals("com/baomidou/mybatisplus/core/toolkit/support/SFunction") && lambda.getFunctionalInterfaceMethodName().equals("apply") && lambda.getFunctionalInterfaceMethodSignature().equals("(Ljava/lang/Object;)Ljava/lang/Object;") && lambda.getImplClass().equals("com/lieng/reiji/pojo/Employee") && lambda.getImplMethodSignature().equals("()Ljava/lang/String;")) {
                    return (v0) -> {
                        return v0.getName();
                    };
                }
                break;
            case true:
                if (lambda.getImplMethodKind() == 5 && lambda.getFunctionalInterfaceClass().equals("com/baomidou/mybatisplus/core/toolkit/support/SFunction") && lambda.getFunctionalInterfaceMethodName().equals("apply") && lambda.getFunctionalInterfaceMethodSignature().equals("(Ljava/lang/Object;)Ljava/lang/Object;") && lambda.getImplClass().equals("com/lieng/reiji/pojo/Employee") && lambda.getImplMethodSignature().equals("()Ljava/lang/Long;")) {
                    return (v0) -> {
                        return v0.getId();
                    };
                }
                if (lambda.getImplMethodKind() == 5 && lambda.getFunctionalInterfaceClass().equals("com/baomidou/mybatisplus/core/toolkit/support/SFunction") && lambda.getFunctionalInterfaceMethodName().equals("apply") && lambda.getFunctionalInterfaceMethodSignature().equals("(Ljava/lang/Object;)Ljava/lang/Object;") && lambda.getImplClass().equals("com/lieng/reiji/pojo/Employee") && lambda.getImplMethodSignature().equals("()Ljava/lang/Long;")) {
                    return (v0) -> {
                        return v0.getId();
                    };
                }
                break;
            case true:
                if (lambda.getImplMethodKind() == 5 && lambda.getFunctionalInterfaceClass().equals("com/baomidou/mybatisplus/core/toolkit/support/SFunction") && lambda.getFunctionalInterfaceMethodName().equals("apply") && lambda.getFunctionalInterfaceMethodSignature().equals("(Ljava/lang/Object;)Ljava/lang/Object;") && lambda.getImplClass().equals("com/lieng/reiji/pojo/Employee") && lambda.getImplMethodSignature().equals("()Ljava/lang/String;")) {
                    return (v0) -> {
                        return v0.getUsername();
                    };
                }
                break;
        }
        throw new IllegalArgumentException("Invalid lambda deserialization");
    }

    @PostMapping({"/login"})
    public R<Employee> login(HttpServletRequest request, @RequestBody Employee employee) {
        String password = employee.getPassword();
        String password2 = DigestUtils.md5DigestAsHex(password.getBytes());
        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq((v0) -> {
            return v0.getUsername();
        }, employee.getUsername());
        Employee emp = this.employeeService.getOne(queryWrapper);
        if (emp == null) {
            return R.error("登录失败");
        }
        if (!emp.getPassword().equals(password2)) {
            return R.error("登录失败");
        }
        if (emp.getStatus().intValue() == 0) {
            return R.error("账号已禁用");
        }
        request.getSession().setAttribute("employee", emp.getId());
        request.getSession().setAttribute("employeeName", emp.getName());
        return R.success(emp);
    }

    @PostMapping({"/logout"})
    public R<String> logout(HttpServletRequest request) {
        request.getSession().removeAttribute("employee");
        request.getSession().removeAttribute("employeeName");
        return R.success("退出成功");
    }

    @PostMapping
    public R<String> save(HttpServletRequest request, @RequestBody Employee employee) {
        Long empId = (Long) request.getSession().getAttribute("employee");
        if (empId.longValue() != 1) {
            return R.error("仅管理员可添加");
        }
        employee.setPassword(DigestUtils.md5DigestAsHex(employee.getPassword().getBytes()));
        String name = (String) request.getSession().getAttribute("employeeName");
        employee.setCreateUser(name);
        employee.setUpdateUser(name);
        this.employeeService.save(employee);
        return R.success("新增员工成功");
    }

    @GetMapping({"/page"})
    public R<Page> page(int page, int pageSize, String name) {
        log.info("page = {},pageSize = {},name = {}", Integer.valueOf(page), Integer.valueOf(pageSize), name);
        Page pageInfo = new Page(page, pageSize);
        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(StringUtils.isNotEmpty(name), (boolean) (v0) -> {
            return v0.getName();
        }, (Object) name);
        queryWrapper.notLike(true, (boolean) (v0) -> {
            return v0.getId();
        }, (Object) 1);
        queryWrapper.orderByDesc((LambdaQueryWrapper<Employee>) (v0) -> {
            return v0.getId();
        });
        this.employeeService.page(pageInfo, queryWrapper);
        return R.success(pageInfo);
    }

    @PutMapping
    public R<String> update(HttpServletRequest request, @RequestBody Employee employee) {
        Long empId = (Long) request.getSession().getAttribute("employee");
        if (empId.longValue() != 1) {
            return R.error("仅管理员可修改");
        }
        employee.setPassword(DigestUtils.md5DigestAsHex(employee.getPassword().getBytes()));
        String name = (String) request.getSession().getAttribute("employeeName");
        employee.setCreateUser(name);
        employee.setUpdateUser(name);
        this.employeeService.updateById(employee);
        return R.success("员工信息修改成功");
    }

    @GetMapping({"/{id}"})
    public R<Employee> getById(@PathVariable Long id) {
        log.info("根据id查询员工信息...");
        Employee employee = this.employeeService.getById(id);
        if (employee != null) {
            return R.success(employee);
        }
        return R.error("没有查询到对应员工信息");
    }
}