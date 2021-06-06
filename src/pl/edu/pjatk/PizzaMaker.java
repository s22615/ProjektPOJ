package pl.edu.pjatk;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

public class PizzaMaker {
    private JFrame window = new JFrame("ProjektPOJ - system do zamawiania pizzy");
    private JLabel nameApl = new JLabel("Skomponuj swoja pizze!");
    private JLabel nameSec1 = new JLabel("Rozmiar");
    private JCheckBox btnsmall = new JCheckBox("mala");
    private JCheckBox btnmedium = new JCheckBox("srednia");
    private JCheckBox btnlarge = new JCheckBox("duza");
    private JLabel nameSec2 = new JLabel("Ciasto");
    private JCheckBox btncienkie = new JCheckBox("cienkie");
    private JCheckBox btngrube = new JCheckBox("grube");
    private JCheckBox btnrazowe = new JCheckBox("razowe");
    private JCheckBox btntradycyjne = new JCheckBox("tradycyjne");
    private JLabel nameSec3 = new JLabel("Dodatkowy sos");
    private JCheckBox btnpomidorowy = new JCheckBox("pomidorowy");
    private JCheckBox btnsweetchilli = new JCheckBox("sweet-chilli");
    private JCheckBox btnczosnkowy = new JCheckBox("czosnkowy");
    private JCheckBox btnBBQ = new JCheckBox("BBQ");
    private JLabel nameSec4 = new JLabel("Dodatkowe przyprawy");
    private JCheckBox btntymianek = new JCheckBox("tymianek");
    private JCheckBox btnoregano = new JCheckBox("oregano");
    private JCheckBox btnbaz = new JCheckBox("bazylia");
    private JCheckBox btnzprowan = new JCheckBox("zioła prowansalskie");
    private JLabel nameSec5 = new JLabel("Oliwa");
    private JCheckBox btnrozmaryn = new JCheckBox("rozmaryn");
    private JCheckBox btnczosnkowao = new JCheckBox("czosnkowa");
    private JCheckBox btnchillio = new JCheckBox("chilli");
    private JCheckBox btnziolowao = new JCheckBox("ziolowa");
    private JLabel nameSec6 = new JLabel("Dodatkowe składniki");
    private JButton btnzoltyser = new JButton("zolty ser");
    private JButton btnboczek = new JButton("boczek");
    private JButton btnszynka = new JButton("szynka");
    private JButton btnmozzarella = new JButton("mozarella");
    private JButton btnoliwki = new JButton("oliwki");
    private JButton btnpapryka = new JButton("papryka");
    private JButton btnananas = new JButton("ananas");
    private JButton btnpieczarki = new JButton("pieczarki");
    private JButton btnpomidory = new JButton("pomidory");
    private JButton btnfeta = new JButton("feta");
    private JButton btngrillkur = new JButton("kurczak");
    private JButton btnjalapeno = new JButton("jalapeno");
    private JLabel nameSec7 = new JLabel("Sposob dostawy");
    private JCheckBox btnonm = new JCheckBox("odbior na miejscu");
    private JCheckBox btnddd = new JCheckBox("dostawa do domu");
    private JButton zamowienieB = new JButton("Zloz zamowienie");

    private String imie,nazwisko,nr_telefonu,adres;

    public PizzaMaker(String imie, String nazwisko, String nr_telefonu, String adres){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_telefonu = nr_telefonu;
        this.adres = adres;

        window.setLayout(null);

        ButtonGroup Sec1G = new ButtonGroup();
        ButtonGroup Sec2G = new ButtonGroup ();
        ButtonGroup Sec3G = new ButtonGroup ();
        ButtonGroup Sec4G = new ButtonGroup ();
        ButtonGroup Sec5G = new ButtonGroup ();
        ButtonGroup Sec7G = new ButtonGroup ();

        Sec1G.add(btnsmall);
        Sec1G.add(btnmedium);
        Sec1G.add(btnlarge);
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

        nameApl.setBounds(135,30,280,30);
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
        btnzoltyser.setBounds(30,520,110,30);
        btnboczek.setBounds(155,520,110,30);
        btnszynka.setBounds(280,520,110,30);
        btnmozzarella.setBounds(30,550,110,30);
        btnoliwki.setBounds(155,550,110,30);
        btnpapryka.setBounds(280,550,110,30);
        btnananas.setBounds(30,580,110,30);
        btnpieczarki.setBounds(155,580,110,30);
        btnpomidory.setBounds(280,580,110,30);
        btnfeta.setBounds(30,610,110,30);
        btngrillkur.setBounds(155,610,110,30);
        btnjalapeno.setBounds(280,610,110,30);
        //sec7
        nameSec7.setBounds(30,640,150,40);
        btnonm.setBounds(50,670,130,30);
        btnddd.setBounds(225,670,130,30);
        //sec8
        zamowienieB.setBounds(130,730,150,30);

        String[] s1 = new String[1];
        String[] s2 = new String[1];
        String[] s3 = new String[1];
        String[] s4 = new String[1];
        String[] s5 = new String[1];
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

        ActionListener moveOrder = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(s1[0] == null || s2[0] == null || s3[0] == null || s4[0] == null || s5[0] == null || s7[0] == null ){
                    JOptionPane.showMessageDialog(null, "W kazdej sekcji (procz skladnikow) nalezy wybrac przynajmniej jeden element", "ERROR", JOptionPane.ERROR_MESSAGE);
                }else{
                Output output = new Output(s1,s2,s3,s4,s5,skladniki,s7,imie,nazwisko,adres,nr_telefonu);
                window.dispose();
                }
            }
        };
        ActionListener actionListener6 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton jButton2 = (JButton) e.getSource();
                skladniki.add(jButton2.getActionCommand());
            }
        };


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

        zamowienieB.addActionListener(moveOrder);

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

        window.add(zamowienieB);

        window.setLayout(null);
        window.setVisible(true);
        window.setSize(425,850);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
    }
}
