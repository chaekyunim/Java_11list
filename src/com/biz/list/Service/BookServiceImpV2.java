package com.biz.list.Service;

import java.security.Provider.Service;
import java.util.List;
import java.util.Scanner;

import com.biz.list.model.BookVO;
import com.biz.list.service.BookService;

/*
 * 키보드에서 도서정보를 입력바다서
 * list에 추가하고 
 * 목록보기 정보보기
 * 기능이 업그레이드된 코드  
 */

public class BookServiceImpV2 extends BookService {

	/*
	 * scan 객체와 북리스 객체를 선언은 했는데
	 * 아직 생성 사용할 주니박 안된상태
	 * 이 클래스의 어떤 메서든지 호출하면
	 * nullpointException이 발생할 것이다.
	 * 
	 * scan과 bookList를 생성, 초기화 하는 코드를
	 * 클래스의 생서앚에 작성한다.
	 * 
	 */
	  // 1. 예외 상황이 발생할 코드를작성
	  // 2. 실행해서 얘ㅖ외 상황이 발생하도록 테스트하기
	  // 3. 여기에서 NumberFormatException 이 발생하을 하더라
	  // 4. 
	 
     public BookServiceImpV2( ) {
    	 scan = new Service
     }
	
     try {
    	 intPrince = Integer.valueOf(strPrice);
     } catch (Exception e) {
     
     /*
      * 만약 도서가격을 입력하는 도중에
      * NumberFormat... 예외가 발생하면
      * 현재 입력하던 도서정보를
      * 다시 입력하도록 코드를 작성
      */
     /*
      * 키보드로 부터 값을 입력받고
      * 변환을 하느 등으 ㅣ코드가
      * for() {} 반복문으로 감싸져 있따면
      * for 반복문을 재 시작하는 continue 키워드를
      * 사용하여 다시 입력을 시도 하도록 할 수 있다
      * 
      * 하지만.
      * 지금 작성한 인풋() 메서드는
      * for 반복문에서 별도로 호출한 메서드이기 때문에
      * continue 키워드를 사용할수 없다.
      * 
      * 방법은
      * 현재 인풋() 메서드에서 exception이 발생을 하면
      * 호출한 곳에 exception이 발생 했다면 알려주고
      * 그곳에서 처리 하도록 하면 된다.
      *
      */
    System.out.println("!! 가격은 숫자만 입력하세요??");
    
    //throw : 나(input)() method 를 호출한 곳으로
    // 예외를 던진다.,
    // 현재 발생한 예외를 네가 대신 처리해 달라
    //라고 요청
	
    
    
        // 문자열형 숫자를 수사로 변경하는 과정에서
 		// 예외 
 		// 
 		//
 		//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan;
		List<BookVO> bookList;
		
		
		System.out.print("도서번호> ");
		String strNum = scan.nextLine();
		
		System.out.print("도서명> ");
		String str = scan.nextLine();
		
		System.out.print(" 저자> ");
		String strWriter = scan.nextLine();
		
		System.out.print("출판사> ");
		String strComp = scan.nextLine();
		
		System.out.print("가격> ");
		String strPrice = scan.nextLine();
		
		System.out.print("출판연도> ");
		String strPrice = scan.nextLine();
		
		
		
		int intPricce = 0; 
		String s = "";
		try {
			/*
			 * intPubYear 변수를 try{} 안에서 선을 하게 되면
			 * 만약 정상적으로 코드가 수행되고
			 * try 다음줄 명령코드를 실행하는 과정에서
			 * intPubYear 변수를 참조 할수 없다.
			 * 
			 * 반드시 try가 시작되기전에
			 * 변수를 선언하고 clear를 한 상태에서
			 * try 내 에서 변수에 어떤 값을 저장하도록
			 * 코드가 작성 되어야 한다
			 */
			
			intPrice = Interger.valueOf(strPubYear);
		}
		catch() {
			System.out.println("연도는 숫자로만 입력!!!!");
			
			
			while(true) {
				System.out.print("연도를 다시 입력(종료:-1) >");
				String s1 = scan.nextLine();
				try {
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		@Override
		public void input(int count) {
			for(int i = 0 ; i < count ; i++) {
				System.out.println("=================");
				System.out.println((i+1)"");
				System.out.println("-----------------");
			try {
				this.intput();
				 catch (Exception e) {
					 System.out.println("데이터를 다시 입력하세요");
				 }
				 
			}
				
				
				
			}
			@Override 
			public void veiw(int list) {
				for(int i = 0 ; i < count ; i++);
				    this.input();
				    BookVO vo = bookList.get(index);
				    System.out.println("==============================================");
				    
				    // 각 항목을 콘솔에 표시 할때마다
				    // bookList로 부터 index번째의 북vo를 추출하고
				    // 추출된 북vo의 getter() 메서드를 호출하는데
			    	System.out.println("ISBN : " + bookList.get(index).getStrNum());
			    	
			    	// 코드 시작점에서
			    	// 북리스트로 부터 인덱스번째의 북vo를 추출하여
			    	// 변수에 저장해 두고
			    	// getter() 메서드만을 호출하여 값을 표시한다,
			    	// 앞 코드보다 조금은 효율이좋을 것으로 예상된다
			    	System.out.println("ISBN : " + vo.getStrNum());
			    	
			    	
			    	
			    	System.out.println("도서명 : " + bookList.get(index).getStrName());
			    	System.out.println("출판사 : " + bookList.get(index).getStrWr());
			    	System.out.println("저자 : " + bookList.get(index).getStrNum());
			    	System.out.println("가격 : " + bookList.get(index).getStrNum());
			    	System.out.println("출판연도 : " + bookList.get(index).getStrNum());
			    	System.out.println("=================================================");
			    	
			    	
			      	public void view(String strName) {
			    		int nSize = bookList.size();
			    		for(int i = 0 ; i <nSize; i++) {
			    			BookVO vo = bookList.get(i);
			    			String voStrName = vo getStrName();
			    		// 도서명과 검색어strName이 반드시 일치하는 
			    		if (bookList.get(i).getStrName().equalsTgnorecase
			    				this.view(i);
			    	
			    		//break; //최최로 발견된 1개정보만 확인하고 마침
		}
		                // 도서명 문자열주에 strName answkdufdl vhgka ehldj
			    		// 있으면 그 값을 표시하자
			    		// 중간 문자열 검색
			    		// "ABC".contains("B")
			    		// 문자열 abc 중에 문자열 b가 포함되어 있냐?
			    		if(voStrName.toUpperCase().contains(strName.toUpperCase())) {
			    			this.view(i);
			    		}
			}
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			
			
			
				    
		}
			
	}

}
