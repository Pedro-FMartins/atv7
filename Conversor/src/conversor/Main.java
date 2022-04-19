/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.util.Scanner;

/**
 *
 * @author Pedro Ferreira Martins <'112011004351'>
 * @author Raphael Ninomiya <'11211100998'>
 */
public class Main {

    public static void main(String[] args) {
        
        Aluno x = new Aluno();
        
        System.out.println(" ____________________");
        System.out.println("|                    |");
        System.out.println("|   Cálculo Média    |");
        System.out.println("|____________________|\n");
        
        System.out.println("Insira a nota 1: ");
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        x.setSt1(st1);
        System.out.println();
        System.out.println("Insira a nota 2: ");
        String st2 = sc.nextLine();
        x.setSt2(st2);
        System.out.println();
        x.calcularMedia();
    }   
}
