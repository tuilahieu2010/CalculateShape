/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Common.Algorithm;
import View.Menu;

/**
 *
 * @author hieu
 */
public class ManagerMenu extends Menu<String>{
    static String[] options = {"Circle", "Triangle", "Rectangle", "Exit"};
    Algorithm algorithm;
    public ManagerMenu() {
        super("===== CALCULATOR SHAPE PROGRAM =====", options);
        algorithm = new Algorithm();
    }
    
    @Override
    public void execute(int n) {
        switch(n) {
            case 1:
                algorithm.displayCircle();
                break;
            case 2:
                algorithm.displayTriangle();
                break;
            case 3:
                algorithm.displayRectangle();
                break;
            case 4:
                System.exit(0);
                
        }
    }
}