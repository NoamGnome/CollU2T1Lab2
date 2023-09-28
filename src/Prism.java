public class Prism {
    private double length;
    private double width;
    private double height;

    public Prism(double len, double wid, double hei) {
        length = len;
        width = wid;
        height = hei;
    }

    public void printVolume(){
        double volume = length * width * height;
        System.out.print("the volume is equal to: " + volume);
    }
}
