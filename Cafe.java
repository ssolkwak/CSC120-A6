/* This is a stub for the Cafe class */
public class Cafe extends Building{
    private int nCoffeeOunces; 
    private int nSugarPackets;
    private int nCreams; 
    private int nCups; 

    /**
     * Cafe constructor which creates a building with stocks in inventory
     * @param name name of the cafe
     * @param address address of the cafe
     * @param nFloors floors of the cafe
     */
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 300;
        this.nSugarPackets = 500;
        this.nCreams = 400;
        this.nCups = 350;
        System.out.println("You have built a cafe: ☕");
    }

    /**
     * Decrease the stocked ingredients by values given in parameters. If the stock is below the requested amount, restock the inventory. 
     * @param size size of the coffee to be sold
     * @param nSugarPackets number of sugar packets to be sold
     * @param nCreams number of creams to be sold
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (this.nCoffeeOunces >= size && this.nSugarPackets >= nSugarPackets && this.nCreams >= nCreams && this.nCups >= 1){
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups -= 1;
        } else {
            this.restock(400, 100, 100, 100);
        }
    }
    
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }
    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        Cafe cc = new Cafe("CC", "100 Elm St", 1);
    }
    
}
