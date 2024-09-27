package com.sunbeam;

public class Que1 {
static class Invoice{
private String partnumber;
private String partDesc;
private int quality;
private double prizeperitem;

public Invoice(String partnumber, String partDesc, int quality, double prizeperitem) {
super();
this.partnumber = partnumber;
this.partDesc = partDesc;
this.quality = quality;
this.prizeperitem = prizeperitem;
}

public String getPartnumber() {
return partnumber;
}

public void setPartnumber(String partnumber) {
this.partnumber = partnumber;
}

public String getPartDesc() {
return partDesc;
}

public void setPartDesc(String partDesc) {
this.partDesc = partDesc;
}

public int getQuality() {
return quality;
}

public void setQuality(int quality) {
this.quality = quality;
}

public double getPrizeperitem() {
return prizeperitem;
}

public void setPrizeperitem(double prizeperitem) {
this.prizeperitem = prizeperitem;
}

public String getInvoice() {
// TODO Auto-generated method stub
return null;
}



}
public static void main(String[] args) {
// TODO Auto-generated method stub
Invoice is = new Invoice("1122","wire",3, 50.0);
System.out.println("Part Number: " + is.getPartnumber());
        System.out.println("Part Description: " + is.getPartDesc());
        System.out.println("Quantity: " + is.getQuality());
        System.out.println("Price per Item: rs" + is.getPrizeperitem ());
        System.out.println("Invoice Amount: rs" + is.getInvoice());
}


 }
