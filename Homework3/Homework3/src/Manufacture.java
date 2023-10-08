public class Manufacture {
    public Manufacture(String name, String location) {
        this.name = name;
        this.location = location;
    }

    private String name;
    private String location;

    @Override
    public String toString() {
        return "Manufacture{Name: " + name + ", Location: " + location + "}";
    }
}
