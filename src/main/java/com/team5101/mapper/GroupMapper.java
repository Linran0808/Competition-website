package com.team5101.mapper;


import com.team5101.pojo.Group;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GroupMapper {
    //创建小组
    void addGroup(Group group);
    //查询小组是否重名
    Integer findGname(String g_name);
    //查询所有小组信息
    List<Group> allGroups();
    //查询成员是否有小组
    Integer GroupInfoBySno(String g_sno);
    //查询小组所有成员
    List<Group> findAllMember(String g_sn);
    //加入小组
    void joinGroup(Group group);
    //根据邀请码查询小组
    Group findGroupByCode(Group group);
}
