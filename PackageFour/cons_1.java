package PackageFour;
class employee{
    String name ;
    int age;
    String degicnation;
    String emailAdd;
    String yearOfBirth;
    double salary;
    public employee(String name){
        this.name = name;
    }
    public void employee_age(int age){
        this.age = age;
    }
    public void employee_dig(String dig){
        this.degicnation = dig; 
    }
    public void employee_email(String email){
        this.emailAdd = email;
    }
    public void employee_salary(double salary){
        this.salary = salary;
    }
     public void employee_birth(String birth){
        this.yearOfBirth = birth;
    }
    public void display(){
          System.out.println("\nEmployee Name: "+name);
          System.out.println("Employee Age: "+age);
          System.out.println("Employee Email Address: "+emailAdd);
          System.out.println("Employee Degicnation: "+degicnation);
          System.out.println("Employee Salary: "+salary);
          System.out.println("Employee Year of Birth: "+yearOfBirth);    
    }
}

class cons_1{
    public static void main(String args[]){
        employee e1 = new employee("Shakouat Hossen Sayed");
        employee e2 = new employee("Shakouat Sayed");
        e1.employee_age(20);
        e1.employee_dig("Software Engineering.");
        e1.employee_email("sayedckb61@gmail.com");
        e1.employee_salary(120000.3);
        e1.employee_birth("27-02-2001");
        e1.display();
        e2.employee_age(21);
        e1.employee_dig("Software Engineering.");
        e1.employee_email("sayed525@gmail.com");
        e1.employee_salary(12541140.3);
        e1.employee_birth("27-02-2002");
        e1.display();
    }
}