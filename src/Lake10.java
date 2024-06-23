class Lake10 {
    private String name;
    private String location;
    private double area;

    public Lake10(String name, String location, double area) {
        this.name = name;
        this.location = location;
        this.area = area;
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Lake{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", area=" + area +
                '}';
    }
}
