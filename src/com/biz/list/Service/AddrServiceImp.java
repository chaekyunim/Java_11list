package com.biz.list.Service;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.addr.AddrVO;
import com.biz.list.grade.AddrService;

public class AddrServiceImp implements AddrService {

	private List<AddrVO> addrList;
	
	@Override
	public void input() {
		
		// input() method 의 구현
		// input() method 에서 할일들의 코드를
		// 작성하는 것
		// 형태만 만들어진 input() method에
		
		addrList= new ArrayList<AddrVO>();
		
		AddrVO aVO = new AddrVO();
		 
		aVO.setStrName("홍길동");
		aVO.setStrTel("010-115-1568");
		aVO.setStrAddr("경기도 광주");
		aVO.setStrEmail("dlacorbs000@gmail.com");
		aVO.setStrHP("010-115-1768");
		
		addrList.add(aVO);
		
		aVO.setStrName("이몽룡");
		aVO.setStrTel("010-222-2666");
		aVO.setStrAddr("전라북도 전주");
		aVO.setStrEmail("dlacorbs01@naver.com");
		aVO.setStrHP("010-222-2222");
		
		addrList.add(aVO);
		
		aVO.setStrName("성춘향");
		aVO.setStrTel("010-222-2666");
		aVO.setStrAddr("함경북도");
		aVO.setStrEmail("corbs159daum.net");
		aVO.setStrHP("010-222-2222");
		
		addrList.add(aVO);
		

	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	List<AddrVO> addrList = new ArrayList<AddrVO>();
		
		AddrVO aVO = new AddrVO();
 
		aVO.setStrName("홍길동");
		aVO.setStrTel("010-115-1568");
		aVO.setStrAddr("경기도 광주");
		aVO.setStrEmail("dlacorbs000@gmail.com");
		aVO.setStrHP("010-115-1768");
		
		addrList.add(aVO);
		
		aVO.setStrName("이몽룡");
		aVO.setStrTel("010-222-2666");
		aVO.setStrAddr("전라북도 전주");
		aVO.setStrEmail("dlacorbs01@naver.com");
		aVO.setStrHP("010-222-2222");
		
		addrList.add(aVO);
		
		aVO.setStrName("성춘향");
		aVO.setStrTel("010-222-2666");
		aVO.setStrAddr("함경북도");
		aVO.setStrEmail("corbs159daum.net");
		aVO.setStrHP("010-222-2222");
		
		addrList.add(aVO);
		
		// addrList 의 개수를 계산해서 nSize 변수에 담아달라
		
	    System.out.println("=============================");
	    System.out.println("주   소   록"); 
	    System.out.println("이름|t전화|t주소|tEmail|t핸드폰");
	    System.out.println("--------------------------------");
	    int nSize = addrList.size();
	    for(int i = 0 ; i < nSize ; i++) {
	    	System.out.printf("%s|t",addrList.get(i)getStrName();
	    	System.out.printf("%s|t",addrList.get(i)getStrTel();
	    	System.out.printf("%s|t",addrList.get(i)getStrAddr();
	    	System.out.printf("%s|t",addrList.get(i)getStrEmail();
	    	System.out.printf("%s|t",addrList.get(i)getStrHP();
	    	
	    }
		
	     System.out.println("=============================");  
	     
	     public void view(int num) {
	    	 
	    	 if(num > addrList.size() -1)
	    	 
	    	 
	    	 AddrVO aVO = AddrList.get(num); 
	    	 
	    	 System.out.println("이름 :" + aVO.getStrName());
	    	 System.out.println("핸드폰 :" + aVO.getStrName());
	    	 System.out.println("주소 :" + aVO.getStrName());
	    	 System.out.println("이메일 :" + aVO.getStrName());
	     }
	     
	     
	}
	
	

	private void getStrHP() {
		// TODO Auto-generated method stub
		
	}

	private void getStrEmail() {
		// TODO Auto-generated method stub
		
	}

	private void getStrAddr() {
		// TODO Auto-generated method stub
		
	}

	private void getStrTel() {
		// TODO Auto-generated method stub
		
	}

	private void getStrName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void view(int num) {
		// TODO Auto-generated method stub

	}

}
