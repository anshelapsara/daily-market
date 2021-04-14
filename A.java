/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANSHEL
 */
import java.util.*;
public class A {
    public static void main()
    {  Scanner sc=new Scanner(System.in);
        String type,channel,subtype,check;
         boolean flag=false;
        do
        {
        System.out.println("Do u want to subscribe or upgrade?");
        type=sc.next();
        System.out.println("Enter channel name :");
        channel=sc.next();
        System.out.println("Please choose subscription type");
        subtype=sc.next();
        System.out.println("Continue?<Yes/No");
         check=sc.next();
        if(check.equals("Yes"))
            flag=true;
        }
       while(flag); 
    }
}
