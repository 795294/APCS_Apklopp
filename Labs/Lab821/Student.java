
/**
 * Write a description of class Student here.
 *
 * @author (Peter Klopp)
 * @version (Lab821)
 */
public class Student
{
    private String studentName;
    private int studentNumber;

    public Student(String name, int num) //contstuctor
    {
      studentName = name;
      studentNumber = num;
    }
    
    public String getName(){
        return studentName;
    }
    
    public int getNumber(){
        return studentNumber;
    }

}
