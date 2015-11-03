/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Camille
 */
class DrawingEnvironment extends Environment {

    Image logo;
    
    
    public DrawingEnvironment() {
        logo = ResourceTools.loadImageFromResource("drawstuff/Apple_Logo_blue_Transparent.png");
        this.setBackground(Color.white);
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
//        graphics.setColor(Color.red);
//        graphics.drawOval(150, 150, 100, 100);
//        
//        graphics.setColor(Color.blue);
//        graphics.drawOval(200, 200, 100, 100);
//        
//        graphics.setColor(Color.yellow);
//        graphics.drawOval(250, 150, 100, 100);
//        
//        graphics.setColor(Color.green);
//        graphics.drawOval(300, 200, 100, 100);
//        
//        graphics.setColor(Color.orange);
//        graphics.drawOval(350, 150, 100, 100);
//       
//        
//        
//        //venn diagram
//        
//        graphics.setColor(new Color(255,0,30, 120));
//        graphics.fillOval(450, 450, 100, 100);
//        
//        graphics.setColor(new Color(0,255,70,120));
//        graphics.fillOval(500, 450, 100, 100);
//        
//        graphics.setColor(new Color(0,75,255,120));
//        graphics.fillOval(475, 400, 100, 100);
//        
//        graphics.setColor(Color.pink);
//        graphics.drawRect(600, 390, 100, 100);
//        
//        
//        graphics.setColor(Color.green);
//        graphics.fillRect(600, 250, 100, 100);
//        
//        graphics.drawLine(300, 320, 90, 10);
//        
//        
        //Apple add
        graphics.drawImage(logo, 500, 500, 100, 100, this);
        graphics.setColor(new Color(60, 175, 255, 120));
        graphics.fillOval(100, 100, 100, 100);
        graphics.fillOval(450, 300, 100, 100);
        graphics.fillOval(600, 500, 100, 100);
        graphics.setColor(Color.orange);
        graphics.fillOval(700, 230, 100, 100);
        graphics.fillOval(470, 40, 100, 100);
        graphics.fillOval(40, 520, 100, 100);
        graphics.setColor(new Color (220,0,130,120));
        graphics.fillOval(200, 200, 100, 100);
        graphics.fillOval(520, 460, 100, 100);
        graphics.setColor(new Color(22, 79, 250, 145));
        graphics.fillOval(230, 200, 100, 100);
        graphics.fillOval(630, 70, 100, 100);
        graphics.fillOval(100, 130, 100, 100);
        graphics.setColor(new Color (200,200,30,90));
        graphics.fillOval(650, 90, 100, 100);
        graphics.fillOval(90, 349, 100, 100);
        graphics.setColor(new Color (21, 0, 222,140));
        graphics.fillOval(200, 480, 100, 100);
        graphics.fillOval(500, 500, 100, 100);
        graphics.fillOval(330, 220, 100, 100);
        graphics.fillOval(700, 20, 100, 100);
        graphics.setColor(new Color (200,90,70, 110));
        graphics.fillOval(600, 400, 100, 100);
        graphics.fillOval(500, 500, 100, 100);
        graphics.fillOval(240, 400, 100, 100);
        graphics.setColor(new Color (80,90,120,180));
        graphics.fillOval(100, 130, 100, 100);
        graphics.setColor(new Color (175, 0, 60, 100));
        graphics.fillOval(300, 300, 100, 100);
        graphics.setColor(new Color (240,0,190,122));
        graphics.fillOval(220, 20, 100, 100);
        graphics.setColor(Color.black);
        
        
        graphics.setFont(new Font ("Ariel", Font.BOLD, 35));
        graphics.drawString("Apple is Revolutionary", 100, 300);
    
        if (logo != null) {
            graphics.drawImage(logo, 500, 120, 200, 200, this);
        }
        
    }
     

    
   
    

}
