package com.biz.list.grade;

import com.biz.list.Service.GradeService;

public class GradeEx_02 {

	public static void main(String[] args) {
		
		// GradeService interface로 gs  객체를 정의
		//                GradeServiceImp_01()을 이용해서
		//                gs 객체를 생성
		GradeService gs = new GradeServiceImp_1();
		GradeService gs = new GradeServiceImp_2();
		 
		 // List inerface로 nums 객체를 정의
		 //                ArrayList()를 이용해서
		 //                nums 객체를 생성
		 List<Integer> nums = new ArrayList<Integer>();
		 
		 gs.input(10);
		 gs.total();
		 gs.view();

	}

}
