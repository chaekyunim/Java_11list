package com.biz.list.servic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.list.model.BookVO;

public class BookServiceImpV1 {

	
	//입력받은 도서 정보 리스트 저장할 준비
	List<BookVO> bookList;
	
	// 생성자 메서드
	// scan과 bookList를 사아ㅛㅇ할수 있도록 초기화, 생성
	public BookServiceImpV1() {
		
		scan = new Scanner(System.in);
		
		// 클래스를 사용하려고 코드를 작성했는데
		// 오류가 난다
		// 콘트롤 쉬프트 + 0 : 자동 임포트 실행
		bookList = new ArrayList<BookVO>();
		
		//service.input(30); 30개 데이터를 입력받아라
		public void input(input)
		
		
		System.out.print("도서번호> ");
		String strNum = scan.nextLine();
		
		System.out.print("도서명> ");
		String str = scan.nextLine();
		
		System.out.print(" 저자> ");
		String strWriter = scan.nextLine();
		
		/*
		 * 이 앱에서 사용자가 데이터를 입력하는 중에
		 * 가격이나, 출판연도를 숫자가 아닌 문자열을
		 * 입력하게 되면 문자열을 숫자로 바꾸 는 과정ㅇ에서
		 * 넘버포멧익셉션이 발생할 것이다.
		 * 
		 * 이 앱에서 넘버포멧익셉션은 발생할 확율이
		 * 매우(0.0000001%) 높다
		 * 
		 * 이럴경우 사용자가 입력하는 과정에서
		 * 약간의 실ㄹ만 하게 되어도
		 * 앞에서 입력했던 모든 데이터를 잃게 된다
		 * 
		 * 개발자 입장에서는 별다른 의미가 없고
		 * 추가 코드가 없어서 좋겠지만
		 * 사용자 입장에서는 매우 불편한 코드가 괸다.
		 * 
		 * 사용자 입장에서 좋은 코드를 작성하기 위해
		 * 개발자는 이런 ㅓ상황에서
		 * 발생할수있는 익셉션을 예측하고
		 * 적절한 해결방법을 만드러양 한다
		 * = 익셉션 핸들링 이라고 한다
		 * 
		 * 1. 만약 사용자가 가격이나 풀판연도를 문자열을 포함하여
		 * 입력할경우 안내 메시지를 보여주고
		 * 다음값을 입력하도록
		 * 유도하는 코드를 작성
		 * 
		 */
		
		
		System.out.print("출판사> ");
		String strComp = scan.nextLine();
		
		System.out.print("가격> ");
		String strPrice = scan.nextLine();
		
		int intPricce = 0; 
		intPrice = Interger.valueOf(str)
		try { 
			//문자열형 숫자를 정수로 바꾸는 과정에서
			// 발생할수 잇는 exception
			// NumberformatException
		     intPricce = Integer.valueOf(strPrice);
		}catch (Exception e) {
			System.out.println("가격에 문자열이 포함됨");
			System.out.println("현재 도서 정보는 추가되지 않음");
			throw new
			
		}
		
		
		
		System.out.print("출판연도> ");
		String strYear = scan.nextLine();
		
        int intPrice = 0; 
        /*
         * 예외처리
         * 사용자가 앱을 사용하는 중에 
         * 데이터를 입력하거나 어떤 연산을 수행할때
         * 런 타임 에러가 발생할 확률ㄹ이 1/100000000라도
         *  있다면 그 앱은 사용자에게
         *  상당한 스트뤠스 를 줄수 있따
         *  개발자는 그러한 상황을 만들지 않기 위해
         *  예측할수 있는 예외가 발생할 코드가
         *  예외 처리를 해주어야 한다.
         *  
         *  예외처리는 개발의 필수 항목으로 인식하자
         */
        /*
         * 예외가 발생할수 있는 코드는 트라이 {    }에 작성한다.
         * 만약 예외가 발생할 경우 처리할 콛느
         *  캣치() {  }에 작성한다.
         */
		
		try { 
		     intPricce = Integer.valueOf(strPrice);
		}catch (Exception e) {
			System.out.println("가격에 문자열이 포함됨");
			System.out.println("현재 도서 정보는 추가되지 않음");
		}
		

		//키보드로 입력받은 데이터르 vo를 생성하여 저장
		BookVO.bookVO = new BookVO();
		bookVo.setStrNum(strNum);
		bookVo.setStrNum(strNum);
		bookVo.setStrNum(strNum);
		bookVo.setStrNum(strNum);
		
		bookVo.setStrNum(strNum);
		bookVo.setStrNum(strNum);
		
		// 2. 생성한 vo를 bookList 에 추가
		bookList.add(bookVO);
		return;
		
		System.out.println("===================================");
		System.out.println("도서 정보 일람표"
		System.out.println("===================================");
		System.out.println("ISBN|t도서명|t출판사|t저자|t가격|t
				
	    int nSize = bookList.size();
	    for(int i = 0 ; i < nSize ; i++) {
	    	BookVO vo = bookList.get(i);
	    	
	    	System.out.print(vo.getStrNum + " |%t");
	    	System.out.print(vo.getStrName + " |%t");
	    	System.out.print(vo.getStrNum + " |%t");
	    	System.out.print(vo.getStrNum + " |%t");
	    	System.out.print(vo.getStrNum + " |%t");
	    			
	    		
	    	public void view(int index);
	    	
	    	System.out.println("==============================================");
	    	System.out.println("ISBN : " + bookList.get(index).getStrNum());
	    	System.out.println("도서명 : " + bookList.get(index).getStrName());
	    	System.out.println("출판사 : " + bookList.get(index).getStrWr());
	    	System.out.println("저자 : " + bookList.get(index).getStrNum());
	    	System.out.println("가격 : " + bookList.get(index).getStrNum());
	    	System.out.println("출판연도 : " + bookList.get(index).getStrNum());
	    	System.out.println("=================================================");
	    	
	    	//도서명으로 검색하기
	    	public void view(String strName) {
	    		int nSize = bookList.size();
	    		for(int i = 0 ; i <nSize; i++) {
	    			
	    		if (bookList.get(i).getStrName().equalsTgnorecase
	    				this.view(i);
	    		break; //최최로 발견된 1개정보만 확인하고 마침
	    		}
	    	}
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	    		
	    		
	}
}
