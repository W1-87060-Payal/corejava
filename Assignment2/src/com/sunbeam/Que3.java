package com.sunbeam;

public class Que3 {
class Date{
private int month;
private  int day;
private int year;

public Date(int month, int day, int year) {
super();
this.month = month;
this.day = day;
this.year = year;


}

public int getMonth() {
return month;
}

public void setMonth(int month) {
this.month = month;
}

public int getDay() {
return day;
}

public void setDay(int day) {
this.day = day;
}

public int getYear() {
return year;
}

public void setYear(int year) {
this.year = year;
}



}

public static void main(String[] args) {
// TODO Auto-generated method stub

int day = 1;
int month = 4;
int year =2001;
System.out.println(day + " / " + month + " / " + year);
}

}
