package com.ziqing.fithearts.mapper;

import com.ziqing.fithearts.pojo.PersonneInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PersonneInfoMapper extends CommonMapper<PersonneInfo> {

}