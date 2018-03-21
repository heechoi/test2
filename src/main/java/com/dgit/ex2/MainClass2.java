package com.dgit.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass2 {

	public static void main(String[] args) throws IOException {
		GenericXmlApplicationContext ctx 
			= new GenericXmlApplicationContext("classpath:applicationCtx2.xml");
		MemberInsertService insertService = ctx.getBean(MemberInsertService.class);
		MemberInfoPrinter infoPrinter = ctx.getBean(MemberInfoPrinter.class);
		MemberUpdateService updateService = ctx.getBean(MemberUpdateService.class);
		MemberDeleteService deleteService = ctx.getBean(MemberDeleteService.class);
		/*
		Member member = new Member();
		member.setName("이쁘니");
		member.setPassword("1234");
		
		insertService.insert(member);
		

		Member member2 = new Member();
		member2.setName("홍길동");
		member2.setPassword("1111");
		
		insertService.insert(member2);
		
		infoPrinter.printAll();
		*/
		
		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			System.out.println("명령어를 입력하세요.");
			String command = reader.readLine();
			if(command.equalsIgnoreCase("exit")){
				System.out.println("종료합니다.");
				break;
			}else if(command.startsWith("new")){ //new로 단어가 시작하는지, 시작하면 true 반환 
				String[] arr = command.split(" ");//space를 기준으로 쪼갠다
				Member member = new Member();
				member.setName(arr[1]);
				member.setPassword(arr[2]);
				
				insertService.insert(member);
				
				System.out.println("등록했습니다.\n");
			
			}else if(command.startsWith("list")){
				infoPrinter.printAll();
			}else if(command.startsWith("change")){
				String[] arr = command.split(" ");
				
				Member member = new Member();
				member.setName(arr[1]);
				member.setPassword(arr[3]);
				
				updateService.update(member,arr[2]);
				
				System.out.println("변경되었습니다.\n");
			}else if(command.startsWith("remove")){
				String[] arr = command.split(" ");
				Member member = new Member();
				member.setName(arr[1]);
				deleteService.delete(member);
				System.out.println("삭제되었습니다.\n");
			}
		}
		
		ctx.close();

	}

}
