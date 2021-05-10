package javaOOPLess;

public class StudentMenager extends UserMenager {
    public void BeginExam(Student student) {
    	System.out.println(student.getFirstName() + student.getLastName() +"  adı ve soyadlı öğrenci sınava giriş yapmıştır.");
    }
    
   public void  FinishExam (Student student) {
	   System.out.println(student.getUsername()+"gmail nolu"+student.getSchoolName()+"okulu  öğrencisi sınavı bitirmiştir.");
   }
   
    
}
