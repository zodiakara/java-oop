import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Wall implements Structure {
    private CompositeBlock compositeBlock;
    
    @Override
    public Optional<Block> findBlockByColor(String color) {
        return getBlockStream()
                .filter(block -> block.getColor().equals(color))
                .findAny();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return getBlockStream()
                .filter(block -> block.getMaterial().equals(material))
                .collect(Collectors.toList());
    }

    @Override
    public int count() {
        return getListOfBlocks().size();
    }

    private Stream<Block> getBlockStream() {
        return getListOfBlocks().stream();
    }

    private List<Block> getListOfBlocks() {
        return compositeBlock.getBlocks();
    }
}