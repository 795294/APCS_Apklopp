
/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Runner
{
    public static void main(){
        MeanMedianMode arrayList = new MeanMedianMode();
        
        arrayList.printArrayList();
        
        System.out.println(arrayList.getMean());
        System.out.println(arrayList.getMedian());
        System.out.println(arrayList.getMode());
    }
}
