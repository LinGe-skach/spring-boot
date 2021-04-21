package com.example.gridvo.cloud.dao;

import com.example.gridvo.cloud.entity.vo.UserInfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {

    int insert(UserInfoVO userInfoVO);

    UserInfoVO selectByUserName(@Param("username") String username);

}
