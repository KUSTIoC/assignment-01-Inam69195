/*
Sir in this program we first made variable in pa
  
*/
public class Exam_Management_System {
    public static void main(String[] args) {
        // TODO code application logic here
       
        paper E1 = new paper("Computer Science","1234","CS103","Sir Ali Zeb",2,"BSCS","Final","Sir Roman","Room 3","45",false,2,3,2020,4,30,0);
        paper E2 = new paper("DLD","1234","CS112","Sir Maaz",4,"BSCS","Final","Sir asim","Room 4","45",false,2,3,2020,4,30,0);
        paper E3 = new paper("Islamyat","1234","CS101","Sir inam",4,"BSCS","Final","Sir asim","Room 4","45",false,2,3,2020,4,30,0);

        System.out.println(E1.toString());
        System.out.println(E2.toString());
        System.out.println(E3.toString());
        
        Course c1 = new Course("java",123,"BSCS","Sir Hasnat");
         Course c2 = new Course("Study Skill",103,"BSCS","madam sabahat");
        Course c3 = new Course("Pakistan Study",104,"BSCS","Sir Roman");
         System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
  
		
	
		
        
    }
    
}
