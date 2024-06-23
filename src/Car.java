class Car {
    private String model;
    private String regNumber;
    private int year;
    private int mileage;
    private double price;

    public Car(String model, String regNumber, int year, int mileage, double price) {
        this.model = model;
        this.regNumber = regNumber;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getRegNumber() { return regNumber; }
    public void setRegNumber(String regNumber) { this.regNumber = regNumber; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getMileage() { return mileage; }
    public void setMileage(int mileage) { this.mileage = mileage; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }
}
