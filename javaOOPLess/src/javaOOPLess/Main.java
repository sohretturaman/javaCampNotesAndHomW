package javaOOPLess;

public class Main {

	public static void main(String[] args) {
		
		 Student student = new Student ();
		 student.setFirstName("şöhret");
		 student.setLastName("TURAMAN");
		 student.setSchoolName(" fırat üniversitesi") ;
		 student.setUsername("sohretturaman@gmail.com");
		 student.setExamGrade("99");
		 student.getPassWord();
		 Student[] students = {student};  

		
		 
		 Instructor instructor =new Instructor();
		 instructor.setFirstName("Engin");
		 instructor.setLastName("DEMİROĞ");
		 instructor.setBranch("software");
		 instructor.setUsername("engindmrg@gmail.com");
		 instructor.getPassWord();

		 
		 ExamList examList = new ExamList ();
         examList.setFirstExam("c#");
         examList.setSecondExam("java");
         examList.setThirdExam("SQL");
         examList.setFourthExam("c++");
         
         UserMenager userMenager = new UserMenager ();
         userMenager.loginTheSystem(instructor);
         userMenager.logoutToSystem(instructor);
         userMenager.updatingTheSystem(student);
         
         
         
         StudentMenager studentMenager = new StudentMenager ();
         studentMenager.BeginExam(student);
         studentMenager.FinishExam(student);
         studentMenager.loginTheSystem(student);
         studentMenager.logoutToSystem(student);
         
         System.out.println("---------------------");
         
        InstructorMenager instructorMenager = new InstructorMenager ();
        instructorMenager.addAllStudents(students);
        ExamList[] examLists = { examList};
        
        instructorMenager.addAllExams(examLists);
        
        UserMenager usermenager = new UserMenager ();
        User[] users = { instructor, student};
        usermenager.showAllUsers( users);
        
        
        
        /*
boş constructor eklemeyi unutma onlr olmadan erişemeyiz 
senin burda hatan student[] adlı dizi oluşturmamak. eğer metoda student[] adlı parametre
gönderiyorsan maine gelip onu oluşturman gerek. 
*/
        
        /*
         * BİLGİSAYAR DENEN ŞEY APTAL BİR VARLIKTIR. SEN ONA TEKER TEKER NE YAPACAĞINI
         * SÖYLEMEZSEN ANLAMAZ..... 
         * 
         */


         
	}

}
