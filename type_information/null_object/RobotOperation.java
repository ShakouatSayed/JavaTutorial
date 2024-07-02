package type_information.null_object;

import java.util.Arrays;
import java.util.List;

interface RobotOperation {
    String description();
    void commond();
}

interface Robot{  
    String name();
    String model();
    List<RobotOperation> robot_operation();
    class Test{
        public static void test(Robot r){

            if(r instanceof Null)
                System.out.println("[Null Robot]");

            System.out.println("Robot Name: "+r.name());
            System.out.println("Robot Model: "+r.model());

            for(RobotOperation r_operation : r.robot_operation()){
                System.out.println(r_operation.description());
                r_operation.commond();
            }      
        }
    }
}


class SnowRemovelRobot implements Robot{
    //initial the string type variable.
    private String name;

    //create a constractor.
    public SnowRemovelRobot(String name){this.name = name;}

    //the name and model method from Robot interface implement.
    public String name(){return name;}
    public String model(){return " Snow Boat Series 11.";}

    //using the list liberry and RobotOperation.
    public List<RobotOperation> robot_operation(){
        return Arrays.asList(
            new RobotOperation() {
                public String description(){return name+" can Snowble now.";}
                public void commond(){System.out.println(name+" snowable now."); }
            },
            new RobotOperation() {
                public String description(){return name+" can chip ice.";}
                public void commond(){System.out.println(name+" chipping ice.");}  
            },
            new RobotOperation() {
                public String description(){return name+" can clean roof. ";}
                public void commond(){System.out.println(name+" cleanning roof.");}
            }
        );
    }
    
    //main method
    public static void main(String args[]){
        Robot.Test.test(new SnowRemovelRobot("Sofia"));
    }
}


