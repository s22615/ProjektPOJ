package pl.edu.pjatk;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hello {
    private JFrame windowHello = new JFrame("ProjektPOJ - system do zamawiania pizzy");
    private JLabel przywitanie = new JLabel();
    private JLabel imieL = new JLabel();
    private JLabel nazwiskoL = new JLabel();
    private JLabel adresL = new JLabel();
    private JLabel nrtelL = new JLabel();
    private JTextField imie = new JTextField();
    private JTextField nazwisko = new JTextField();
    private JTextField adres = new JTextField();
    private JTextField nr_telefonu = new JTextField();
    private JButton dalej = new JButton("Dalej");
    public Hello() {
        przywitanie.setBounds(50,10,350,30);
        imieL.setBounds(100,60,80,30);
        imie.setBounds(180,60,110,30);
        nazwiskoL.setBounds(100,100,80,30);
        nazwisko.setBounds(180,100,110,30);
        adresL.setBounds(100,140,80,30);
        adres.setBounds(180,140,110,30);
        nrtelL.setBounds(100,180,80,30);
        nr_telefonu.setBounds(180,180,110,30);
        dalej.setBounds(160,230,80,30);

        przywitanie.setText(String.format("Wprowadz dane aby móc skomponowac swoja pizze!"));
        imieL.setText(String.format("Imie: "));
        nazwiskoL.setText(String.format("Nazwisko: "));
        adresL.setText(String.format("Adres: "));
        nrtelL.setText(String.format("Nr telefonu: "));

        windowHello.add(przywitanie);
        windowHello.add(imieL);
        windowHello.add(imie);
        windowHello.add(nazwiskoL);
        windowHello.add(nazwisko);
        windowHello.add(adresL);
        windowHello.add(adres);
        windowHello.add(nrtelL);
        windowHello.add(nr_telefonu);
        windowHello.add(dalej);

        dalej.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(imie.getText().isEmpty() || nazwisko.getText().isEmpty()  || adres.getText().isEmpty()  || nr_telefonu.getText().isEmpty() ){
                    JOptionPane.showMessageDialog(null, "Prosze uzupelnic kazde pole swoimi danymi!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }else{
                    Pattern patterntel = Pattern.compile("\\d{3}[ -]?\\d{3}[ -]?\\d{3}(?!\\w)");
                    Pattern patternname = Pattern.compile("^[a-zA-Z]+");
                    Matcher matcher = patterntel.matcher(nr_telefonu.getText());
                    Matcher matchername = patternname.matcher(imie.getText());
                    Matcher matchername2 = patternname.matcher(imie.getText());
                    if(matcher.matches() && matchername.matches() && matchername2.matches()){
                        PizzaMaker pizzaMaker = new PizzaMaker(imie.getText(),nazwisko.getText(),adres.getText(),nr_telefonu.getText());
                        windowHello.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Blednie wprowadzone dane! Sprobuj jeszcze raz!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
            }}
        });

        windowHello.setLocationRelativeTo(null);
        windowHello.setSize(420,320);
        windowHello.setLayout(null);
        windowHello.setVisible(true);
    }
}
