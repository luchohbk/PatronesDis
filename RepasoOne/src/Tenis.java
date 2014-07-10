
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
    
    
   /* public int[] point (int a, int b){
        if(a==0 && b==0){
            scor[0]=a;
            scor[0]=b;
            return scor;
        } else {
            if(a==15 && b==)
        }
    } 
    */
    

    public String score(int [] pun){
        if(pun[0]==0 && pun[1]==0){
        return ("Love-All");
      	} else {
      	 	if(pun[0]==0 && pun[1]==15){
                    return ("Love   -   Fifteen");} 
                else {
       	  	if(pun[0]==0 && pun[1]==30){
                    return ("Love   -   Thirty");} 
                else {
                if(pun[0]==0 && pun[1]==40){
                    return ("Love   -   Forty");}
                else {
                if(pun[0]==15 && pun[1]==0){
                    return ("Fifteen   -   Love");} 
                else {
                if(pun[0]==30 && pun[1]==0){
                    return ("Thirty   -   Love");}
                else {
                if(pun[0]==40 && pun[1]==0){
                    return ("Forty   -   Love");}
                else {
                if(pun[0]==15 && pun[1]==15){
      	            return ("Fifteen-All");}
                else {
	        if(pun[0]==15 && pun[1]==30){
	            return ("Fifteen   -   Thirty");}
                else {
                if(pun[0]==15 && pun[1]==40){
	            return ("Fifteen   -   Forty");}
                else {                        
                if(pun[0]==30 && pun[1]==15){
                    return ("Thirty   -   Fifteen");}
                else {
	        if(pun[0]==40 && pun[1]==15){
                    return ("Forty   -   Fifteen");}
                else {
		if((pun[0]==30 && pun[1]==30)){
                    return ("Thirty-All");}
                else {
   		if(pun[0]==30 && pun[1]==40){
                    return ("Thirty   -   Forty");}
                else {
                if(pun[0]==40 && pun[1]==30){
                    return ("Forty   -   Thirty");}
                else {
                if(pun[0]==50 && pun[1]==0){
                    return ("Jugador 1 win");}
                else{
                if(pun[0]==50 && pun[1]==15){
                    return ("Jugador 1 win");}
                else{
                if(pun[0]==50 && pun[1]==30){
                    return ("Jugador 1 win");}
                else{
                if(pun[0]==0 && pun[1]==50){
                    return ("Jugador 2 win");}
                else{
                if(pun[0]==15 && pun[1]==50){
                    return ("Jugador 2 win");} 
                else {
                if(pun[0]==30 && pun[1]==50){
                    return ("Jugador 2 win");}
                else {
                if(pun[0]==40 && pun[1]==40){
                    return ("Deuce");}
                else {
                if(pun[0]==50 && pun[1]==50){
                    return ("Deuce");}
                else {
		if(pun[0]==60 && pun[1]==60){
                    return ("Deuce");} 
                else {
                if(pun[0]==50 && pun[1]==40){ 
                    return ("Advantager Jugador 1");}
                else {
                if(pun[0]==40 && pun[1]==50){
                    return ("Advantager Jugador 2");}
                else {
                if(pun[0]==60 && pun[1]==40){
                    return ("Jugador 1 win");}
                else {
                if(pun[0]==40 && pun[1]==60){
                    return ("Jugador 2 win");}
                else {
                if(pun[0]==60 && pun[1]==50){
                    return ("Advantager Jugador 1");}
                else {
                if(pun[0]==50 && pun[1]==60){
                    return ("Advantager Jugador 2");}
                else {
                if(pun[0]==50 && pun[1]==70){
                    return ("Jugador 1 win");}
                else {
                if(pun[0]==70 && pun[1]==50){
                    return ("Jugador 2 win");}
                else {
                if(pun[0]==70 && pun[1]==70){
                    return ("Deuce");}
                else {
                if(pun[0]==80 && pun[1]==80){
                    return ("Deuce");}
                else {
                if(pun[0]==70 && pun[1]==60){
                    return ("Adeventager Jugador 1");}
                else {
                if(pun[0]==60 && pun[1]==70){
                    return ("Adeventager Jugador 2");}
                else {
                if(pun[0]==80 && pun[1]==60){
                    return ("Jugador 1 win");}
                else {
                if(pun[0]==60 && pun[1]==80){
                    return ("Jugador 2 win");}
                    }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
        return "Fin";
    }
                
          
    public int puntoNormal(int a){
        a=a+15;
        return a;
    }
    
    public int puntoFinal(int a){
        a=a+10;
        return a;
    }
   
    
}
