package javaOOPLess;

public class Student extends User{
	public Student() {
		
	}
  
      private String schoolName ;
      private String examGrade;
      
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getExamGrade() {
		return examGrade;
	}
	public void setExamGrade(String examGrade) {
		this.examGrade = examGrade;
	}
}
