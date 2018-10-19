package com.example.boot.mbr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boot.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired MemberMapper mp;
	@Override
	public String countAll() {
		return mp.countAll();
	}
	
}
