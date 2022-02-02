package Java200;

import java.awt.*;
import java.util.List;
import java.util.*;

public class ImageFXListRequest {
    private Map<String, Image> images;
    public ImageFXListRequest(){
        images = Collections.synchronizedMap(new LinkedHashMap<String, Image>(10,1.53f,true));
    }
    public synchronized Image loadImage(String imagesrc){
//        Image mimage =null;
//        if(imagesrc.containsKeys(imagesrc)){
//            mimage = imagesrc.get(imagesrc);
//        } else{
//            if(imagesrc != null && !imagesrc.contains("q__________")){
//                try{
//                    mimage = new Image(imagesrc,100,100,true,true);
//                } catch (Exception e){
//                    mimage = null;
//                }
//            }
//        }
//        return mimage==null ? new Image(getClass()
//                .getResourceAsStream("billboard.jpg")) : mimage;
    return null;
    }
    public synchronized  void getAllImages(ArrayList<Billboard> bills){
        images.clear();
        List<Billboard> newbills = Collections.synchronizedList(bills);
        for(Billboard bb : newbills){
            new Thread(() -> {
             if(!images.containsKey(bb.getImagessrc())){
                 images.put(bb.getImagessrc(),loadImage(bb.getImagessrc()));
                 System.out.println(bb.getImagessrc()+
                         "\t\t\t---Map에 Image 저장 ---->>>>>>>>>>");
             }
            }).start();
        }
    }
    public synchronized void printImage(){
        System.out.println(images.size());
        Iterator<String> imagekeys = images.keySet().iterator();
        while(imagekeys.hasNext()){
            String key = imagekeys.next();
//            System.out.println("key=%s\n",key);
        }
    }

    public static void main(String[] args) {
        ImageFXListRequest request = new ImageFXListRequest();
        RequestFromBillboardHot93 rfw = new RequestFromBillboardHot93();
        String a = "https://www.billboard.com/charts/hot-100/";
        String rs = rfw.getTimeDate(a);
        System.out.println(rs+"---------------Billboard Chart !!!");
        rfw.getAllHtml(a);
        String str = "<article class =\"chart-row";
        rfw.getBillboardData(str);
        ArrayList<Billboard> bills = rfw.getBillboard();
        request.getAllImages(bills);
        request.printImage();
    }
}
