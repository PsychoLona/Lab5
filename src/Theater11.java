class Theater11 {
    private String name;
    private String artisticDirector;
    private String address;
    private double rating;

    public Theater11(String name, String artisticDirector, String address, double rating) {
        this.name = name;
        this.artisticDirector = artisticDirector;
        this.address = address;
        this.rating = rating;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtisticDirector() {
        return artisticDirector;
    }

    public void setArtisticDirector(String artisticDirector) {
        this.artisticDirector = artisticDirector;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", artisticDirector='" + artisticDirector + '\'' +
                ", address='" + address + '\'' +
                ", rating=" + rating +
                '}';
    }
}
