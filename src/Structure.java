import java.util.List;
import java.util.Optional;

public interface Structure {
    // returns any element with given color
    Optional<Block> findBlockByColor(String color);

    // returns all elements from given material
    List<Block> findBlocksByMaterial(String material);

    //returns a number of all elements creating a structure
    int count();
}
