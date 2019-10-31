
/**
 * Write a description of class StringCheck here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        for(int i = 0; i<str.size(); i++){
            if(str.get(i).indexOf(key) != -1){
             
               if(returnArr[returnArr.length-1] != null){
                   returnArr = extendArray(returnArr, 1);
                }
                
             returnArr[i] = str.get(i);

            } 
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
        //strArrayList.add("cat");
        
        //gives out of bounds exception
        strArrayList.add("cation");
       
        
        stringCheck.wordChecker(strArray, "cat");
        
        stringCheck.printReturnList();
        
        stringCheck.arrChecker(strArrayList, "ion");
        
        System.out.println();
        
        stringCheck.printReturnArr();
        
    }
}
