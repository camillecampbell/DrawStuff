/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.ApplicationStarter;
import javafx.application.Application;

/**
 *
 * @author Camille
 */
public class DrawStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    startup();
    }

    private static void startup() {
        ApplicationStarter.run("My First Drawing", new DrawingEnvironment());
    }
    
}
