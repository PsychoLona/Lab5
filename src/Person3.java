class Person3 {
    private String lastName;
    private String firstName;
    private String middleName;
    private int age;
    private int clothingSize;

    public Person3(String lastName, String firstName, String middleName, int age, int clothingSize) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.age = age;
        this.clothingSize = clothingSize;
    }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getClothingSize() { return clothingSize; }
    public void setClothingSize(int clothingSize) { this.clothingSize = clothingSize; }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age=" + age +
                ", clothingSize=" + clothingSize +
                '}';
    }
}
