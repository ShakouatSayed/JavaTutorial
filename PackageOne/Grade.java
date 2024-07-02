package PackageOne;

class result{
    double m = 0, n = 0;
    public result(){
        m = 10;
        n = 20;
    }
    public result(double x, double y){
        m = x;
        n = y;
    }
    public double TotalMark(){
        return m + n;
    }
}

public class Grade{

    public static void main(String args[]){
        result r = new result(12, 32);
        System.out.println(r.TotalMark());
        char ch[] = {'B', 'D',' ','B','o','o','k'};
        System.out.println(ch);
    }
}