package inheritance;
import java.util.Map;
import java.util.HashMap;

class ClassOne {
    private int rollNum;
    private String name;
    private String address;

    public ClassOne(int rollNum, String name, String address) {
        this.rollNum = rollNum;
        this.name = name;
        this.address = address;
    }

    //get the atribute
    public Map<String, Object> getStudentInfo(){
        Map<String, Object> studentInfo = new HashMap<>();
        studentInfo.put("name", name);
        studentInfo.put("rollNum", rollNum);
        studentInfo.put("address", address);
        return studentInfo;
    }

    public void setStudentInfo(Map <String, Object> s_student_info){
        if(s_student_info.containsKey("name")){
            String name = (String)s_student_info.get("name");
        }
        if(s_student_info.containsKey("address")){
            String address = (String)s_student_info.get("addres");
        }
        if(s_student_info.containsKey("name")){
            String roll_num = (String)s_student_info.get("rollNum");
        }
    }
}

class ClassTwo extends ClassOne{
    private int year;
    private String class_in;
    public ClassTwo(int year, String class_in, int rollNum, String name, String address){
        super(rollNum, address, name);
        this.class_in = class_in;
        this.year = year;
    }
    
    public Map<String, Object> getClassTwo() {
        Map<String, Object> getClassTwo = super.getStudentInfo();
        getClassTwo.put("class_in", class_in);
        getClassTwo.put("year", year);
        return getClassTwo;
    }

    public void setClassTwo(Map<String, Object> class_two){
        if(class_two.containsKey("class_in")){
            String class_in_1 = (String) class_two.get("class_in"); 
        }
        if(class_two.containsKey("year")){
            String year = (String) class_two.get("year"); 
        }
    }
}

public class StudentInfo {
    public static void main(String args[]){

        System.out.println();
        ClassOne OB1 = new ClassOne(22, "Sayed", "Cox'sBazar");
        
        Map<String, Object> studentInfo1 = OB1.getStudentInfo();
        studentInfo1.put("name", "Sakhawat");
        studentInfo1.put("name", "sayed");

        for(Map.Entry<String, Object> entry : studentInfo1.entrySet() ){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println();

        ClassTwo OB2 = new ClassTwo(22, "Class Two", 26, "Chakaria", "Sayed");
        Map<String, Object> studentInfo = OB2.getClassTwo();
        for(Map.Entry<String, Object> entry : studentInfo.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
        System.out.println();
    }
}
