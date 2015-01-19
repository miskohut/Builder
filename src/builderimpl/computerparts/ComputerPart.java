package builderimpl.computerparts;

/**
 * Created by misko on 19.1.2015.
 */
public abstract class ComputerPart implements ComputerParts {

    private String manufacturer;

    public ComputerPart(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
