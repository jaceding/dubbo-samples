package com.duoyi.service;

import com.duoyi.vo.RbacMenuVO;

import java.util.List;

/**
 * 菜单栏业务层接口
 *
 * @author jaceding
 * @date 2020/6/15
 */
public interface RbacMenuService {

    /**
     * 根据用户id查询用户的所有菜单栏
     *
     * @param userId 用户id
     * @return 用户的所有菜单栏
     */
    List<RbacMenuVO> getRbacMenuListByUserId(Integer userId);
}
