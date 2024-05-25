package com.company.Super_This_Practice;

class EkClass{
     private int a;
    EkClass(int a){
        this.a=a;
     /*   a=a;// Output=0 for any value */
    }
    public int getA(){
        return a;
    }
        }
public class Cwh_Super {


    public static void main(String[] args) {
        EkClass e=new EkClass(65);
        System.out.println(e.getA());
    }
}
