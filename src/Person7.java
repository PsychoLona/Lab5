class Person7 {
    private String lastName;
    private String firstName;
    private String gender;
    private int height;

    public Person7(String lastName, String firstName, String gender, int height) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.height = height;
    }

    // Геттеры и сеттеры
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                '}';
    }
}
