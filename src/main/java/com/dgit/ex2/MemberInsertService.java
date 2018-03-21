package com.dgit.ex2;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberInsertService {
	@Autowired
	MemberDao dao;
	
	public void insert(Member member){
		/*MemberDao dao = new MemberDao(); ctx파일에서 싱글텀으로 하나 생성하므로 그냥 선언만 해줌*/
		dao.insert(member);
	}

	

}
