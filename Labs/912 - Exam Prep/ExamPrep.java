
/**
 * Write a description of class ExamPrep here.
 *
 * @author (Peter Klopp)
 * @version (ExamPrep 912)
 */
public class ExamPrep
{

    private int num;
    private int num2;

    public ExamPrep(int n, int n2)
    {
        num = n;
        num2 = n2;
    }

    public static void main(){
        ExamPrep ep = new ExamPrep(3,4);

        System.out.println(ep.multiply(3,4));
        System.out.println(ep.divide(3,4));
        System.out.println(ep.add(3,4));
        System.out.println(ep.sub(3,4));

        System.out.println(ep.digitsCounter(12345));

        System.out.println(ep.digitsSum(12345));
        
        System.out.println(ep.addArray(0));
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public double divide(double a, double b){
        return a/b;
    }

    public double add(double a, double b){
        return a+b;
    }

    public double sub(double a, double b){
        return a-b;
    }

    private int count = 0;
    private int digits;
    private int sum = 0;

    public int digitsCounter(int a){

        digits = a;

        while(a != 0){
            a = a/10;
            count++;
        }

        return count;
    }

    public int digitsSum(int a){
        digits = a;

        while(a != 0){
            sum = sum +  num%10;
            num /= 10;
        }

        return sum;
    }

    int[] nums = new int[10];
    int arraySum = 0;

    public int addArray(int a){
        arraySum = a;
        
        for(int i = 0; i<nums.length; i++){
            nums[i] = (int)Math.random()*10;
            
            a += nums[i];
        }
        
        return a;
    }
    
    


}
