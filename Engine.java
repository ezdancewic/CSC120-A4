public class Engine {
    // Attributes 
    private FuelType fuel; 
    private double current_fuel_level;
    private double maximum_fuel_level;

    // Accessors

    /**
     * An accesssor returning the type of fuel the engine uses. 
     * @return the fuel type
     */
    public FuelType getFuelType(){
        return this.fuel;
    }

    /**
     * An accessor returning the current fuel level the engine is at
     * @return the current fuel level 
     */
    public double getCurrentFuelLevel(){
        return this.current_fuel_level;
    }

    /**
     * An accessor returning the maximum fuel level the engine could have 
     * @return the maximum fuel level of this specific engine 
     */
    public double getMaxFuelLevel(){
        return this.maximum_fuel_level;
    }

    // Constructor 
    /** 
     * A constructor creating an instance of an engine
     * @param FuelType the type of fuel used by the engine 
     * @param current_fuel_level the current fuel level that the engine is at 
     * @param maximum_fuel_level the maximum fuel level of this specific engine 
     */
    public Engine(FuelType fuel, double current_fuel_level, double maximum_fuel_level ){
        this.fuel = fuel;
        this.current_fuel_level = current_fuel_level;
        this.maximum_fuel_level = maximum_fuel_level;
    }

    // Methods 
    /**
     * A method that sets the current fuel level to the maximum fuel level. 
     */
    public void refuel(){
        this.current_fuel_level = maximum_fuel_level;
    }

    /**
     * A method that starts the train, gradually depleting the fuel level and printing out the remaining fuel level
     * @return T if there is fuel left in the tank, F if there isn't
     */
    public boolean go(){
        this.current_fuel_level -= 10.0; 
        System.out.println("Remaining fuel level:" + current_fuel_level);
        if (this.current_fuel_level > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0,  100.0); // creating engine
        System.out.println(myEngine.getCurrentFuelLevel()); // checking getCurrentFuelLevel
        while (myEngine.go()) { // Running my train
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    
        // car testing
        //Car myCar = new Car(1); // creating a new car
        // System.out.println(myCar.getCapacity()); // testing getCapacity
        // System.out.println(myCar.getNumPassengers()); //testing getNumPassengers
        // System.out.println(myCar.seatsRemaining()); // testing seatsRemaining
        Passenger ellie = new Passenger("Ellie"); // creating a passenger
        Passenger sam = new Passenger("Sam");
        // myCar.addPassenger(ellie); 
        // System.out.println(myCar.passengers.size()); // testing add passenger
        // System.out.println(myCar.getNumPassengers()); 
        // myCar.printManifest(); // testing manifest 
        // myCar.removePassenger(ellie);
        // myCar.printManifest(); // testing remove passenger

        // passenger testing 
        // sam.boardCar(myCar);
        // myCar.printManifest();
        // System.out.println(myCar.getNumPassengers());
        // ellie.boardCar(myCar);
        // myCar.printManifest();
        // sam.getOffCar(myCar);
        // myCar.printManifest();

        // train testing 
        Train myTrain = new Train(FuelType.ELECTRIC, 100.0, 4, 3);
        System.out.println(myTrain.getEngine());
        System.out.println(myTrain.getMaxCapacity());
        System.out.println(myTrain.getCar(3));
        System.out.println(myTrain.seatsRemaining());
        myTrain.getCar(1).addPassenger(sam); 
        myTrain.getCar(1).printManifest();
        ellie.boardCar(myTrain.getCar(2));
        myTrain.getCar(2).printManifest();
        System.out.println(myTrain.seatsRemaining());
        myTrain.printManifest();
        ellie.getOffCar(myTrain.getCar(1));
        
    }
}

