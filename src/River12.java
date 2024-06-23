class River12 {
    private String name;
    private String location;
    private double length;

    public River12(String name, String location, double length) {
        this.name = name;
        this.location = location;
        this.length = length;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "River{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", length=" + length +
                '}';
    }
}
