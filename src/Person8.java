class Person8 {
    private String lastName;
    private String firstName;
    private int birthYear;
    private int birthMonth;

    public Person8(String lastName, String firstName, int birthYear, int birthMonth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birthYear=" + birthYear +
                ", birthMonth=" + birthMonth +
                '}';
    }
}
