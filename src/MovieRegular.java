public class MovieRegular extends Movie {
    public MovieRegular(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double amountFor(Movie movie, Rental rental) {
        double thisAmount = 2;
        if (rental.getDaysRented() > 2)
            thisAmount += (rental.getDaysRented() - 2) * 1.5;
        return thisAmount;
    }
}
