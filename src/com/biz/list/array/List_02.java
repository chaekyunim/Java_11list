package com.biz.list.array;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

public class List_02 {

	public static void main(String[] args) {
	
		// 정수값을 담을 nums list를 선언과 생성
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for(int i = 0 ; i < 55; i++) {
			
			// 4byte 정수 범위의 임의 숫자 1개 생성
			int rNums = rnd.nextInt();
			
			
			//생성 숫자를 넘버스 리스트 (nums List)에 추가
			nums.add(rNums);
			
			//nums List에는 55개의 요소가 생성되어 있을 것이다.
			
			// 30번 요소의 값을 num 변수에 복사
			int nums = nums.get(30);
			System.out.print(num);
			
			for(int i1 = 0 ; i1 < 55 ; i++) {
				System.out.println(nums.get(i));
			}
			
		}
		
		
	}

}
