/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication22;

/**
 *
 * @author user
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data[][]={
            {4,6,4,2,8,4,2,10},
             {4,6,4,2,8,4,2,10}              
        };
        for(int a = 0; a < data.length; a++) {
            for(int b = 0; b < data[a].length; b++) {
            System.out.print(data[a][b]+"");
        }
            System.out.println("");
    }
    } 
}