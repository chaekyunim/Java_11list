package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;

public class List_05 {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for(int i = 0 ; i < 67 ; i++) {
			nums.add(rnd.nextInt());
			
		}
		
		//전체 리스트를 보고자 할때
		int nSize = nums.size();
		for(int i = 0 ; i < nSize ; i++) {
			System.out.println(nums.get(i));
		
			}
		// 확장 for, 향샹된 for, for Eath 라고 부른다
		// nums 개수만큼 반복문을 실행 하면서
		// nums의 요소르 getter 하여 n 변수에 담아준다
		
		//이 코드는 nums가 Colletions 일때
		//      사용할수 있다
		
		// 전체 리스트를 읽어서 연산을 수행할때 사용가능
			for(int n : nums) {
				System.out.println(n);
		}
			int sum = 0;
		    for(int n ; nums) {
		    	sum += n;
		    }
		    System.out.println("합계:" + sum);
		    
		    for(int n :nums) {
		    	
		    	int index;
		    	for(index = 2; index < n ; intdex++);
		    	    if(n % index == 0) break;
		    }
		    if(index >= n) {
		    	System.out.println(n + "은 소수이다");
		    }
	}

}
