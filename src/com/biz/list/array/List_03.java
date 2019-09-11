package com.biz.list.array;

import java.awt.List;
import java.util.ArrayList;

public class List_03 {

	public static void main(String[] args) {
		// 1번 : 일반적인 코딩 방식
		//ArrayList<Integer> nums  = new ArrayList<Integer>();
		
		// 2번 : 객체지향의 패턴을 중요시 준수하는 코딩 방식
		// primitive(기본형) 변수들을 리스트로
		// 저장하기 위해서 선언하는 명령문들
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<String> sts = new ArrayList<String>();
		ArrayList<Float> floas = new ArrayList<Float>();
		ArrayList<Long> longs = new ArrayList<Long>();
		ArrayList<Double> doubles = new ArrayList<Double>();
		ArrayList<Character> chars = new ArrayList<Character>();
		ArrayList<Boolean> bools = new ArrayList<Boolean>();
	}

}
