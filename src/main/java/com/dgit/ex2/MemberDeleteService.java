package com.dgit.ex2;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberDeleteService {
	@Autowired
	MemberDao dao;
	
	public void delete(Member member){
		dao.delete(member);
	}
}
