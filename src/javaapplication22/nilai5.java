/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication22;
import javax.swing.*;
public class nilai5 {
  public static void main(String[] args) {
        int data[][]={
            {4,6,4,2,8,4,2,10},
            {4,6,4,2,8,4,2,10}              
        };
        int baris = Integer.parseInt(JOptionPane.showInputDialog("Masukan baris "));
        int kolom = Integer.parseInt(JOptionPane.showInputDialog("Masukan kolom "));
        
        int nilai_baru = Integer.parseInt(JOptionPane.showInputDialog("Masukan nilai baru "));
        data[baris][kolom] = nilai_baru;
        
          for(int a = 0; a < data.length; a++) {
            for(int b = 0; b < data[a].length; b++) {
            System.out.print(data[a][b]+" ");
        }
            System.out.println();
        }
          int element = 0;
           for(int i = 0; i < data.length; i++) {
            for(int j = 1; j < data[i].length; j += 2) {
           element += data[i][j];
            }
        }
            System.out.println(element);
          
      }
    
}
