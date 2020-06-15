package com.duoyi.user.service.impl;

import com.duoyi.service.RbacMenuService;
import com.duoyi.service.UserService;
import com.duoyi.vo.UserVO;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 用户业务层实现
 *
 * @author jaceding
 * @date 2020/6/15
 */
@Component
@Service
public class UserServiceImpl implements UserService {

    @Reference(version = "1.0.0")
    RbacMenuService rbacMenuService;

    /**
     * 模拟数据库
     */
    private static Map<Integer, UserVO> db = new HashMap<>();

    @Override
    public UserVO getUserInfoById(Integer id) {
        if (db.containsKey(id)) {
            return db.get(id);
        }
        UserVO userVO = genUserInfo(id);
        db.put(id, userVO);
        return userVO;
    }

    /**
     * 生成用户信息
     *
     * @param userId 用户id
     * @return 用户信息
     */
    private UserVO genUserInfo(Integer userId) {
        Random random = new Random();
        UserVO userVO = new UserVO();
        userVO.setUserName("张三" + random.nextInt(100));
        userVO.setAge(random.nextInt(40));
        userVO.setRbacMenuVOList(rbacMenuService.getRbacMenuListByUserId(userId));
        return userVO;
    }
}
