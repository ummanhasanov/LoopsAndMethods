/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loopandmethods;

import java.util.Scanner;

/**
 *
 * @author Umman
 */
public class Calculate {

    public static void main(String[] args) {
        calculater();
    }

    public static void calculater() {
        Scanner sc = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        double a = sc.nextDouble();

        System.out.println("b-ni daxil edin");
        double b = sc.nextDouble();

        System.out.println("operatoru secin: +1, -2, *3, /4, %5");
        int operation = sc.nextInt();

        double result = 0;

        switch (operation) {
            case 1:
                result = MathUtil.topla(a, b);
                break;
            case 2:
                result = MathUtil.cix(a, b);
                break;
            case 3:
                result = MathUtil.vur(a, b);
                break;
            case 4:
                result = MathUtil.bol(a, b);
                break;
            case 5:
                result = MathUtil.faiz(a, b);
                break;
            default:
                System.out.println("The operation is not valid");
                break;
        }
        System.out.println("result=" + result);
    }


}
