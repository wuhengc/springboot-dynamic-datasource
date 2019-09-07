package com.whsoftinc.datasource.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.whsoftinc.datasource.mapper.DeptMapper;
import com.whsoftinc.datasource.vo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 为了方便没有写service接口
 * @author: wh
 * @date: 2019/9/7
 */
@Service
public class DeptService {

    @Autowired
    private DeptMapper deptMapper;

    /**
     * 查询所有数据
     * @return
     */
    public List<Dept> getList() {
        return deptMapper.selectList(null);
    }

    /**
     * 通过mapper文件SQL进行查询
     * @param deptNo
     * @return
     */
    @DS("test") // 指定数据库连接
    public Map deptMapper(Integer deptNo) {
        return deptMapper.queryDept(deptNo);
    }

    /**
     * 分页查询自定数据库
     * @return
     */
    @DS("master") // 指定数据库连接
    public IPage<Dept> queryPageDept() {
        IPage<Dept> page = new Page(1,2);
        page =  deptMapper.selectPage(page,null);
        return page;
    }

    /**
     * 修改
     * @return
     */
    @DS("master")
    @Transactional//本地事务开启
    public boolean save() {
        Dept vo = new Dept();
        vo.setAvgSal(55.5);
        vo.setCreateDate(new Date());
        vo.setDName("业务部");
        vo.setLoc("上海");
        vo.setDeptNo(2300);
        return deptMapper.insert(vo) > 0;
    }

    /**
     * 删除
     * @return
     */
    @DS("master")
    @Transactional//本地事务开启
    public boolean remove() {
        return deptMapper.deleteById(2300) > 0;
    }

    /**
     * 修改
     * @return
     */
    @DS("test")
    @Transactional//本地事务开启
    public boolean update() {
        Dept vo = new Dept();
        vo.setAvgSal(55.5);
        vo.setCreateDate(new Date());
        vo.setDName("业务部");
        vo.setLoc("上海");
        vo.setDeptNo(2300);
        return deptMapper.updateById(vo) > 0;
    }
}