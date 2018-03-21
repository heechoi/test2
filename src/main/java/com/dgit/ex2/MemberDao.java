package com.dgit.ex2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberDao {
	private static long nextId=0;
	private Map<String, Member> map = new HashMap<String, Member>();
	
	public void insert(Member member){
		member.setId(++nextId); //id의 값이 하나씩 증가되는것
		map.put(member.getName(), member);
	}
	
	public Collection<Member> selectAll(){
		return map.values();
	}
	
	public void delete(Member member){
		map.remove(member.getName());
	}
	
	public void update(Member member,String pw){
		Member m = map.get(member.getName());
		if(m.getPassword().equals(pw)){
			m.setPassword(member.getPassword());
			map.put(m.getName(), m);
		}else{
			System.out.println("비밀번호가 일차히지 않습니다.");
		}
		
	}

}
