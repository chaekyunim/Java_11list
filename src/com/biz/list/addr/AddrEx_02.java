package com.biz.list.addr;

import com.biz.list.Service.AddrServiceImp;
import com.biz.list.grade.AddrService;

public class AddrEx_02 {

	public static void main(String[] args) {
		
		AddrServiceImp addr1 = new AddrServiceImp();
		
		addr1.input();
		addr1.list();
		addr1.view(2);
		
		//객체지향 다운 코드
	    AddrService addr2 = new AddrServiceImpV2();
	    
	    addr2.input();
		addr2.list();
		addr2.view(1);

	}

}
