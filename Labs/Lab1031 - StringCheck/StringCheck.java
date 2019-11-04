
/**
 * Looks for a key string in array or arrayList and returns an array or arrayList
 *
 * @author (Peter Klopp)
 * @version (Lab1031)
 */
import java.util.*;

public class StringCheck
{

    ArrayList<String> returnList = new ArrayList<String>();

    String[] returnArr = new String[1];

    public ArrayList<String> wordChecker (String[] str, String key){

        for(int i = 0; i<str.length; i++){
            if(str[i].indexOf(key) != -1){
                returnList.add(str[i]);
            }
        }

        return returnList;

    }

    public void printReturnList(){
        for(int i = 0; i<returnList.size(); i++){
            System.out.print("," + returnList.get(i));
        }
    }

    public String[] arrChecker(ArrayList<String> str, String key){
        ArrayList<String> tempList = new ArrayList<String>();

        for(int i = 0; i< str.size(); i++){
            if(str.get(i) != null){
                if(str.get(i).indexOf(key) != -1){
                    tempList.add(str.get(i));
                }
            }
        }

        for(int i = 0; i < tempList.size(); i++){
            if(returnArr[returnArr.length-1] != null){
                returnArr = extendArray(returnArr, 1);

            }
            
            returnArr[i] = tempList.get(i);
        }
        
        return returnArr;

    }

    public void printReturnArr(){
        for(int i = 0; i<returnArr.length; i++){
            System.out.print("," + returnArr[i]);
        }
    }

    public static String[] extendArray(String[] returnArr, int n){
        String[] returnArr2 = new String[returnArr.length + n];

        for(int i = 0; i<returnArr.length; i++){
            returnArr2[i] = returnArr[i];
        }

        return returnArr2;
    }

    public static void main(){
        StringCheck stringCheck = new StringCheck();

        String[] strArray = new String[] {"catch", "can't", "cat", "concatenation"};

        ArrayList<String> strArrayList = new ArrayList<String>();

        strArrayList.add("nation");
        strArrayList.add("ion");
        strArrayList.add("explanation");
        strArrayList.add("cat");
        strArrayList.add("cation");
        strArrayList.add("bat");
        strArrayList.add("illumination");

        stringCheck.wordChecker(strArray, "cat");
        stringCheck.printReturnList();
        stringCheck.arrChecker(strArrayList, "ion");
        System.out.println();
        stringCheck.printReturnArr();
    }
}
