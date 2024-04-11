import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Swing Window");

        // Top Panel
        JPanel panel = new JPanel(new BorderLayout());
        panel.setSize(100,100);
        panel.setVisible(true);
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        topPanel.setBackground(new Color(50, 50, 50));
        topPanel.setSize(200,200);
        JButton btnFlow01 = new JButton("Flow01");
        btnFlow01.setForeground(new Color(255, 255, 255));
        btnFlow01.setBackground(new Color(205, 72, 185));
        JButton btnFlow02 = new JButton("Flow02");
        btnFlow02.setForeground(new Color(255, 255, 255));
        btnFlow02.setBackground(new Color(205, 72, 185));
        topPanel.add(btnFlow01);
        topPanel.add(btnFlow02);
        panel.add(topPanel,BorderLayout.NORTH);


        // West Panel
        JPanel westPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        westPanel.setBackground(new Color(144, 143, 145));
        JButton btnFlow03 = new JButton("Flow03");
        btnFlow03.setForeground(new Color(255, 255, 255));
        btnFlow03.setBackground(new Color(62, 70, 140));
        JButton btnFlow04 = new JButton("Flow04");
        btnFlow04.setBackground(new Color(62, 70, 140));
        btnFlow04.setForeground(new Color(255, 255, 255));
        westPanel.add(btnFlow03);
        westPanel.add(btnFlow04);
        panel.add(westPanel, BorderLayout.WEST);

        //Center Panel
        JPanel eastPanel = new JPanel(new GridLayout(2,2,5,5));
        eastPanel.setBackground(new Color(201, 199, 205));
        JButton Grid01 = new JButton("Grid01");
        Grid01.setBackground(new Color(224, 26, 47));
        Grid01.setForeground(new Color(255, 255, 255));
        JButton Grid02 = new JButton("Grid02");
        Grid02.setForeground(new Color(255, 255, 255));
        Grid02.setBackground(new Color(217, 107, 40));
        JButton Grid03 = new JButton("Grid03");
        Grid03.setForeground(new Color(255, 255, 255));
        Grid03.setBackground(new Color(122, 49, 99));
        JButton Grid04 = new JButton("Grid04");
        Grid04.setForeground(new Color(255, 255, 255));
        Grid04.setBackground(new Color(58, 173, 52));
        eastPanel.add(Grid01);
        eastPanel.add(Grid02);
        eastPanel.add(Grid03);
        eastPanel.add(Grid04);
        panel.add(eastPanel, BorderLayout.CENTER);

        frame.getContentPane().add(panel);
        // Set JFrame size
        frame.setSize(600, 400);


        frame.setLocationRelativeTo(null);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the JFrame visible
        frame.setVisible(true);
    }
}
