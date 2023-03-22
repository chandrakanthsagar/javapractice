
public class strngbuffer {
  public static void main(String args[]) {

    StringBuffer s=new StringBuffer("chandra");
    System.out.println(s.append("kanth"));
    System.out.println(s.insert(0,"Gouri"));
    System.out.println(s.delete(1,3));
    System.out.println(s.substring(1));
    System.out.println(s.toString());
    System.out.println(s.reverse());
  } 
}
