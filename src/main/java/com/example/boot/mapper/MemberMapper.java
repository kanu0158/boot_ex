package com.example.boot.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
	public String countAll();
}
