package compatitive_programming_and_backend_development.recursion;

public class PowerOFNumber {

    public static long power(long N, long R){

        //base condition
        if(N==0)return 0;
        if(R==0)return 1;
        
        //hypothsis 
        long result = N*power(N, R-1);

        //something
        return result;
    }

    public static void main(String[] args) {
        long result = power(4, 7);
        System.out.println("4^7 = "+result);
    }
}
