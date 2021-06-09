package pl.edu.pjatk;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Random;

public class Output {
    private JFrame jFrame = new JFrame("ProjektPOJ - system do zamawiania pizzy");
    private JLabel jLabel = new JLabel();
    private JLabel podziekowanie = new JLabel();
    private JLabel podsumowanie = new JLabel();
    private JLabel daneK = new JLabel();
    private JLabel imieL = new JLabel();
    private JLabel imieH = new JLabel();
    private JLabel nazwiskoL = new JLabel();
    private JLabel nazwiskoH = new JLabel();
    private JLabel adresL = new JLabel();
    private JLabel adresH = new JLabel();
    private JLabel nrtelL = new JLabel();
    private JLabel nrtelH = new JLabel();
    private JLabel szczegolyZ = new JLabel();
    private JLabel rozmiarL = new JLabel();
    private JLabel rozmiarH = new JLabel();
    private JLabel ciastoL = new JLabel();
    private JLabel ciastoH = new JLabel();
    private JLabel sosL = new JLabel();
    private JLabel sosH = new JLabel();
    private JLabel przyprawyL = new JLabel();
    private JLabel przyprawyH = new JLabel();
    private JLabel oliwaL = new JLabel();
    private JLabel oliwaH = new JLabel();
    private JLabel dostawaL = new JLabel();
    private JLabel dostawaH = new JLabel();
    private JLabel skladnikiL = new JLabel();
    private JLabel skladnikiH = new JLabel();
    private JLabel czasdostawyL = new JLabel();
    private JLabel czasdostawyH = new JLabel();
    private JLabel dozaplatyL = new JLabel();
    private JLabel dozaplatyH = new JLabel();

    String[] s1 = new String[1];
    String[] s2 = new String[1];
    String[] s3 = new String[1];
    String[] s4 = new String[1];
    String[] s5 = new String[1];
    HashSet<String> skladniki = new HashSet<>();
    String[] s7 = new String[1];

    private String imie,nazwisko,nr_telefonu,adres;
    private double koszt = 22;

    public Output(String[] s1, String[] s2, String[] s3, String[] s4, String[] s5, HashSet<String> skladniki, String[] s7,String imie,String nazwisko,String nr_telefonu,String adres) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.skladniki = skladniki;
        this.s7 = s7;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_telefonu = nr_telefonu;
        this.adres = adres;

        jFrame.setLayout(null);

        String rozmiar = s1[0];
        String ciasto = s2[0];
        String sos = s3[0];
        String przyprawy = s4[0];
        String oliwa = s5[0];
        String skladnikiS = "";

        for (String s : skladniki) {
            skladnikiS = skladnikiS + s + ", ";
            koszt += 5;
        }

        String dostawa = s7[0];

        jFrame.getContentPane().setBackground(Color.lightGray);

        podziekowanie.setText(String.format("Dziekujemy za skorzystanie z naszych uslug!"));
        podsumowanie.setText(String.format("Oto podsumowanie twojego zamowienia"));
        daneK.setText(String.format("Dane kontaktowe"));
        imieL.setText(String.format("Imie: "));
        imieH.setText(String.format(imie));
        nazwiskoL.setText(String.format("Nazwisko: "));
        nazwiskoH.setText(String.format(nazwisko));
        adresL.setText(String.format("Adres: "));
        adresH.setText(String.format(adres));
        nrtelL.setText(String.format("Nr telefonu: "));
        nrtelH.setText(String.format(nr_telefonu));

        szczegolyZ.setText(String.format("Szczegoly zamowienia"));
        rozmiarL.setText(String.format("Rozmiar: "));
        rozmiarH.setText(String.format(rozmiar));
        ciastoL.setText(String.format("Ciasto: "));
        ciastoH.setText(String.format(ciasto));
        sosL.setText(String.format("Sos: "));
        sosH.setText(String.format(sos));
        przyprawyL.setText(String.format("Przyprawy: "));
        przyprawyH.setText(String.format(przyprawy));
        oliwaL.setText(String.format("Oliwa: "));
        oliwaH.setText(String.format(oliwa));
        skladnikiL.setText(String.format("Skladniki: "));
        skladnikiH.setText(String.format(skladnikiS));
        dostawaL.setText(String.format("Dostawa: "));
        dostawaH.setText(String.format(dostawa));

        czasdostawyL.setText(String.format("Przewidywany czas dostawy"));
        if(dostawa == "dostawa do domu"){
            int random = (int) (Math.random()*120 + 45);
            czasdostawyH.setText(String.format("%d minut",random));
            koszt += 8.5;
        }else{
            czasdostawyH.setText(String.format("BRAK"));
        }
        String kosztS = Double.toString(koszt);
        dozaplatyL.setText(String.format("Do zaplaty: "));
        dozaplatyH.setText(kosztS + " zł");

        jFrame.add(jLabel);
        jFrame.add(podziekowanie);
        jFrame.add(podsumowanie);
        jFrame.add(daneK);
        jFrame.add(imieL);
        jFrame.add(imieH);
        jFrame.add(nazwiskoL);
        jFrame.add(nazwiskoH);
        jFrame.add(adresL);
        jFrame.add(adresH);
        jFrame.add(nrtelL);
        jFrame.add(nrtelH);
        jFrame.add(szczegolyZ);
        jFrame.add(rozmiarL);
        jFrame.add(rozmiarH);
        jFrame.add(ciastoL);
        jFrame.add(ciastoH);
        jFrame.add(sosL);
        jFrame.add(sosH);
        jFrame.add(przyprawyL);
        jFrame.add(przyprawyH);
        jFrame.add(oliwaL);
        jFrame.add(oliwaH);
        jFrame.add(dostawaL);
        jFrame.add(dostawaH);
        jFrame.add(skladnikiL);
        jFrame.add(skladnikiH);
        jFrame.add(czasdostawyL);
        jFrame.add(czasdostawyH);
        jFrame.add(dozaplatyL);
        jFrame.add(dozaplatyH);

        podziekowanie.setBounds(70,20,600,20);
        podsumowanie.setBounds(80,60,600,20);

        daneK.setBounds(150,100,150,20);
        imieL.setBounds(110,130,80,30);
        imieH.setBounds(200,130,110,30);
        nazwiskoL.setBounds(110,150,80,30);
        nazwiskoH.setBounds(200,150,110,30);
        adresL.setBounds(110,170,80,30);
        adresH.setBounds(200,170,110,30);
        nrtelL.setBounds(110,190,80,30);
        nrtelH.setBounds(200,190,110,30);

        szczegolyZ.setBounds(135,230,600,20);
        rozmiarL.setBounds(110,260,80,30);
        rozmiarH.setBounds(200,260,110,30);
        ciastoL.setBounds(110,280,80,30);
        ciastoH.setBounds(200,280,110,30);
        sosL.setBounds(110,300,80,30);
        sosH.setBounds(200,300,110,30);
        przyprawyL.setBounds(110,320,80,30);
        przyprawyH.setBounds(200,320,110,30);
        oliwaL.setBounds(110,340,80,30);
        oliwaH.setBounds(200,340,110,30);
        dostawaL.setBounds(110,360,80,30);
        dostawaH.setBounds(200,360,110,30);
        skladnikiL.setBounds(170,380,80,30);
        skladnikiH.setBounds(80,400,350,30);

        czasdostawyL.setBounds(115,440,200,30);
        czasdostawyH.setBounds(170,460,350,30);

        dozaplatyL.setBounds(110,500,80,30);
        dozaplatyH.setBounds(200,500,110,30);

        jFrame.setSize(425,600);
        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
