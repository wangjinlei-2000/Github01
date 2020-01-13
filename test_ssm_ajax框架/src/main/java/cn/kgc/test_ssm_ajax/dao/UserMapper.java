package cn.kgc.test_ssm_ajax.dao;

import cn.kgc.test_ssm_ajax.pojo.User;

public interface UserMapper {
    public User getUserByUserCode(String userCode);
}
