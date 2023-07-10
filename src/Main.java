import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Please, analyze the following code and implement methods: findBlockByColor, findBlocksByMaterial,
        // count in class Wall
        //Preferably avoid doubling up the code and put all the logic in wall class.
        // Include in analysis implementation of CompositeBlock interface!
        List<Block> blocks = new ArrayList<>();
        var brick = new Brick("red", "brick");
        var brick2 = new Brick("red", "brick");
        var composite = new CompositeBrick ("red", "brick");
        composite.addBlock(brick);
        composite.addBlock(brick2);
        composite.getBlocks().forEach(block -> System.out.println(block));

    }
}