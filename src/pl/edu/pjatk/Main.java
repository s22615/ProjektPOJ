package pl.edu.pjatk;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("ProjektPOJ - system do zamawiania pizzy");
        window.setLayout(null);
        JLabel nameApl = new JLabel("Zamawanie pizzy!");
        JLabel nameSec1 = new JLabel("Rozmiar");
        JCheckBox btnsmall = new JCheckBox("mala");
        JCheckBox btnmedium = new JCheckBox("srednia");
        JCheckBox btnlarge = new JCheckBox("duza");
        JLabel nameSec2 = new JLabel("Ciasto");
        JCheckBox btncienkie = new JCheckBox("cienkie");
        JCheckBox btngrube = new JCheckBox("grube");
        JCheckBox btnrazowe = new JCheckBox("razowe");
        JCheckBox btntradycyjne = new JCheckBox("tradycyjne");
        JLabel nameSec3 = new JLabel("Dodatkowy sos");
        JCheckBox btnbraks = new JCheckBox("brak");
        JCheckBox btnsweetchilli = new JCheckBox("sweet-chilli");
        JCheckBox btnczosnkowy = new JCheckBox("czosnkowy");
        JCheckBox btnBBQ = new JCheckBox("BBQ");
        JLabel nameSec4 = new JLabel("Dodatkowe przyprawy");
        JCheckBox btnbrakp = new JCheckBox("brak");
        JCheckBox btnoregano = new JCheckBox("oregano");
        JCheckBox btnbaz = new JCheckBox("suszona bazylia");
        JCheckBox btnzprowan = new JCheckBox("zioła prowansalskie");
        JLabel nameSec5 = new JLabel("Oliwa");
        JCheckBox btnbrako = new JCheckBox("brak");
        JCheckBox btnczosnkowao = new JCheckBox("czosnkowa");
        JCheckBox btnchillio = new JCheckBox("chilli");
        JCheckBox btnziolowao = new JCheckBox("ziolowa");


        nameApl.setBounds(165,30,280,30);
        //sec1
        nameSec1.setBounds(30,60,150,40);
        btnsmall.setBounds(50,90,70,30);
        btnmedium.setBounds(120,90,70,30);
        btnlarge.setBounds(190,90,70,30);
        //sec2
        nameSec2.setBounds(30,120,150,40);
        btncienkie.setBounds(50,150,70,30);
        btngrube.setBounds(120,150,70,30);
        btnrazowe.setBounds(190,150,70,30);
        btntradycyjne.setBounds(260,150,110,30);
        //sec3
        nameSec3.setBounds(30,180,150,40);
        btnbraks.setBounds(50,210,70,30);
        btnsweetchilli.setBounds(120,210,70,30);
        btnczosnkowy.setBounds(190,210,70,30);
        btnBBQ.setBounds(260,210,70,30);
        //sec4
        nameSec4.setBounds(30,240,150,40);
        btnbrakp.setBounds(50,270,70,30);
        btnoregano.setBounds(120,270,70,30);
        btnbaz.setBounds(190,270,70,30);
        btnzprowan.setBounds(260,270,70,30);
        //sec5
        nameSec5.setBounds(30,300,150,40);
        btnbrako.setBounds(50,330,70,30);
        btnczosnkowao.setBounds(120,330,70,30);
        btnchillio.setBounds(190,330,70,30);
        btnziolowao.setBounds(260,330,70,30);

        window.add(nameApl);
        window.add(nameSec1);
        window.add(btnsmall);
        window.add(btnmedium);
        window.add(btnlarge);

        window.add(nameSec2);
        window.add(btncienkie);
        window.add(btngrube);
        window.add(btnrazowe);
        window.add(btntradycyjne);

        window.add(nameSec3);
        window.add(btnbraks);
        window.add(btnsweetchilli);
        window.add(btnczosnkowy);
        window.add(btnBBQ);

        window.add(nameSec4);
        window.add(btnbrakp);
        window.add(btnoregano);
        window.add(btnbaz);
        window.add(btnzprowan);

        window.add(nameSec5);
        window.add(btnbrako);
        window.add(btnczosnkowao);
        window.add(btnchillio);
        window.add(btnziolowao);

        window.setLayout(null);
        window.setVisible(true);
        window.setSize(450,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
    }
}
