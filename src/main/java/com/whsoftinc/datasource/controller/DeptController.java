package com.whsoftinc.datasource.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.whsoftinc.datasource.service.DeptService;
import com.whsoftinc.datasource.vo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author: wh
 * @date: 2019/9/7
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/deptList")
    public List<Dept> deptList() {
        return deptService.getList();
    }

    @GetMapping("/queryPageDept")
    public IPage<Dept> queryPageDept() {
        return deptService.queryPageDept();
    }

    @GetMapping("/remove")
    public boolean remove() {
        return deptService.remove();
    }

    @GetMapping("/save")
    public boolean save() {
        return deptService.save();
    }

    @GetMapping("/update")
    public boolean update() {
        return deptService.update();
    }

    @GetMapping("/deptMapper")
    public Map deptMapper() {
        return deptService.deptMapper(1003);
    }
}