/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Eduardo
 */
public class Juego {

    JFrame ventana;
    JPanel panelJuego;
    JLabel fondo;
    // serpiente
    ArrayList<JLabel> serpiente;
    int x;
    int y;
    int desplazaminto = 20;
    Timer tiempo;
    int ban = 0;
    Rectangle serp;
    //comida
    JLabel comida;
    int cx = 0;
    int cy = 0;
    Rectangle com;
    int perdio = 0;
    //puntuacion
    JLabel puntuacion;
    int contador = 0;
    String [] botones = {"volver a jugar", "Salir" }; 
    Object [] botons = {"volver a jugar", "Salir" };
    public Juego() {
        //ventana
        ventana = new JFrame("Juego Snake");
        ventana.setSize(600, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        //panel
        panelJuego = new JPanel();
        panelJuego.setSize(ventana.getSize());
        panelJuego.setLayout(null);
        panelJuego.setVisible(true);
        panelJuego.setBackground(Color.white);
        //fondo
        fondo = new JLabel();
        fondo.setSize(panelJuego.getSize());
        fondo.setVisible(true);
        //serpiente
        serpiente = new ArrayList<JLabel>();
        JLabel aux = new JLabel();
        aux.setLocation(290, 290);
        aux.setSize(20, 20);
        aux.setIcon(new ImageIcon("imagenes/2.png"));
        aux.setVisible(true);
        serpiente.add(aux);
        panelJuego.add(serpiente.get(0), 0);
        
        tiempo = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                com.setBounds(comida.getBounds());
                serp.setBounds(serpiente.get(0).getBounds());
                if (serpiente.get(0).getX() > 560) {
                    perdio = 1;
                }
                if (serpiente.get(0).getX() < 10) {
                    perdio = 1;
                }
                if (serpiente.get(0).getY() > 560) {
                    perdio = 1;
                }
                if (serpiente.get(0).getY() < 10) {
                    perdio = 1;
                }
                if (perdio == 1) {
                    
                    JOptionPane.showMessageDialog(null, "Perdiste, Obtuviste una puntuacion de:" + " " + contador + " " + "puntos");
                    tiempo.stop();
                    ventana.dispose();
                    Cuadro ObjForm= new Cuadro(ventana, true);
                    ObjForm.setVisible(true);
                }
                
                if (com.intersects(serp)) {
                    Random ale = new Random();
                    cx = ale.nextInt(560);
                    cy = ale.nextInt(560);
                    comida.setLocation(cx, cy);
                    comida.repaint();
                    JLabel aux = new JLabel();
                    aux.setLocation(200, 200);
                    aux.setSize(20, 20);
                    aux.setIcon(new ImageIcon("imagenes/1.png"));
                    aux.setVisible(true);
                    serpiente.add(aux);
                    panelJuego.add(serpiente.get(serpiente.size() - 1), 0);
                    contador += 20;
                    puntuacion.setText("Puntuacion" + " " + contador);
                    puntuacion.repaint();
                }
                for (int i = serpiente.size() - 1; i > 0; i--) {
                    serpiente.get(i).setLocation(serpiente.get(i - 1).getLocation());
                    serpiente.get(i).repaint();
                }
                serpiente.get(0).setLocation(serpiente.get(0).getX() + x, serpiente.get(0).getY() + y);
            }
        });

        //movimientos
        ventana.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    
                    if (serpiente.get(0).getY() > 0) {
                        y = -desplazaminto;
                        x = 0;
                        serpiente.get(0).setIcon(new ImageIcon("imagenes/5.png"));
                    }
                    if (ban == 0) {
                        tiempo.start();
                        ban = 1;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    
                    if (serpiente.get(0).getY() < 600) {
                        y = desplazaminto;
                        x = 0;
                        serpiente.get(0).setIcon(new ImageIcon("imagenes/3.png"));
                    }
                    if (ban == 0) {
                        tiempo.start();
                        ban = 1;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    
                    if (serpiente.get(0).getX() > 0) {
                        y = 0;
                        x = -desplazaminto;
                        serpiente.get(0).setIcon(new ImageIcon("imagenes/4.png"));
                    }
                    if (ban == 0) {
                        tiempo.start();
                        ban = 1;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    
                    if (serpiente.get(0).getX() < 600) {
                        y = 0;
                        x = desplazaminto;
                        serpiente.get(0).setIcon(new ImageIcon("imagenes/2.png"));
                    }
                    if (ban == 0) {
                        tiempo.start();
                        ban = 1;
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        panelJuego.add(fondo, 0);
        ventana.add(panelJuego);
        ventana.setVisible(true);
        //comida
        comida = new JLabel();
        comida.setSize(20, 20);
        comida.setVisible(true);
        panelJuego.add(comida, 0);
        comida.setIcon(new ImageIcon("imagenes/6.png"));
        Random ale = new Random();
        cx = ale.nextInt(560);
        cy = ale.nextInt(560);
        comida.setLocation(cx, cy);
        //sobreponer
        serp = new Rectangle(serpiente.get(0).getBounds());
        com = new Rectangle(comida.getBounds());
        puntuacion = new JLabel("Puntuacion" + " " + contador);
        puntuacion.setBounds(10, 20, 100, 20);
        puntuacion.setVisible(true);
        puntuacion.setForeground(Color.red);
        panelJuego.add(puntuacion);
    }// fin de constructor
}
