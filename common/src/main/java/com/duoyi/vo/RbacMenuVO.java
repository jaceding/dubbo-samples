package com.duoyi.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 菜单栏表
 *
 * @author jaceding
 * @date 2020/6/15
 */
@Data
public class RbacMenuVO implements Serializable {

    private static final long serialVersionUID = -8007855095987088803L;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 前端自己路由的URL
     */
    private String viewUrl;

    /**
     * 菜单请求的接口URL
     */
    private String apiUrl;

    /**
     * 菜单编码
     */
    private String code;

    /**
     * 描述内容
     */
    private String description;
}
