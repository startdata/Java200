package Java200;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class UsingClass65 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Class classes = obj1.getClass();
        System.out.println(classes.getName()); //클래스 이름
        System.out.println("----------constructor----------");
        Constructor [] constructors = classes.getDeclaredConstructors();
        for(Constructor con: constructors){
            System.out.println(con.getName());
        }
        System.out.println("----------Method----------");
        Method[] methods = classes.getMethods();
        for(Method me: methods){
            System.out.println(me.getName());
        }
    }
}
