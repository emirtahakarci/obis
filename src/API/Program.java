package API;

import admin.DatabaseDizi;
import admin.DatabaseProgram;
import admin.EkleProgram;
import obis.Mesaj;

import java.util.Scanner;

public class Program {


    public void programGiris(String[] kullanici){
        DatabaseProgram programCek = new DatabaseProgram();

        String ekleSilprogram;
        String arti="+";
        String eksi="-";
        String gunler1="Pazartesi";
        String gunler2="Sali";
        String gunler3="Çarşamba";
        String gunler4="Perşembe";
        String gunler5="Cuma";
        Scanner programScan = new Scanner(System.in);

        System.out.println("\n\n");
        String bolum = kullanici[4];
            for(EkleProgram bolumProgramlar : programCek.programDizi){


            if(bolumProgramlar.bolum.equals(bolum)|| bolumProgramlar.bolum.length() >= 4) {

                if (DatabaseDizi.gunler[0].equals(bolumProgramlar.gunu))  gunler1=gunler1+"/"+bolumProgramlar.dersadi+" / ";
                if (DatabaseDizi.gunler[1].equals(bolumProgramlar.gunu))  gunler2=gunler2+"/"+bolumProgramlar.dersadi+" / ";
                if (DatabaseDizi.gunler[2].equals(bolumProgramlar.gunu))  gunler3=gunler3+"/"+bolumProgramlar.dersadi+" / ";
                if (DatabaseDizi.gunler[3].equals(bolumProgramlar.gunu))  gunler4=gunler4+"/"+bolumProgramlar.dersadi+" / ";
                if (DatabaseDizi.gunler[4].equals(bolumProgramlar.gunu))  gunler5=gunler5+"/"+bolumProgramlar.dersadi+" / ";




            }
        }
        if (gunler1.length()>10) System.out.println(gunler1);
        else System.out.println(gunler1+" Ders Yok");
        if (gunler2.length()>10) System.out.println(gunler2);
        else System.out.println(gunler2+" Ders Yok");
        if (gunler3.length()>10) System.out.println(gunler3);
        else System.out.println(gunler3+" Ders Yok");
        if (gunler4.length()>10)  System.out.println(gunler4);
        else System.out.println(gunler4+" Ders Yok");
        if (gunler5.length()>10)  System.out.println(gunler5);
        else System.out.println(gunler5+" Ders Yok");

        System.out.println(Mesaj.duyurularEkleSil());
        ekleSilprogram = programScan.nextLine();
        if (ekleSilprogram.equals(arti)) programCek.ekleProgram();
        if (ekleSilprogram.equals(eksi)) programCek.cikarMetotProgram();
        System.out.print(Mesaj.menuyeDon());
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }





}
