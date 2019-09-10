
/**
 * Write a description of class StudentRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentRunner
{
    public StudentRunner(){
        
    }
    
    
    public static void main(){
        
        Student s1 = new Student("Peter", 321);
        System.out.println(s1.getName());
        System.out.println(s1.getNumber());
        
        Student s2 = new Student("name", 123);
        System.out.println(s2.getName());
        System.out.println(s2.getNumber());
        
        
    }

}
