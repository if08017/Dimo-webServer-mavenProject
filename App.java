package com.ec2-52-77-232-42.ap-southeast-1.compute.amazonaws;
 
public class App{
    
    public static void main( String[] args ){
        App app=new App();
        String input="Selamat Belajar Maven";
        System.out.println("Panjang dari "+input+" adalah "+app.stringLength(input));
    }
    
    public int stringLength(String input){
        return input.length();
    }
}
