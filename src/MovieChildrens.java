public class MovieChildrens extends Movie {

    public MovieChildrens(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double amountFor(Movie movie, Rental rental) {
        double thisAmount = 1.5;
        if (rental.getDaysRented() > 3)
            thisAmount += (rental.getDaysRented() - 3) * 1.5;
        return thisAmount;
    }
}
