/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colores;

import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author perez
 */
public class Colores {
    public static void main(String[] args) {
        color();
    }
    public static void color(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a ingresar");
        int[] c = new int[in.nextInt()];
        String imp = "";
        String ans = "";
        System.out.println("Ingrese los " + c.length + " numeros enteros");
        for (int i = 0; i < c.length; i++) {
            int n = in.nextInt();
            if (0 < n && n < 255) {
                imp+=n + " ";
                c[i]=n;
            }
            else{
            System.err.print("Este numero se sale del rango "); 
            break;
            }
        }
        System.out.println(imp + "Oscurecer ");
        int osc = in.nextInt();
        for (int i = 0; i < c.length; i++) {
            int a = 100/osc;
            int b = c[i]/a;
            c[i]-=b; 
            if(c[i]<0){
                c[i]=0;
            }
            ans+=c[i] + " ";
        }
        System.out.print("Su nuevo color es " + ans);
    }
}
