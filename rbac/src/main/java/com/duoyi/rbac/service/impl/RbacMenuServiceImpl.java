package com.duoyi.rbac.service.impl;

import com.duoyi.service.RbacMenuService;
import com.duoyi.vo.RbacMenuVO;
import org.apache.dubbo.config.annotation.Service;

import java.util.*;

/**
 * 菜单栏业务层实现
 *
 * @author jaceding
 * @date 2020/6/15
 */
@Service(version = "1.0.0")
public class RbacMenuServiceImpl implements RbacMenuService {

    /**
     * 模拟数据库
     */
    private static Map<Integer, List<RbacMenuVO>> db = new HashMap<>();

    @Override
    public List<RbacMenuVO> getRbacMenuListByUserId(Integer userId) {
        if (db.containsKey(userId)) {
            return db.get(userId);
        }
        List<RbacMenuVO> rbacMenuVOList = genRbacMenuVOList(10);
        db.put(userId, rbacMenuVOList);
        return rbacMenuVOList;
    }

    /**
     * 生成指定数量的菜单栏
     *
     * @param size 菜单栏数量
     * @return 菜单栏列表
     */
    private List<RbacMenuVO> genRbacMenuVOList(Integer size) {
        List<RbacMenuVO> rbacMenuVOList = new ArrayList<>();
        RbacMenuVO rbacMenuVO;
        Random random;
        for (int i = 0; i < size; i++) {
            rbacMenuVO = new RbacMenuVO();
            random = new Random();
            rbacMenuVO.setName("菜单" + random.nextInt(size));
            rbacMenuVO.setViewUrl("ViewUrl" + random.nextInt(10000));
            rbacMenuVO.setApiUrl("ApiUrl" + random.nextInt(10000));
            rbacMenuVO.setCode(String.valueOf(random.nextInt(100)));
            rbacMenuVO.setDescription(rbacMenuVO.getName() + "的描述");
            rbacMenuVOList.add(rbacMenuVO);
        }
        return rbacMenuVOList;
    }
}
