package pl.edu.pjatk;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hello {
    private JFrame windowHello = new JFrame();
    private JTextField imie = new JTextField();
    private JTextField nazwisko = new JTextField();
    private JTextField adres = new JTextField();
    private JTextField nr_telefonu = new JTextField();
    private JButton dalej = new JButton("Dalej");
    public Hello() {
        imie.setBounds(30,60,110,30);
        nazwisko.setBounds(30,90,110,30);
        adres.setBounds(30,120,110,30);
        nr_telefonu.setBounds(30,150,110,30);
        dalej.setBounds(30,180,150,40);

        windowHello.add(imie);
        windowHello.add(nazwisko);
        windowHello.add(adres);
        windowHello.add(nr_telefonu);
        windowHello.add(dalej);

        dalej.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main main = new Main(imie.getText(),nazwisko.getText(),adres.getText(),nr_telefonu.getText());
                windowHello.dispose();
            }
        });

        windowHello.setLocationRelativeTo(null);
        windowHello.setSize(420,420);
        windowHello.setLayout(null);
        windowHello.setVisible(true);
    }
}
