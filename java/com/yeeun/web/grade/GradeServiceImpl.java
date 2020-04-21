package com.yeeun.web.grade;

public class GradeServiceImpl implements GradeService {
	private Grade [] grades;
	private int count;
	
	public GradeServiceImpl() {
		grades = new Grade[5];
		count++;
	}

	@Override
	public void add(Grade grade) {
		grades[count] = grade;
		count =0;
	}

	@Override
	public Grade[] list() {
		return grades;
	}

	@Override
	public Grade detail(Grade grade) {
		Grade returnDetail = null;
		for(int i=0;i<count;i++) {
			if(grade.getUserid().equals(grades[i].getUserid())) {
				returnDetail = grades[i];
			}
		}
		return returnDetail;
	}

	@Override
	public int Count() {
		return count;
	}

	@Override
	public int total(Grade grade) {
		 return Integer.parseInt(grade.getKorean() + grade.getEnglish() + grade.getMath());
	}

	@Override
	public int average(Grade grade) {
		return total(grade) / 3;
	}

	@Override
	public String record(Grade grade) {
		String result = "";
		int average = average(grade);

		if (average >= 90) {
			result = "A";
		} else if (average >= 80) {
			result = "B";
		} else if (average >= 70) {
			result = "C";
		} else if (average >= 60) {
			result = "D";
		} else if (average >= 50) {
			result = "E";
		} else {
			result = "F";
		}
		return result;
	}


	@Override
	public void update(Grade grade) {
		
			
		}
		
	

	@Override
	public void delete(Grade grade) {
		
	}

	

	

}
