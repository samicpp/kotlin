package org.example;

//import java.io.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TextInput {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void run(){start(new String[]{});}
    public static void run(String[] args){start(args);}

    public static void start(String[] args){}

    public static String strLine()throws IOException{return br.readLine();}
    public static int intLine()throws IOException{return Integer.parseInt(br.readLine());}
}
