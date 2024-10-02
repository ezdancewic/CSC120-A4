public class Passenger {
    
    // Attributes
    private String name;

    // Constructor 
    /**
     * A constructor creating a passenger with a specific name
     * @param name the name of the passenger
     */
    public Passenger(String name) {
        this.name = name;
    }

    // Accessor 

    /**
     * An accessor returning the name of a specific passenger
     * @return the name of the passenger
     */
    public String getName(){
        return this.name;
    }

    // Methods 
    /**
     * A method that adds a passenger to a specified car if there is room in that car. 
     * @param c the car that the passenger is boarding 
     */
    public void boardCar(Car c){
        if(c.addPassenger(this)){
            System.out.println("Passenger added.");
        }
        else{
            System.out.println("This car is full.");
        }
    }

    /** 
     * A method that removes a passenger from a specified car. 
     * @param c the car that the passenger is leaving 
     */
    public void getOffCar(Car c){
        if(c.removePassenger(this)){
            System.out.println("Passenger removed.");
        } 
        else{
            System.out.println("This passenger is not in this car.");
        }
    }

}
