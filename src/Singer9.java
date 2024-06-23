class Singer9 {
    private String name;
    private double rating;
    private int albumsReleased;

    public Singer9(String name, double rating, int albumsReleased) {
        this.name = name;
        this.rating = rating;
        this.albumsReleased = albumsReleased;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getAlbumsReleased() {
        return albumsReleased;
    }

    public void setAlbumsReleased(int albumsReleased) {
        this.albumsReleased = albumsReleased;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", albumsReleased=" + albumsReleased +
                '}';
    }
}
