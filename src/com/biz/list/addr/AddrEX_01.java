package com.biz.list.addr;

import java.util.ArrayList;
import java.util.List;

public class AddrEX_01 {

	public static void main(String[] args) {
		
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
	}

	private static void getStrHP() {
		// TODO Auto-generated method stub
		
	}

	private static void getStrTel() {
		// TODO Auto-generated method stub
		
	}

	private static void getStrName() {
		// TODO Auto-generated method stub
		
	}

	private static void getStrAddr() {
		// TODO Auto-generated method stub
		
	}

	private static void getStrEmail() {
		// TODO Auto-generated method stub
		
	} 

}
