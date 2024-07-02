package PackageFive;
class methodPettern{
    public static void pattern(int a){
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= i - a; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        pattern(6);
    }
}