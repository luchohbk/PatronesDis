/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tennisgame;

/**
 *
 * @author Lucho
 */
import tennisgame.idioma.IdiomaAleman;
import tennisgame.idioma.IdiomaFrances;
import tennisgame.idioma.IdiomaEspanol;
import tennisgame.idioma.IdiomaIngles;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import tennisgame.tennis.Tablero;
import tennisgame.tennis.Tennis;

final class GameTennis extends JPanel implements Runnable, KeyListener {
    private double xbol;
    private double ybol;
    private double xp1;
    private double yp1;
    private double xp2;
    private double yp2;
    private double speed = 6.0;
    private double vel = 5.0;
    private int player1 = 1;
    private int player2 = 1;
    private int pelotaX = 1;
    private int pelotaY = 1;
    int puntoJ1;
    int puntoJ2;
    boolean juego, gameOver;
    Tennis t = new Tennis();   
    String datos[] = new String[3];
    Tablero ta=new Tablero();
    int idio;
        
    protected GameTennis() {
        juego=true;
        this.xbol = 30;
        this.ybol = 0;
        this.xp1 = 565;
        this.yp1 = 180;
        this.xp2 = 10;
        this.yp2 = 180;
        idio=seleccionarIdioma();
        crearIdioma(idio);
        ta.setVisible(true);
        ta.setLocation(0, 270);
        ta.setTitle("Marcador");
    }
        
    public int  seleccionarIdioma(){
        int seleccion = JOptionPane.showOptionDialog(null,"Seleccione idioma", "Selector de opciones",
        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[] { "Español", "English", "Français", "Deutsch"}, null);
        return seleccion;
    }
        
    public void crearIdioma(int idioma){
        if(idioma==0) {
            t.setIdioma(new IdiomaEspanol());
        }
        if(idioma==1){
            t.setIdioma(new IdiomaIngles());
        }
        if(idioma==2) {
            t.setIdioma(new IdiomaFrances());
        }
        if(idioma==3){
            t.setIdioma(new IdiomaAleman());
        }
    }
        
    public void paint(Graphics gr) {
	super.paint(gr);
	Graphics2D g = (Graphics2D)gr;
	g.setColor(Color.GREEN);
	g.fill(new Ellipse2D.Double(this.xbol, this.ybol, 20, 20));
	g.setColor(Color.BLUE);
	g.fill(new Rectangle2D.Double(this.xp1, this.yp1, 15, 60));
	g.setColor(Color.CYAN);
	g.fill(new Rectangle2D.Double(this.xp2, this.yp2, 15, 60));	
    }

    public void keyPressed(KeyEvent e) {
	int c = e.getKeyCode();
	switch (c) {
            case KeyEvent.VK_DOWN:
            this.player1 = 0;
            break;    
            case KeyEvent.VK_UP:
            this.player1 = 1;
            break;    
            case KeyEvent.VK_Z:
            this.player2 = 0;
            break;
            case KeyEvent.VK_A:
            this.player2 = 1;
            break;
        }
    }

    public void keyReleased(KeyEvent e) {
	return;
    }
    
    public void keyTyped(KeyEvent e) {
	return;
    }
        
    public void run() {
        while (juego) {
            movimientoJugadorUno();
            movimientoJugadorDos();
            puntoJugador();
            rebotaPelotaConPared();
            try {
		Thread.sleep((int)Math.round(30));
            } catch (Exception e) {}
            rebotePelotaConJugador1();
            rebotePelotaConJugador2();
            super.repaint();
        }
    }
    
    public void movimientoJugadorUno(){
        if (player1 == 0) {
            this.yp1 += this.speed;
            if (this.yp1 > 315) {
		this.yp1 = 315;
            } 
        }             
	if (player1 == 1) {
            this.yp1 -= this.speed;
            if (this.yp1 < 0) {
                this.yp1 = 0;
            }
        }
    }
        
    public void movimientoJugadorDos(){
        if (player2 == 0) {
            this.yp2 += this.speed;
            if (this.yp2 > 315) {
		this.yp2 = 315;
            }
        }
        if (player2 == 1) {
            this.yp2 -= this.speed;
            if (this.yp2 < 0) {
                this.yp2 = 0;
            }
        }
    }
    
    public void rebotePelotaConJugador1(){
        double check1 = this.yp1-15;
	while (check1 <= this.yp1+60) {
            if (this.xp1 == this.xbol+20 && check1 == this.ybol) {		
		if (player1 == 0) {
                    this.pelotaX = 0;
                    this.pelotaY = 1;
                }
                if (player1 == 1) {
                    this.pelotaX = 0;
                    this.pelotaY = 0;
                }
            }
            check1 += 1.0;
        }
    }   
    
    public void rebotePelotaConJugador2(){
        double check2 = this.yp2-15;
        while (check2 <= this.yp2+60) {
            if (this.xp2+15 == this.xbol && check2 == this.ybol) {
		if (player2 == 0) {
                    this.pelotaX = 1;
                    this.pelotaY = 1;
                }
                if (player2 == 1) {
                this.pelotaX = 1;
                this.pelotaY = 0;
                }
            }
            check2 += 1.0;
        }
    }
    
    public void rebotaPelotaConPared(){
        if (pelotaY == 0) {
            this.ybol -= this.vel;
            if (this.ybol < 0) {
                this.pelotaY = 1;
                }
        }
        if (pelotaY == 1) {
            this.ybol += this.vel;
            if (this.ybol > 350) {
            this.pelotaY = 0;
            }
        }
    }
    
    public void puntoJugador(){
        if (pelotaX == 0) {
            this.xbol -= this.vel;
            if (this.xbol < 0) {
                this.pelotaX = 1;
                this.xbol = 100;
                puntoJ2 = t.point(2);
                puntajeEnTabla();
                gameOver();
            }
        } else{
            if (pelotaX == 1) {
                this.xbol += this.vel;
                if (this.xbol > 570) {
                this.pelotaX = 0;
                this.xbol = 360;
                puntoJ1 = t.point(1);
                puntajeEnTabla();
                gameOver();
                }
            }
        }
    }
   
    public void gameOver(){
        if(t.score().equals("Player 1 wins") || t.score().equals("Player 2 wins") ||
           t.score().equals("Player 1 gana") || t.score().equals("Player 2 gana") ||
           t.score().equals("Player 1 Gagner") || t.score().equals("Player 2 Gagner") ||     
           t.score().equals("Player 1 Verdienen") || t.score().equals("Player 2 Verdienen")){
            juego=false;
            gameOver=true;
            JOptionPane.showMessageDialog(this, t.score());
        }
    }
        
    public void puntajeEnTabla(){
        datos[0]=Integer.toString(puntoJ1);
        datos[1]=Integer.toString(puntoJ2);
        datos[2]=t.score();
        ta.llenarTabla(datos);
    }    
} 
