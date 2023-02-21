package ru.samegames;

import javax.swing.JFrame;

public class App {
    public static void main( String[] args ) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D RPG");

        GamePanel panel = new GamePanel();
        window.add(panel);
        
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        panel.startGameThread();
    }
}
