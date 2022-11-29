/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopandmethods;

/**
 *
 * @author Umman
 */
public class Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        1.
           for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 15; i++) {
                System.out.print("*");
            } 
            System.out.println("");
        }
        
        ***************
        ***************
        ***************
        ***************
        ***************
          
        2.
        *
        **
        ***
        ****
        *****
        ******
        *******
        ********
        
          for (int i = 1; i < 9; i++) {
                for(int j = 0; j<i; j++){
                    System.out.print("*");
                }
                 System.out.println("");
            }
        3.
              *
             **
            ***
           ****
          *****   
         ****** 
        *******
        for (int i = 1; i < 8; i++) {
                for(int j = 0; j<7-i; j++){
                   System.out.print(" ");
                }
                for(int j = 0; j<i; j++ ){
                    System.out.print("*");
                }
                System.out.println("");
            }
        
        4.
        = = =  = = =
        = = =  = = =
        = = =  = = =
        = = =  = = =

        for (int j = 0; j<4; j++){
             for(int i = 0; i<6; i++){
             System.out.print("=");
             if (i!=2){
                 System.out.print(" ");
             } else{
                 System.out.print("  ");
             }
         }
             System.out.println("");
        }
        
        */
     
        for (int i = 0; i<10; i++){
//            if(i == 3){
//                continue;// 3u cap etmeden davam edir
//            }
              if(i == 3){
                break;// 3u cap etmir ve for u dayandirir 
            }
            System.out.println(i+"==");
        }

       
          
        
        
        
        
        
        
        
        
//        for (int i = 0; i < 10; System.out.println(i + "=salam brat")) {
//            i++;
//
//        }
//        int i = 0;
//        int j = 0;
//        for ( ; j < 10; System.out.println(i + "=salam brat")/*bu ucuncu*/) {
//            i++;// bu ikinci icra olunur
//            j++;
//
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i+"=salam brat");
//
//        }
    }

}
