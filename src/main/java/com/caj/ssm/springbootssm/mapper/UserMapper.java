package com.caj.ssm.springbootssm.mapper;

import com.caj.ssm.springbootssm.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper
{
    @Insert("insert into t_user(user_name, age) values(#{userName}, #{age})")
    void addUser(User user);
}
