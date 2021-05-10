package javaOOPLess;

public class ExamList extends UserMenager {
	private String firstExam ;
	private String secondExam;
	private String thirdExam ;
	private String fourthExam ;
	
    public ExamList () {}
	 
	public ExamList(String firstExam, String secondExam, String thirdExam, String fourthExam) {
		
		this.firstExam = firstExam;
		this.secondExam = secondExam;
		this.thirdExam = thirdExam;
		this.fourthExam = fourthExam;
	}

	public String getFirstExam() {
		return firstExam;
	}
	public void setFirstExam(String firstExam) {
		this.firstExam = firstExam;
	}
	public String getSecondExam() {
		return secondExam;
	}
	public void setSecondExam(String secondExam) {
		this.secondExam = secondExam;
	}
	public String getThirdExam() {
		return thirdExam;
	}
	public void setThirdExam(String thirdExam) {
		this.thirdExam = thirdExam;
	}
	public String getFourthExam() {
		return fourthExam;
	}
	public void setFourthExam(String fourthExam) {
		this.fourthExam = fourthExam;
	}

}
