package Java200;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class BillboardPrint {
    public static void printToCSV(List<Billboard> bblist,String fname){
        try(PrintWriter pw = new PrintWriter(new FileWriter(fname,false),true)){
            for (Billboard bb : bblist) {
                pw.println(bb);
            }
        } catch(IOException e){

        }
    }
}
