
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getRooms() {
        return this.rooms;
    }

    public int getSquares() {
        return this.squares;
    }

    public int getPriceSquare() {
        return this.pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.getSquares() > compared.getSquares()) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
       if (this.getSquares() * this.getPriceSquare() 
       - compared.getSquares() * compared.getPriceSquare() < 0) {
        return (this.getSquares() * this.getPriceSquare() 
        - compared.getSquares() * compared.getPriceSquare()) *-1;

        }
        

        return this.getSquares() * this.getPriceSquare() - compared.getSquares() * compared.getPriceSquare();

    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.getSquares() * this.getPriceSquare() > compared.getSquares() * compared.getPriceSquare()) {
            return true;
        } else {
            return false;
        }
    }

}
