class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie newMovie, int newdaysRented) {
        movie = newMovie;
        daysRented = newdaysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }
}