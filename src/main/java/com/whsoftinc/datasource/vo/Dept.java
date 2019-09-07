package com.whsoftinc.datasource.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体类
 * @author: wh
 * @date: 2019/9/7
 */
@Data
public class Dept implements Serializable {

    private Integer deptNo;
    private Double avgSal;
    private Date createDate;
    private String dName;
    private String loc;
}
