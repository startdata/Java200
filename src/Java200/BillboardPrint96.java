package Java200;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class BillboardPrint96 {
    public static void printToXML(List<Billboard> bblist,String fname){
        try(PrintWriter pw = new PrintWriter(new FileWriter(fname,false),true)){
            pw.println("<?xml version = '1.0' encoding='utf-8'?>");
            pw.println("<billboard>");
            for (Billboard bb : bblist) {
                pw.println(pairxs(bb));
            }
            pw.println("</billboards>");
        } catch (IOException e){
        }
    }
    private static String rp(String msg){
        String st = msg;
        st=st.replaceAll("&","&amp;");
        st=st.replaceAll(">","&gt;");
        st=st.replaceAll("<","&lt;");
        st=st.replaceAll("\"","&apos;");
        st=st.replaceAll("\"","&quot;");

        return st;
    }
    // <key>valus</key>
    private  static String pairxs(String key,String value){
        String ss = String.format("<%s>%s</%s>",key,value,key);
        return ss;
    }
    private static String pairxs(Billboard bb){
        String rank=pairxs("rank",rp(bb.getRank()+""));
        String song=pairxs("song",rp(bb.getSong()+""));
        String lastweek=pairxs("lastweek",rp(bb.getLastweek()+""));
        String imagesrc=pairxs("imagesrc",rp(bb.getImagessrc()+""));
        String artist=pairxs("artist",rp(bb.getArtist()+""));
        return String.format("<billboard>\n%s %s %s %s %s \n</billboard>",
                rank, song, lastweek, imagesrc, artist);
    }
}
