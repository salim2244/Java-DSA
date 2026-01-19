public class RecursuionCode {
    public static void main(String args[]){
        int n = 5;
        printNum(n);
        int m = 1;
        printNumb(m);
    }
    // print 5 to 1
    public static void printNum(int n){
        if(n==0)
            return;
        System.out.println(n);
        printNum(n-1);
    }
    //print 1 to 5;
    public static void printNumb(int m){
        if (m == 6){
            return ;
        }
        System.out.println(m);
        printNumb(m + 1);
    }
}
