package com.ziqing.fithearts.mapper;

import com.ziqing.fithearts.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserInfoMapper extends CommonMapper<UserInfo> {

}