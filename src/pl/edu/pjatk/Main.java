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
        JCheckBox btnbaz = new JCheckBox("bazylia");
        JCheckBox btnzprowan = new JCheckBox("zioła prowansalskie");
        JLabel nameSec5 = new JLabel("Oliwa");
        JCheckBox btnbrako = new JCheckBox("brak");
        JCheckBox btnczosnkowao = new JCheckBox("czosnkowa");
        JCheckBox btnchillio = new JCheckBox("chilli");
        JCheckBox btnziolowao = new JCheckBox("ziolowa");
        JLabel nameSec6 = new JLabel("Dodatkowe składniki");
        JCheckBox btnbraksk = new JCheckBox("brak");
        JCheckBox btnboczek = new JCheckBox("boczek");
        JCheckBox btnszynka = new JCheckBox("szynka");
        JCheckBox btnmozzarella = new JCheckBox("mozarella");
        JCheckBox btnoliwki = new JCheckBox("oliwki");
        JCheckBox btnpapryka = new JCheckBox("papryka");
        JCheckBox btnananas = new JCheckBox("ananas");
        JCheckBox btnpieczarki = new JCheckBox("pieczarki");
        JCheckBox btnpomidory = new JCheckBox("pomidory");
        JCheckBox btnfeta = new JCheckBox("feta");
        JCheckBox btngrillkur = new JCheckBox("kurczak");
        JCheckBox btnjalapeno = new JCheckBox("jalapeno");
        JLabel nameSec7 = new JLabel("Sposob dostawy");
        JCheckBox btnonm = new JCheckBox("odbior na miejscu");
        JCheckBox btnddd = new JCheckBox("dostawa do domu");
        JButton jButton = new JButton("Zloz zamowienie");



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
        btnbraks.setBounds(50,240,110,30);
        btnsweetchilli.setBounds(175,240,110,30);
        btnczosnkowy.setBounds(300,240,110,30);
        btnBBQ.setBounds(50,270,110,30);
        //sec4
        nameSec4.setBounds(30,300,150,40);
        btnbrakp.setBounds(50,330,110,30);
        btnoregano.setBounds(175,330,110,30);
        btnbaz.setBounds(300,330,110,30);
        btnzprowan.setBounds(50,360,110,30);
        //sec5
        nameSec5.setBounds(30,390,150,40);
        btnbrako.setBounds(50,420,110,30);
        btnczosnkowao.setBounds(175,420,110,30);
        btnchillio.setBounds(300,420,110,30);
        btnziolowao.setBounds(50,450,110,30);
        //sec6
        nameSec6.setBounds(30,480,150,40);
        btnbraksk.setBounds(50,510,110,30);
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

        window.add(nameSec6);
        window.add(btnbraksk);
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

        window.setLayout(null);
        window.setVisible(true);
        window.setSize(425,850);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
    }
}
