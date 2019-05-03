public class MovieNewRelease extends Movie {
    public MovieNewRelease(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double amountFor(Movie movie, Rental rental) {
        return rental.getDaysRented() * 3;
    }
}
