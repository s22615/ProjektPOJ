package pl.edu.pjatk;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;

public class Output {
    JFrame jFrame = new JFrame();
    JLabel jLabel = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JButton jButton = new JButton();
    String[] s1 = new String[1];
    String[] s2 = new String[1];
    String[] s3 = new String[1];
    String[] s4 = new String[1];
    String[] s5 = new String[1];
    HashSet<String> skladniki = new HashSet<>();
    String[] s7 = new String[1];

    public Output(String[] s1, String[] s2, String[] s3, String[] s4, String[] s5, HashSet<String> skladniki, String[] s7) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.skladniki = skladniki;
        this.s7 = s7;
        jFrame.setLayout(null);
        String rozmiar = s1[0];
        String rozmiar2 = s2[0];
        String rozmiar3 = s3[0];
        String rozmiar4 = s4[0];
        String rozmiar5 = s5[0];
        String rozmiar6 = "";
        for (String s : skladniki) {
            rozmiar6 = rozmiar6 + ", " + s;
        }
        System.out.println(rozmiar6);
        String rozmiar7 = s7[0];

        jLabel.setText(String.format("rozmiar: %s \n, ciasto: %s \n,dodatkowy sos: %s \n",rozmiar,rozmiar2,rozmiar3));
        jLabel2.setText(String.format("Dodatkowe przyprawy: %s \n, oliwa: %s \n, dostawa: %s \n",rozmiar4,rozmiar5,rozmiar7));
        jLabel3.setText(String.format("Skladniki: %s", rozmiar6));

        jFrame.add(jLabel);
        jFrame.add(jLabel2);
        jFrame.add(jLabel3);
        jFrame.add(jButton);

        jLabel.setBounds(30,50, 600, 50);
        jLabel2.setBounds(30,150, 600, 50);
        jLabel3.setBounds(30,250, 600, 50);


        jFrame.setSize(700,700);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


}
