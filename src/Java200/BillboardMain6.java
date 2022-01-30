package Java200;

public class BillboardMain6 {
    public static void main(String[] args) {
        RequestFromBillboardHot93 rfw = new RequestFromBillboardHot93();
        String a ="https://www.billboard.com/charts/hot-100/";
        String rs = rfw.getTimeDate(a);
        System.out.println(rs);
        rfw.getAllHtml(a+rs);
        String str="<article class= \"chart-row";
        rfw.getBillboardData(str);

        BillboardPrint.printToCSV(rfw.getBillboard(),"billboard\\"+rs+".csv");
    }
}
