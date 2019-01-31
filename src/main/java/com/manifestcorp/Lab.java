package com.manifestcorp;
public class Lab{
    public static void main(String[] args)
    {
       for (String s : args){
           printLine(Integer.parseInt(s));
       }
    }
    public static void printLine(int n)
    {
        for(int i = 1; n > i; i++)
        {
            System.out.println(i);
        }
    }

}