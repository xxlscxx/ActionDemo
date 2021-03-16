public class CuboidBox {

    private int length;
    private int width;
    private int height;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void printVolume() {
        double vol;
        vol = length * width * height;
        System.out.println("The volume of the box is " + vol + ".");
    }

}
