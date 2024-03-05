
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        int metri = this.squares;
        int comp = compared.squares;
        
        if (metri>comp){
            return true;
        }else{
            return false;
        }
        
    }

}
