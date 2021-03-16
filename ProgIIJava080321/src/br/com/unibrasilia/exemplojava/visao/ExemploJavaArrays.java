
package br.com.unibrasilia.exemplojava.visao;

import javax.swing.JOptionPane;

public class ExemploJavaArrays {

    public static void main(String[] args) {        
        /*int[] a = new int[6];
        a[0] = 4;
        a[1] = 5;
        a[2] = 15;
        a[3] = 55;
        a[4] = 8;
        a[5] = 88;*/
        int[] a = {5,6,55,88,99,77,54,66,89,89,2,6,0,7,66,88};
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("A[ " + i + " ] = " + a[i]);
        }
         
        int[] b = new int[5];
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor " + i));
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("B[ " + i + " ] = " + b[i]);
        }
        
    }
    
}
