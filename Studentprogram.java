interface Student{
    void displayGrade();
    void attendence();
}
class PGstudent implements Student{
    String name;
    int rollno;
    double att;
    String grade;
    PGstudent(String p,int q,double r,String s){
        name=p;
        rollno=q;
        att=r;
        grade=s;

    }
public void display(){
    System.out.println(" PG student details: ");
    System.out.println("Name :"+name);
    System.out.println("Rollno: "+rollno);
   
}
public void displayGrade(){
    System.out.println("GRADE: "+grade);
}
public void attendence(){
    System.out.println("ATTENDENCE: "+att);

}

}
class UGstudent implements Student{
    String name;
    int rollno;
    double att;
    String grade;
    UGstudent(String p,int q,double r,String s){
        name=p;
        rollno=q;
        att=r;
        grade=s;

    }
public void display(){
    System.out.println(" UG student details: ");
    System.out.println("Name :"+name);
    System.out.println("Rollno: "+rollno);
   
}
public void displayGrade(){
    System.out.println("GRADE: "+grade);
}

public void attendence(){
    System.out.println("ATTENDENCE: "+att);

}


}

public class Studentprogram {
    public static void main(String args[]) {
        
    
    
    PGstudent k=new PGstudent("ramu", 12, 88, "A");
    k.display();
    k.attendence();
    k.displayGrade();
    UGstudent l=new UGstudent("raja", 9, 78, "B");
    l.display();
    l.attendence();
    l.displayGrade();
}

}