package ro.itSchool.generics.array.gestiuneColete;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int optiune;
        Depozit depozit = new Depozit();
        do{
            System.out.println(" 0. Exit");
            System.out.println(" 1. Adauga colet");
            System.out.println(" 2. Sterge colet");
            System.out.println(" 3. GAseste colet");
            System.out.println(" 4. Afiseaza colet");

        optiune = sc.nextInt();
        sc.nextLine();
        if(optiune == 1) {
            System.out.println("Introdu awb-ul coletului");
            String awbColet = sc.nextLine();
            System.out.println("Introdu adresa de livrare");
            String adresa = sc.nextLine();
            System.out.println("Introdu expeditor");
            String expeditor = sc.nextLine();
            System.out.println("Introdu greutatea coletului");
            double greutate = sc.nextDouble();
            sc.nextLine();
            Colet colet = new Colet(awbColet, adresa, expeditor, greutate);
            colet.setAwb(awbColet);
            depozit.addColet(colet);
        }
        if(optiune == 2){
            System.out.println("Introdu awb-ul coletului ce va fi sters");
            String awbColet1 = sc.nextLine();
            depozit.stergeColet(awbColet1);

        }


        if(optiune == 3){
            System.out.println(" Introdu awb ul coletului cautat");
            String awbColet2 = sc.nextLine();
            Colet colet1 = depozit.gasesteColet(awbColet2);
            if(colet1 == null){
                System.out.println("Coletul nu a fost gasit");
            }else{
                System.out.println(awbColet2);
                 }
        }


        if(optiune == 4){
            depozit.afiseasaColete();
            }

        }while( optiune != 0);
    }
}
