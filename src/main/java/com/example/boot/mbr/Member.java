package com.example.boot.mbr;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data @Lazy
public class Member {
	private String  MEMBER_ID, PASS, NAME, BIRTH, PHONE, NICK, SEX, E_MAIL,	 join_date;
}
