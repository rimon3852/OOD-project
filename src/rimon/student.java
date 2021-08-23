/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rimon;

import java.io.FileWriter;
import java.util.Scanner;

public class student extends person{
    
    public void getInfo()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Name : ");
        name = in.nextLine();
        System.out.println("Pass : ");
        pass = in.nextLine();
        System.out.println("Confirm Password : ");
        Confirm_Pass = in.nextLine();
        System.out.println("Email : ");
        Email = in.nextLine();
        try {
            FileWriter fw=new FileWriter("D:\\SavingInformation.txt");    
            fw.write(name);
            fw.write("\r\n");
            fw.write(pass);
            fw.write("\r\n");
            fw.write(Confirm_Pass);
            fw.write("\r\n");
            fw.write(Email);
            fw.write("\r\n");
            fw.close();    
        } catch (Exception e) {
        }
         System.out.println("Success...");    
    }
}
