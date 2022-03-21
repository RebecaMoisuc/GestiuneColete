package ro.itSchool.generics.array.gestiuneColete;

import java.util.ArrayList;
import java.util.Objects;

public class Depozit {

    private final ArrayList<Colet> colets = new ArrayList<>();

    public void addColet(Colet colet){
        colets.add(colet);
    }

    public void stergeColet(String awb){
        for(int i = 0; i < colets.size(); i++){
            Colet colet = colets.get(i);
            if(Objects.equals(colet.getAwb(), awb)){
                colets.remove(colet);
            }
        }
    }


    public Colet gasesteColet(String awb){
        Colet coletGasit = null;
        for (Colet colet : colets) {
            if (Objects.equals(colet.getAwb(), awb)) {
                coletGasit = colet;
            }
        }
        return coletGasit;
    }

    public void afiseasaColete(){
        for (Colet colet: colets) {
            System.out.println(colet);

        }
    }
}
