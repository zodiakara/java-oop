public class Brick implements Block{
    private String color;
    private String material;

    public Brick(String color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Brick{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }
}
