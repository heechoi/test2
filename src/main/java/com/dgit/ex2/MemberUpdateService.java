package com.dgit.ex2;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberUpdateService {
	@Autowired
	MemberDao dao;
	
	public void update(Member member,String pw){
		
		dao.update(member,pw);
	}
}
