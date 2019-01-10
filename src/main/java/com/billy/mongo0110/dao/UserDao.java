package com.billy.mongo0110.dao;

import com.billy.mongo0110.entity.UserEntity;

public interface UserDao {
    public void saveUser(UserEntity user);

    public UserEntity findUserByUserName(String userName);

    public int updateUser(UserEntity user);

    public void deleteUserById(Long id);
}
