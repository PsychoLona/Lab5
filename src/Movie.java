class Movie {
    private String title;
    private int releaseYear;
    private String country;
    private String genre;
    private double rentalCost;

    public Movie(String title, int releaseYear, String country, String genre, double rentalCost) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.country = country;
        this.genre = genre;
        this.rentalCost = rentalCost;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getReleaseYear() { return releaseYear; }
    public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public double getRentalCost() { return rentalCost; }
    public void setRentalCost(double rentalCost) { this.rentalCost = rentalCost; }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", country='" + country + '\'' +
                ", genre='" + genre + '\'' +
                ", rentalCost=" + rentalCost +
                '}';
    }
}
