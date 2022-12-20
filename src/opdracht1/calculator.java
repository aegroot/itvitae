package opdracht1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends  JFrame {
    private JPanel TextPanel;
    private JPanel LogicPanel;
    private JButton a4Button;
    private JButton button2;
    private JButton a5Button;
    private JButton a6Button;
    private JButton button5;
    private JButton button6;
    private JButton submitButton;
    private JButton button8;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton button12;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton button16;
    private JPanel MainPanel;
    private JTextPane output;

    public  calculator(){
        setContentPane(MainPanel);
        setTitle("calculator");
        setSize(400,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);





    }

    public static void main(String[] args) {
        calculator calc=new calculator();

    }


}
