package com.biz.list.servic;

import com.biz.list_exec.BookServiceImpv1;
import com.biz.list_exec.인터페이스에;

/*
 * @author master
 * @version 2
 * 처음 설계당시에 없던 인풋  인트 카운트를 추가한다.
 * 인풋 인트 카운트 메서드는 다수의 도서정보를 입력받을때
 * 사아ㅛㅇ할 메서트로 설정한다
 */
public  BookService {

	
	// 도서정보를 입력받아서 리스트로 생성할 메서드
			public void input();
			
			//입력된 도서리스트를 콘솔 보일 메서트
			public void list();
					
			//도서 1권의 정보를 확인한 메서드
			//몇번째인가를 알려주고 해당하는 인덱스의
			// 도서정보를 검색
			public void view(int index);
			
			// 도서이름으로 검색해서
			// 해당하느 이름이 있으면
			// 도서 정보를 보여주느 메서드
			// 1개의 도서만 보여주는 조건
			public void view(String strName);
			
			BookService bs = new BookServiceImpv1();
			
			// bs.input(); // 1개의 도서정보를 입력받아라
			//input(int count method를 호출해서 사용하려면
			// bs 객체를 BookServiceImpV1 클래스로 형 변화을 해야한다
			// 이 코드로 인해서 인터페이스르 활용하는 의미가
			// 일부 퇴색한다
			// 그래서
			// 만약 인풋 인트 카운트처럼 처음에 인터페이스를 만들때 
			// 없던 메서트를 사용하려면
			// 가급적 설계자에게 요청하며
			인터페이스에 등록하도록 하는 것이 좋은 방법
		 	
			((BookServiceImpV1)bs).input(3);
			
			bs.input(3);
			bs.list();
			
			bs.view();
			
	
}
