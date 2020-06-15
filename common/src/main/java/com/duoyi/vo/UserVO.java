package com.duoyi.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 用户Vo
 *
 * @author jaceding
 * @date 2020/6/15
 */
@Data
public class UserVO implements Serializable {

    private static final long serialVersionUID = -5923833138799838592L;
    
    /**
     * 用户名
     */
    private String userName;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 用户权限列表
     */
    private List<RbacMenuVO> rbacMenuVOList;
}
