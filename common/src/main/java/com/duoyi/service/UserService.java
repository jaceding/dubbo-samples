package com.duoyi.service;

import com.duoyi.vo.UserVO;

/**
 * 用户 业务层接口
 *
 * @author jaceding
 * @date 2020/6/15
 */
public interface UserService {

    /**
     * 根据用户id获取用户信息
     *
     * @param id 用户id
     * @return com.duoyi.vo.UserVO
     */
    UserVO getUserInfoById(Integer id);
}
