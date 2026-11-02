package palg.Cviko06;

public class Location
{
    private final double[] coordinates;
    private final String name;

    public Location(double[] coordinates, String name)
    {
        this.coordinates = coordinates;
        this.name = name;
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
