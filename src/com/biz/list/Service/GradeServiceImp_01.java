package com.biz.list.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface GradeServiceImp_01 {
                  implements GradeService {
                  }
	
	private List<GradeVO> gradeList
	// GradeVO 클래스를 리스트로 선언
	public GradeServiceImp_01() {
		
	Random rnd;
	
		
		// 리스트를 사용할수 있도록 생성
		 gradeList = new ArrayList<GradeVO>();
		 rnd = new Random();
		 
		 
	}
	//GradeVO를 gradeList에 추가하는 코드
	//input() method를 호출할때
	// 생성할 리스트 개수를 보내주면
	// 개수를 size 변수에 받고
	// 그 개수만큼 생성해서 gradeList에 추가
	public void input() {
		
		for(int i = 0 ; i < size ; i++) {
			
			
		} //input() end
		
		// 과목의 총점, 평균
		public void total() {
			
			
		}
		
		public void view( ) {
			
			
				
			}
		}
		
		
	}
}
