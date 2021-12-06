package com.knoldus.Lambda;


interface StringInterface{
    String showString(String a, String b, String c, String d, String e, String f, String g);
}


public class SevenString {
    public static void main(String...args){
        StringInterface obj=(a,b,c,d,e,f,g)-> (a+b+c+d+e+f+g).toUpperCase();
System.out.println(obj.showString("The", "lambda" ,"has", "too", "many", "string","arguments"));
    };

}
