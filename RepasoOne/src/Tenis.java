
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucho
 */
public class Tenis {
    
    String j1="Jugador 1";
    String j2="Jugador 2";
    int p1=0;
    int p2=0;
    int a=0;
    int b=0;
    int limite=1;
    int scor[] = new int[2];
    
    public int[] point (){
        Random r = new Random();
        if(a==40 && b==40){
           System.out.println("Dauce");
            if (r.nextInt(limite+1)==0){
                 System.out.println("Advantager Jugador 1");
            } 
            else{
                System.out.println("Advantager Jugador 2");
        }
         if (r.nextInt(limite+1)==0){
                 System.out.println("Jugador 1 Win");
            }
         
            else{
            
             System.out.println("Jugador 2 Win");
        }
         
        }
        
        else{
        if(a==0 && b==0){
        System.out.println("Love-All");
        }
        
           if (r.nextInt(limite+1)==0){
            if(a==40){
                System.out.println("Jugador 1 win"); 
            } 
            else{
                if(a==30){
                a = puntoFinal(a); 
                System.out.println(j1+" "+a+"-"+b+"  "+j2);
                scor[0]=a;
                //System.out.println(scor[0]);
                //System.out.println(scor[1]);
                }
            
            else{
                 a = puntoNormal(a);
                 System.out.println(j1+" "+a+"-"+b+"  "+j2);
                 scor[0]=a;
                 //System.out.println(scor[0]);
                 //System.out.println(scor[1]);
            }
            }
        } 

        else{
            if(b==40){
                System.out.println("Jugador 2 win");
            }
            else{
            if(b==30){
                b = puntoFinal(b);
                System.out.println(j1+"  "+a+"-"+b+"  "+j2);
                scor[1]=b;
                //System.out.println(scor[0]);
                //System.out.println(scor[1]);
            }
            else{
                 b = puntoNormal(b);
                 System.out.println(j1+" "+a+"-"+b+"  "+j2);
                 scor[1]=b;
                 //System.out.println(scor[0]);
                 //System.out.println(scor[1]);
                }
            } 
        }
        }
        return scor;
       
    } 
    
    public void score(int [] pun){
        if(pun[0]==0 && pun[1]==0){
           System.out.println("Love-All");
       } else {
           if(pun[0]==15 && pun[1]==0){
           System.out.println("Fifteen-Love");
             } else {
                  if(pun[0]==30 && pun[1]==0){
                  System.out.println("Thirty-Love");
                     } else {
                         if(pun[0]==30 && pun[1]==15){
                           System.out.println("Thirty-Fifteen");
                            } else {
                                if(pun[0]==30 && pun[1]==30){
                                  System.out.println("Thirty-All");
                                    } else {
                                        if(pun[0]==30 && pun[1]==40){
                                        System.out.println("Thirty-Fourty");
                                          } else {
                                            if((pun[0]==40 && pun[1]==40) || (pun[0]==50 && pun[1]==50)){
                                             System.out.println("Dauce");
                                                } else {
                                                   if(pun[0]==50 && pun[1]==40){
                                                    System.out.println("Anvantager Player 1");
                                                     } else {
                                                       if(pun[0]==50 && pun[1]==60){
                                                        System.out.println("Advantager Player 2");
                                                        } else {
                                                           if(pun[0]==50 && pun[1]==70){
                                                        System.out.println("Player 2 wins");
                                                       } 
                                                       }
                                                   }
                                            }
                                        }
                                }
                         }
                  }
           }
       }
    }
    
    public int puntoNormal(int a){
        a=a+15;
        return a;
    }
    
    public int puntoFinal(int a){
        a=a+10;
        return a;
    }
    
    public static void main(String [] arg){
        Tenis partido=new Tenis();
        
        int op=0;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(
            "Partido de Tenis"+"\n"+
            "Ingresa una opcion:"+"\n"+
            "[1] Inicia el juego"+"\n"+
            "[2] Siguiente punto"+"\n"+
            "[3] Temina juego" ));
            
            switch(op)
            {
                case 1: partido.point();
                    break;
                case 2: partido.score(partido.point());
                    break;
                case 3: System.exit(3);
                    break;
                             
            }
        }while(op!=3);
                    
            
    }
    
}
