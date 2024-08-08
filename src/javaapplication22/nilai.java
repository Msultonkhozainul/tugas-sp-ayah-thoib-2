/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication22;

import org.w3c.dom.ls.LSOutput;

/**
 *
 * @author user
 */
public class nilai {

    public static void main(String[] args) {
        int data[][]={
            {4,6,4,2,8,4,2,10},
             {4,6,4,2,8,4,2,10}              
        };
        double total = 0;
        double rata;
        for(int a = 0; a < data.length; a++) {
            for(int b = 0; b < data[a].length; b++) {
            total += data[a][b];
        }
        }
        rata = total/ (data.length * data [0].length);
            System.out.println(rata);
    }
    } 
