package javaCollectionArrayLinked_List_Iterator;

import java.util.*;
public class Version {
    public static void main(String args[]) {
    	String version = "80402"; //to v8.04-SP2
    	String tags = "";
        if(version.length() == 3) {
          int c = version.indexOf("0");//for 803
          String Maj_v = version.substring(0, c);
          String Min_v = version.substring(c, version.length());
          tags = "v"+Maj_v+"."+Min_v;
          System.out.println(Maj_v);
          System.out.println(Min_v);
          System.out.println(tags);
        }
        else {
          int c = version.lastIndexOf("0");//3rd index //4
          String patch = version.substring(c+1, version.length());
          String Min_Maj = version.substring(0,c);//cropping rest of the items after removing patch
          String Min_v =Min_Maj.substring(Min_Maj.length()-2,Min_Maj.length());//
          String Maj_v = Min_Maj.substring(0,Min_Maj.lastIndexOf("0"));//
          tags = "v"+Maj_v+"."+Min_v+"-SF"+patch;
          System.out.println(patch);
          System.out.println(Min_Maj);
          System.out.println(Min_v);
          System.out.println(Maj_v);
          System.out.println(tags);
        }
}
}