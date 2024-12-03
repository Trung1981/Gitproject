/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Bt1 {

    /**
     * @param args the command line arguments
     */
    
    public static void Baitap1()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ten");
        String ten = sc.nextLine();
        
        System.out.println("Nhap nam sinh");
        int Namsinh = Integer.parseInt(sc.nextLine());
        
        System.out.println("Chao ban " + ten 
                + ". Nam nay ban " + (2024-Namsinh) + " tuoi");
        
        System.out.println("Nhap chieu cao");
        double chieucao = Double.parseDouble(sc.nextLine());
        
    }
    
    public static void Baitap2()
    {
        System.out.println("Hello world 2");
    }
    public static void main(String[] args) {
        
        Baitap1();
        System.out.println("Hello world");
        // TODO code application logic here
    }
    
    public static void Baitap3()
    {
        
    }
    
}
