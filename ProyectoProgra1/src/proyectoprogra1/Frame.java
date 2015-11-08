/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra1;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author KevinReynaldo
 */
public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800,600);
        Tabla conecta4= new Tabla();
        frame.add(conecta4);
        frame.show();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
