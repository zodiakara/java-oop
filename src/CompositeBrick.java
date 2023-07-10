import java.util.ArrayList;
import java.util.List;

public class CompositeBrick implements CompositeBlock{
    private String color;
    private String material;
    private List<Block> blocksList;

    public CompositeBrick(String color, String material) {
        this.color = color;
        this.material = material;
        this.blocksList = new ArrayList<>();
    }
    public void addBlock(Block block){
       //ask if it should check if block color and material is same as the compositebrick color
        blocksList.add(block);
    }
    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }

    @Override
    public List<Block> getBlocks() {
            return this.blocksList;
    }
}
