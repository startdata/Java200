package Java200;

import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

public class SystemTest {
    public static void main(String[] args) {
        Long ltime = System.currentTimeMillis();
        System.out.println(ltime); //1970.1.1
        for(int i = 0; i < 1000000; i++){
            System.out.println("");
        }
        Long ltime2=System.currentTimeMillis(); //milli 1/1000초
        System.out.println(ltime2-ltime);
        System.out.println(ltime2/1000/60/60/25/365+"년");
        Properties pro = System.getProperties();
        //원하는 System property
        System.out.println(pro.getProperty("java.vm.version"));
        System.out.println(pro.getProperty("file.separator"));

        System.out.println(new Date(System.currentTimeMillis())); //오늘
        // ----- java.util.*에서 -----//
        //모든 System property
        Enumeration<Object> en =pro.keys();
        int i = 0;
        while(en.hasMoreElements()){
            String keys = (String)en.nextElement();
            System.out.println((++i+" ")+keys+":"+pro.getProperty(keys));
        }
    }   //main
}
