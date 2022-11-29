/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loopandmethods;

/**
 *
 * @author Umman
 */
public class Methods {

    public static void main(String[] args) {
        String b = foo2("salam");
        System.out.println("b=" + b);
    }

    public static void foo(String s) {
        System.out.println("foo=" + s);
    }

    public static String foo2(String s) {
        System.out.println("foo2=" + s);
        return "isi gordum";
    }

    public static boolean foo3(String s) {
        System.out.println("foo3=" + s);
        return true;
    }

//        for (int i = 0; i < 10; i++) {
//            foo(); // foo() methodunu cagiririq for un icinde
//        }
//        String s = foo2();
//        System.out.println("s=" + s); // (s) yazmaq olar
//        boolean b = foo3();
//        if(b == true){
//            foo2();
//        }
//    }
//
//    public static void foo() {
//        System.out.println("foo is called");
//
//    }
//
//    public static String foo2() {
//        System.out.println("foo2 is called");
//
//        return "isi gordum";
//
//    }
//
//    public static boolean foo3() {
//        System.out.println("foo3 is called");
//
//        return true;
//
//    }
}
