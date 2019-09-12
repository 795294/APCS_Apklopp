
/**
 * Write a description of class ArrayRunner here.
 *
 * @author (Peter Klopp)
 * @version (Lab 920)
 */
public class ArrayRunner
{

    public static void main(){
        
        ArrayClass array = new ArrayClass();
        
        array.loadArray();
        array.printArray();
        System.out.println(array.getSum());
        System.out.println(array.getMean());
        System.out.println(array.getMedian());
        System.out.println(array.getMode());
    }
}
