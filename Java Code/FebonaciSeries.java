public class FebonaciSeries {
    public static void main(String args[]){
        int n = 10;
        int first_number = 0;
        int second_number = 1;
        for(int i=0; i<n; i++){
            int add = first_number +second_number;
            System.out.print(add +" ");
            first_number = second_number;
            second_number = add;
        }
    }
}
