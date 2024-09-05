package Schach.view;

import javax.swing.*;

public class Spielbrett extends JFrame {
    private JButton btFeldAOne;
    private JButton btFieldATwo;
    private JButton btFieldAThree;
    private JButton btFieldAFour;
    private JButton btFiledAFive;
    private JButton btFieldEight;
    private JButton btFieldSeven;
    private JButton btFieldASix;
    private JPanel pnSpielbrett;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public Spielbrett() {
        setContentPane(pnSpielbrett);
        setSize(600, 600);
        setVisible(true);

    }
}
