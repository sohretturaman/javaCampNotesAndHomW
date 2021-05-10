package javaOOPLess;

public class InstructorMenager extends UserMenager {
	
	
	public void loginExam (Instructor instructor){
		System.out.println( instructor.getFirstName()+"adlı eğitmen sınav gözetmeni olarak giriş yaptı .");
	}
	
	public  void addAllStudents(Student[] students) {
		 for ( Student student : students) {
			 System.out.println("öğrenci ismi" + student.getFirstName());
			
		

		 } 
	}
	
	public void addAllExams (ExamList[] examLists) {
		for (ExamList examList : examLists ) {
			System.out.println( "mevcut bulunan zorunlu yapılacak sınavlar sırasıyla : "+"\n"+
	 examList.getFirstExam()+ "\n"+examList.getSecondExam()+"\n"+ examList.getThirdExam()+ examList.getFourthExam());
		}
	}
	
}
