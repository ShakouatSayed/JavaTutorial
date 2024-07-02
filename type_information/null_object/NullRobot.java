package type_information.null_object;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.List;


class NullRobotProxyHandelar implements InvocationHandler {
    private String null_name;
    private Robot proxied =  new NRobot();

    public NullRobotProxyHandelar(Class<? extends Robot> types){
        null_name = types.getSimpleName()+" NullRobot";
    }
    
    private class NRobot implements Null, Robot {
        public String name(){return null_name;}
        public String model(){return null_name;}
        public List<RobotOperation> robot_operation(){
            return Collections.emptyList();
        }
    }

    public Object invoke (Object proxy, Method method, Object[] args) throws Throwable{
        return method.invoke(proxied, args);
    }
}


public class NullRobot {
    public static Robot newNullRobots(Class<? extends Robot> types){
        return (Robot)Proxy.newProxyInstance(
            NullRobot.class.getClassLoader(), 
            new Class[] {Null.class, Robot.class},
            new NullRobotProxyHandelar(types)
            );
    } 
    public static void main(String args[]){
        Robot[] bots = {
            new SnowRemovelRobot("Alexander. "),
            newNullRobots(SnowRemovelRobot.class)
        };
        for(Robot bot: bots)
            Robot.Test.test(bot);
    }
}
