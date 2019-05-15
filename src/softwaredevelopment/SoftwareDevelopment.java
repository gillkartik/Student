/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaredevelopment;

import java.util.Scanner;

/**
 *
 * @author karti
 */
public class SoftwareDevelopment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String [] arrays= {"h", "e", "l","l","o"};
//        // TODO code application logic here
//        for (int i=0; i < arrays.length; i++) {
//            System.out.println(arrays[i]);
//        }
//        Scanner scan= new Scanner(System.in);
//        String word= scan.next();
//    char [] name = new char[word.length()];
//        System.out.println(name.length);
//        for (int i=0; i < word.length(); i++) {
//            name[i]= word.charAt(i);
//        }
//      
        
        
        
        Student[] list = {new Student("Arpit"), new Student("Ish") , new Student("kartik")};
    for(int i=0; i<list.length;i++) {
        System.out.println(list[i].getName());
    }
    }
    
}
