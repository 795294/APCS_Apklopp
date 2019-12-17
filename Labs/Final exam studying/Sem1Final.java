
/**
 * Practice for first semester final exam
 *
 * @author (Peter Klopp)
 * @version (12/16/19)
 */
public class Sem1Final
{
    private int[] nums = {1, 2, 3, 4, 5};
    
    int[][] num = new int[10][10];
    
    public Sem1Final()
    {
        
    }
    
    public static void frq(){
        String[] randStrings = {"yes", "no", "maybe"};
        
        Sem1Final sf = new Sem1Final();
        
        System.out.println(sf.getRandomResponse(randStrings));
        
        int[][] num = new int[10][10];
        
        System.out.println(sf.loadNums(num));
    }
    
    public String getRandomResponse(String[] str){
        int randomIndex = (int)(Math.random()*str.length);
        
        return str[randomIndex];
    }
    
    
    public int loadNums(int[][] mat){
        int evensCount = 0;
        
        for(int r = 0; r<mat.length; r++){
            for(int c = 0; c < mat[r].length; c++){
                mat[r][c] = ((int)(Math.random()*9))+1;
                
                if(mat[r][c]%2==0){
                    evensCount++;
                }
            }
        }
        
        return evensCount;
    }
    
    public int threeA(){
        int sum = 0;
        
        for(int i = 0;i<nums.length; i++){
            if(sum<nums[i]) sum+=nums[i];
        }
        
        return sum; //returns 7
    }
    
    public int threeB(){
        int sum = 0;
        
        for(int i = 0;i<nums.length; i++){
            if(sum>nums[i]) sum+=nums[i];
        }
        
        return sum; //returns 0
    }
    
    public int threeC(){
        int sum = 0;
        
        for(int i = 0;i<nums.length; i++){
            if(sum<nums[i]) sum=nums[i];
        }
        
        return sum; //returns 5
    }
    
    public static void problem3(){
        //which of the following sets the value of sum equal to 5
        Sem1Final sf = new Sem1Final();
        
        System.out.println(sf.threeA());
        System.out.println(sf.threeB());
        System.out.println(sf.threeC());
    }
   
    
    public String go(int x){
        if(x<=5)
            return "same";
        else if(x>=3)
            return "notsame";
        return "done";
        
    }
    
    public static void problem6(){
        //what does go(3) return
        Sem1Final sf = new Sem1Final();
        
        System.out.println(sf.go(3)); //"same"
    }
    
    public static void problem12(){
        for(int i = 2; i > 0 ; i--)
            for(int j = i; j <= 2; j++)
                System.out.print(i + j + ", ");

    }
    
    public static void problem14(){
        int m = 0;
        int n = 7;
        
        while(m<3){
            n--;
            m++;
        }
        
        System.out.println(""+m+n);
        
    }
    
    public static void numberCheck(int minNum, int maxNum){
        int total = 0;
        int k;
        
        for(k = 1; k <= maxNum; k++){
            if(k >= minNum){
                total = total+k;
            }
                
        }
        
        System.out.println("the total is:" +total);
    }
    
    public static void problem16(){
        Sem1Final sf = new Sem1Final();
        
        sf.numberCheck(3, 5); //12
    }
    
    public static void toTheMax(int num) {
        for(int i = 0; i<num; i++){
            for(int j = 0; j<i; j++){
                System.out.print(i);
            }
            
            System.out.println();
            
        }
    }
}
