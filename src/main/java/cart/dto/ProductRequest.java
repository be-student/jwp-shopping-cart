package cart.dto;

public class ProductRequest {

    private final String name;
    private final String image;
    private final int price;

    public ProductRequest(final String name, final String image, final int price) {
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public int getPrice() {
        return price;
    }
}
