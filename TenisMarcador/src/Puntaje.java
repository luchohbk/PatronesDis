
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
public class Puntaje {
    
    String j1="Jugador 1";
    String j2="Jugador 2";
    
    public String scoreIng(int [] pun){
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
                if((pun[0]==50 && pun[1]==0) || (pun[0]==50 && pun[1]==15) || (pun[0]==50 && pun[1]==30) || (pun[0]==60 && pun[1]==40) || (pun[0]==70 && pun[1]==50) || (pun[0]==80 && pun[1]==60)){
                    return ("Player 1 win");}
                else{
                if((pun[0]==0 && pun[1]==50) || (pun[0]==15 && pun[1]==50) || (pun[0]==30 && pun[1]==50) || (pun[0]==40 && pun[1]==60) || (pun[0]==50 && pun[1]==70) || (pun[0]==60 && pun[1]==80)){
                    return ("Player 2 win");}
                else {
                if((pun[0]==40 && pun[1]==40) || (pun[0]==50 && pun[1]==50) || (pun[0]==60 && pun[1]==60) || (pun[0]==70 && pun[1]==70) || (pun[0]==80 && pun[1]==80)){
                    return ("Deuce");}
                else {
                if((pun[0]==50 && pun[1]==40) || (pun[0]==60 && pun[1]==50) || (pun[0]==70 && pun[1]==60)){ 
                    return ("Advantage player 1");}
                else {
                if( (pun[0]==40 && pun[1]==50) || (pun[0]==50 && pun[1]==60) || (pun[0]==60 && pun[1]==70)){
                    return ("Advantage player 2");}
                    }}}}}}}}}}}}}}}}}}}
        return "Fin";
    }
                
    public String scoreEsp(int [] pun){
        if(pun[0]==0 && pun[1]==0){
        return ("Cero - Iguales");
      	} else {
      	 	if(pun[0]==0 && pun[1]==15){
                    return ("Cero - Quince");} 
                else {
       	  	if(pun[0]==0 && pun[1]==30){
                    return ("Cero - Treinta");} 
                else {
                if(pun[0]==0 && pun[1]==40){
                    return ("Cero - Cuarenta");}
                else {
                if(pun[0]==15 && pun[1]==0){
                    return ("Quince - Cero");} 
                else {
                if(pun[0]==30 && pun[1]==0){
                    return ("Treinta - Cero");}
                else {
                if(pun[0]==40 && pun[1]==0){
                    return ("Cuarenta - Cero");}
                else {
                if(pun[0]==15 && pun[1]==15){
      	            return ("Quince - Iguales");}
                else {
	        if(pun[0]==15 && pun[1]==30){
	            return ("Quince - Treinta");}
                else {
                if(pun[0]==15 && pun[1]==40){
	            return ("Quince - Cuarenta");}
                else {                        
                if(pun[0]==30 && pun[1]==15){
                    return ("Treinta - Quince");}
                else {
	        if(pun[0]==40 && pun[1]==15){
                    return ("Cuarenta - Quince");}
                else {
		if((pun[0]==30 && pun[1]==30)){
                    return ("Treinta - Iguales");}
                else {
   		if(pun[0]==30 && pun[1]==40){
                    return ("Treinta - Cuarenta");}
                else {
                if(pun[0]==40 && pun[1]==30){
                    return ("Cuarenta - Treinta");}
                else {
                if((pun[0]==50 && pun[1]==0) || (pun[0]==50 && pun[1]==15) || (pun[0]==50 && pun[1]==30) || (pun[0]==60 && pun[1]==40) || (pun[0]==70 && pun[1]==50) || (pun[0]==80 && pun[1]==60)){
                    return ("Gana jugador 1");}
                else{
                if((pun[0]==0 && pun[1]==50) || (pun[0]==15 && pun[1]==50) || (pun[0]==30 && pun[1]==50) || (pun[0]==40 && pun[1]==60) || (pun[0]==50 && pun[1]==70) || (pun[0]==60 && pun[1]==80)){
                    return ("Gana jugador 2");}
                else {
                if((pun[0]==40 && pun[1]==40) || (pun[0]==50 && pun[1]==50) || (pun[0]==60 && pun[1]==60) || (pun[0]==70 && pun[1]==70) || (pun[0]==80 && pun[1]==80)){
                    return ("Empate");}
                else {
                if((pun[0]==50 && pun[1]==40) || (pun[0]==60 && pun[1]==50) || (pun[0]==70 && pun[1]==60)){ 
                    return ("Ventaja para Jugador 1");}
                else {
                if( (pun[0]==40 && pun[1]==50) || (pun[0]==50 && pun[1]==60) || (pun[0]==60 && pun[1]==70)){
                    return ("Ventaja para Jugador 2");}
                    }}}}}}}}}}}}}}}}}}}
        return "Fin";
    }
    
        public String scoreFra(int [] pun){
        if(pun[0]==0 && pun[1]==0){
        return ("Zero - gliale ");
      	} else {
      	 	if(pun[0]==0 && pun[1]==15){
                    return ("Zero - Coing");} 
                else {
       	  	if(pun[0]==0 && pun[1]==30){
                    return ("Zero - Trente");} 
                else {
                if(pun[0]==0 && pun[1]==40){
                    return ("Zero - Quarante");}
                else {
                if(pun[0]==15 && pun[1]==0){
                    return ("Quince - Zéro");} 
                else {
                if(pun[0]==30 && pun[1]==0){
                    return ("Trente - Zéro ");}
                else {
                if(pun[0]==40 && pun[1]==0){
                    return ("Quarante - Zéro ");}
                else {
                if(pun[0]==15 && pun[1]==15){
      	            return ("Quince - même ");}
                else {
	        if(pun[0]==15 && pun[1]==30){
	            return ("Quince - Trente");}
                else {
                if(pun[0]==15 && pun[1]==40){
	            return ("Quince - Quarante");}
                else {                        
                if(pun[0]==30 && pun[1]==15){
                    return ("Trente - Coing");}
                else {
	        if(pun[0]==40 && pun[1]==15){
                    return ("Quarante - Coing");}
                else {
		if((pun[0]==30 && pun[1]==30)){
                    return ("Trente - même");}
                else {
   		if(pun[0]==30 && pun[1]==40){
                    return ("Trente - Quarante");}
                else {
                if(pun[0]==40 && pun[1]==30){
                    return ("Quarante - Trente ");}
                else {
                if((pun[0]==50 && pun[1]==0) || (pun[0]==50 && pun[1]==15) || (pun[0]==50 && pun[1]==30) || (pun[0]==60 && pun[1]==40) || (pun[0]==70 && pun[1]==50) || (pun[0]==80 && pun[1]==60)){
                    return ("Joueur 1 gagne ");}
                else{
                if((pun[0]==0 && pun[1]==50) || (pun[0]==15 && pun[1]==50) || (pun[0]==30 && pun[1]==50) || (pun[0]==40 && pun[1]==60) || (pun[0]==50 && pun[1]==70) || (pun[0]==60 && pun[1]==80)){
                    return ("Faites le joueur 2 ");}
                else {
                if((pun[0]==40 && pun[1]==40) || (pun[0]==50 && pun[1]==50) || (pun[0]==60 && pun[1]==60) || (pun[0]==70 && pun[1]==70) || (pun[0]==80 && pun[1]==80)){
                    return ("Tirer ");}
                else {
                if((pun[0]==50 && pun[1]==40) || (pun[0]==60 && pun[1]==50) || (pun[0]==70 && pun[1]==60)){ 
                    return ("Avantage pour le joueur 1 ");}
                else {
                if( (pun[0]==40 && pun[1]==50) || (pun[0]==50 && pun[1]==60) || (pun[0]==60 && pun[1]==70)){
                    return ("Avantage Joueur 2 ");}
                    }}}}}}}}}}}}}}}}}}}
        return "Fin";
    }
}