import org.junit.Test;

public class CuboidBoxTest {

    @Test
    public void printVolume() {
        CuboidBox box = new CuboidBox();
        box.setLength(1);
        box.setWidth(2);
        box.setHeight(3);
        box.printVolume();
    }

}