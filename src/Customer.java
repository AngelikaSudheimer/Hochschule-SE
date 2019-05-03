import java.lang.*;
import java.util.*;

class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String newName) {
        name = newName;
    }

    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    public Vector getRentals() {
        return rentals;
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration enumRentals = rentals.elements();
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enumRentals.hasMoreElements()) {
            Rental rental = (Rental) enumRentals.nextElement();
            Movie movie = rental.getMovie();
            //determine amounts for rental line
            double thisAmount = movie.amountFor(movie, rental);
            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((movie.getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1)
                frequentRenterPoints++;
            //show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" + "\t" + rental.getDaysRented() + "\t" + thisAmount + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }

}
    