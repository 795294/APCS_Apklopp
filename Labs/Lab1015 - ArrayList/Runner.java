
/**
 * Return Mean+Median+Mode of ArrayList
 *
 * @author (Peter Klopp)
 * @version (Lab1015 - MMM)
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
