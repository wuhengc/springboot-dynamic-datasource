package com.whsoftinc.datasource.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whsoftinc.datasource.vo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author: wh
 * @date: 2019/9/7
 */
@Mapper
public interface DeptMapper extends BaseMapper<Dept> {

    Map queryDept(@Param("deptNo") Integer deptNo);
}