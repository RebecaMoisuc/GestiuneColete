package ro.itSchool.generics.array.gestiuneColete;

public class Colet {

    private String adresaDeLivrare;
    private String awb;
    private String expeditor;
    private double greutate;

    public Colet(String awbColet, String adresa, String expeditor, double greutate) {

    }

    public String getAdresaDeLivrare() {
        return adresaDeLivrare;
    }

    public void setAdresaDeLivrare(String adresaDeLivrare) {
        this.adresaDeLivrare = adresaDeLivrare;
    }

    public String getAwb() {
        return awb;
    }

    public void setAwb(String awb) {
        this.awb = awb;
    }

    public String getExpeditor() {
        return expeditor;
    }

    public void setExpeditor(String expeditor) {
        this.expeditor = expeditor;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    @Override
    public String toString() {
        return "Colet{" +
                "adresaDeLivrare='" + adresaDeLivrare + '\'' +
                ", awb='" + awb + '\'' +
                ", expeditor='" + expeditor + '\'' +
                ", greutate=" + greutate +
                '}';
    }
}
