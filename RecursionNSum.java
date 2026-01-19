public class RecursionNSum {
    public static void main(String args[]){
        int n = 10;
        printSum(1,n,0);
    }
    public static void printSum(int i,int n, int sum){
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1,n,sum);
    }
}
