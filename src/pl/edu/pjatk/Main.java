package pl.edu.pjatk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("ProjektPOJ - system do zamawiania pizzy");
        window.setLayout(null);

        String SelectedItem = "";

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
        JCheckBox btnpomidorowy = new JCheckBox("pomidorowy");
        JCheckBox btnsweetchilli = new JCheckBox("sweet-chilli");
        JCheckBox btnczosnkowy = new JCheckBox("czosnkowy");
        JCheckBox btnBBQ = new JCheckBox("BBQ");
        JLabel nameSec4 = new JLabel("Dodatkowe przyprawy");
        JCheckBox btntymianek = new JCheckBox("tymianek");
        JCheckBox btnoregano = new JCheckBox("oregano");
        JCheckBox btnbaz = new JCheckBox("bazylia");
        JCheckBox btnzprowan = new JCheckBox("zioła prowansalskie");
        JLabel nameSec5 = new JLabel("Oliwa");
        JCheckBox btnrozmaryn = new JCheckBox("rozmaryn");
        JCheckBox btnczosnkowao = new JCheckBox("czosnkowa");
        JCheckBox btnchillio = new JCheckBox("chilli");
        JCheckBox btnziolowao = new JCheckBox("ziolowa");
        JLabel nameSec6 = new JLabel("Dodatkowe składniki (MAX 5 skladnikow)");
        JButton btnzoltyser = new JButton("zolty ser");
        JButton btnboczek = new JButton("boczek");
        JButton btnszynka = new JButton("szynka");
        JButton btnmozzarella = new JButton("mozarella");
        JButton btnoliwki = new JButton("oliwki");
        JButton btnpapryka = new JButton("papryka");
        JButton btnananas = new JButton("ananas");
        JButton btnpieczarki = new JButton("pieczarki");
        JButton btnpomidory = new JButton("pomidory");
        JButton btnfeta = new JButton("feta");
        JButton btngrillkur = new JButton("kurczak");
        JButton btnjalapeno = new JButton("jalapeno");
        JLabel nameSec7 = new JLabel("Sposob dostawy");
        JCheckBox btnonm = new JCheckBox("odbior na miejscu");
        JCheckBox btnddd = new JCheckBox("dostawa do domu");
        JButton jButton = new JButton("Zloz zamowienie");

        ButtonGroup Sec1G = new ButtonGroup();
        ButtonGroup Sec2G = new ButtonGroup ();
        ButtonGroup Sec3G = new ButtonGroup ();
        ButtonGroup Sec4G = new ButtonGroup ();
        ButtonGroup Sec5G = new ButtonGroup ();
        ButtonGroup Sec7G = new ButtonGroup ();
        JPanel panel1G = new JPanel();

        Sec1G.add(btnsmall);
        Sec1G.add(btnmedium);
        Sec1G.add(btnlarge);
        panel1G.add(btnsmall);
        panel1G.add(btnmedium);
        panel1G.add(btnlarge);

        Sec2G.add(btncienkie);
        Sec2G.add(btngrube);
        Sec2G.add(btnrazowe);
        Sec2G.add(btntradycyjne);
        Sec3G.add(btnpomidorowy);
        Sec3G.add(btnsweetchilli);
        Sec3G.add(btnczosnkowy);
        Sec3G.add(btnBBQ);
        Sec4G.add(btntymianek);
        Sec4G.add(btnoregano);
        Sec4G.add(btnbaz);
        Sec4G.add(btnzprowan);
        Sec5G.add(btnrozmaryn);
        Sec5G.add(btnczosnkowao);
        Sec5G.add(btnchillio);
        Sec5G.add(btnziolowao);
        Sec7G.add(btnonm);
        Sec7G.add(btnddd);

        nameApl.setBounds(160,30,280,30);
        //sec1
        nameSec1.setBounds(30,60,150,40);
        btnsmall.setBounds(50,90,110,30);
        btnmedium.setBounds(175,90,110,30);
        btnlarge.setBounds(300,90,110,30);
        //sec2
        nameSec2.setBounds(30,120,150,40);
        btncienkie.setBounds(50,150,110,30);
        btngrube.setBounds(175,150,110,30);
        btnrazowe.setBounds(300,150,110,30);
        btntradycyjne.setBounds(50,180,110,30);
        //sec3
        nameSec3.setBounds(30,210,150,40);
        btnpomidorowy.setBounds(50,240,110,30);
        btnsweetchilli.setBounds(175,240,110,30);
        btnczosnkowy.setBounds(300,240,110,30);
        btnBBQ.setBounds(50,270,110,30);
        //sec4
        nameSec4.setBounds(30,300,150,40);
        btntymianek.setBounds(50,330,110,30);
        btnoregano.setBounds(175,330,110,30);
        btnbaz.setBounds(300,330,110,30);
        btnzprowan.setBounds(50,360,150,30);
        //sec5
        nameSec5.setBounds(30,390,150,40);
        btnrozmaryn.setBounds(50,420,110,30);
        btnczosnkowao.setBounds(175,420,110,30);
        btnchillio.setBounds(300,420,110,30);
        btnziolowao.setBounds(50,450,110,30);
        //sec6
        nameSec6.setBounds(30,480,150,40);
        btnzoltyser.setBounds(50,510,110,30);
        btnboczek.setBounds(175,510,110,30);
        btnszynka.setBounds(300,510,110,30);
        btnmozzarella.setBounds(50,540,110,30);
        btnoliwki.setBounds(175,540,110,30);
        btnpapryka.setBounds(300,540,110,30);
        btnananas.setBounds(50,570,110,30);
        btnpieczarki.setBounds(175,570,110,30);
        btnpomidory.setBounds(300,570,110,30);
        btnfeta.setBounds(50,600,110,30);
        btngrillkur.setBounds(175,600,110,30);
        btnjalapeno.setBounds(300,600,110,30);
        //sec7
        nameSec7.setBounds(30,630,150,40);
        btnonm.setBounds(50,660,130,30);
        btnddd.setBounds(225,660,130,30);
        //sec8
        jButton.setBounds(130,720,150,30);
        JButton test = new JButton("test");
        test.setBounds(130,750,150,30);

        String[] s1 = new String[1];
        String[] s2 = new String[1];
        String[] s3 = new String[1];
        String[] s4 = new String[1];
        String[] s5 = new String[1];
        JPanel jPanel = new JPanel();
        jPanel.add(btnzoltyser);
        jPanel.add(btnboczek);
        jPanel.add(btnszynka);
        jPanel.add(btnmozzarella);
        jPanel.add(btnoliwki);
        jPanel.add(btnpapryka);
        jPanel.add(btnananas);
        jPanel.add(btnpieczarki);
        jPanel.add(btnpomidory);
        jPanel.add(btnfeta);
        jPanel.add(btngrillkur);
        jPanel.add(btnjalapeno);
        HashSet<String> skladniki = new HashSet<>();
        String[] s7 = new String[1];

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox jCheckBox2 = (JCheckBox) e.getSource();
                if(s1.length < 1){
                    s1[0] = jCheckBox2.getActionCommand();
                }else if(s1.length >= 1){
                    s1[0] = jCheckBox2.getActionCommand();
                }
                System.out.println(s1[0]);
            }
        };

        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox jCheckBox2 = (JCheckBox) e.getSource();
                if(s2.length < 1){
                    s2[0] = jCheckBox2.getActionCommand();
                }else if(s2.length >= 1){
                    s2[0] = jCheckBox2.getActionCommand();
                }
            }
        };

        ActionListener actionListener3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox jCheckBox2 = (JCheckBox) e.getSource();
                if(s3.length < 1){
                    s3[0] = jCheckBox2.getActionCommand();
                }else if(s3.length >= 1){
                    s3[0] = jCheckBox2.getActionCommand();
                }
            }
        };

        ActionListener actionListener4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox jCheckBox2 = (JCheckBox) e.getSource();
                if(s4.length < 1){
                    s4[0] = jCheckBox2.getActionCommand();
                }else if(s4.length >= 1){
                    s4[0] = jCheckBox2.getActionCommand();
                }
            }
        };

        ActionListener actionListener5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox jCheckBox2 = (JCheckBox) e.getSource();
                if(s5.length < 1){
                    s5[0] = jCheckBox2.getActionCommand();
                }else if(s5.length >= 1){
                    s5[0] = jCheckBox2.getActionCommand();
                }
            }
        };


        ActionListener test1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(skladniki);
            }
        };
        ActionListener actionListener6 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton jButton2 = (JButton) e.getSource();
                skladniki.add(jButton2.getActionCommand());
                System.out.println(jButton2.getActionCommand());
            }
        };
        test.addActionListener(test1);

        ActionListener actionListener7 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox jCheckBox2 = (JCheckBox) e.getSource();
                if(s7.length < 1){
                    s7[0] = jCheckBox2.getActionCommand();
                }else if(s7.length >= 1){
                    s7[0] = jCheckBox2.getActionCommand();
                }
            }
        };

        btnsmall.addActionListener(actionListener);
        btnmedium.addActionListener(actionListener);
        btnlarge.addActionListener(actionListener);
        btncienkie.addActionListener(actionListener2);
        btngrube.addActionListener(actionListener2);
        btnrazowe.addActionListener(actionListener2);
        btntradycyjne.addActionListener(actionListener2);
        btnpomidorowy.addActionListener(actionListener3);
        btnsweetchilli.addActionListener(actionListener3);
        btnczosnkowy.addActionListener(actionListener3);
        btnBBQ.addActionListener(actionListener3);
        btntymianek.addActionListener(actionListener4);
        btnoregano.addActionListener(actionListener4);
        btnbaz.addActionListener(actionListener4);
        btnzprowan.addActionListener(actionListener4);
        btnrozmaryn.addActionListener(actionListener5);
        btnczosnkowao.addActionListener(actionListener5);
        btnchillio.addActionListener(actionListener5);
        btnziolowao.addActionListener(actionListener5);
        btnzoltyser.addActionListener(actionListener6);
        btnboczek.addActionListener(actionListener6);
        btnszynka.addActionListener(actionListener6);
        btnmozzarella.addActionListener(actionListener6);
        btnoliwki.addActionListener(actionListener6);
        btnpapryka.addActionListener(actionListener6);
        btnananas.addActionListener(actionListener6);
        btnpieczarki.addActionListener(actionListener6);
        btnpomidory.addActionListener(actionListener6);
        btnfeta.addActionListener(actionListener6);
        btngrillkur.addActionListener(actionListener6);
        btnjalapeno.addActionListener(actionListener6);
        btnonm.addActionListener(actionListener7);
        btnddd.addActionListener(actionListener7);

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
        window.add(btnpomidorowy);
        window.add(btnsweetchilli);
        window.add(btnczosnkowy);
        window.add(btnBBQ);

        window.add(nameSec4);
        window.add(btntymianek);
        window.add(btnoregano);
        window.add(btnbaz);
        window.add(btnzprowan);

        window.add(nameSec5);
        window.add(btnrozmaryn);
        window.add(btnczosnkowao);
        window.add(btnchillio);
        window.add(btnziolowao);

        window.add(nameSec6);
        window.add(btnzoltyser);
        window.add(btnboczek);
        window.add(btnszynka);
        window.add(btnmozzarella);
        window.add(btnoliwki);
        window.add(btnpapryka);
        window.add(btnananas);
        window.add(btnpieczarki);
        window.add(btnpomidory);
        window.add(btnfeta);
        window.add(btngrillkur);
        window.add(btnjalapeno);

        window.add(nameSec7);
        window.add(btnonm);
        window.add(btnddd);

        window.add(jButton);
        window.add(test);

        window.setLayout(null);
        window.setVisible(true);
        window.setSize(425,850);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
    }
}
