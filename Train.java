import java.util.ArrayList;

public class Train {
    // Attributes 
    private Engine my_Engine;
    private ArrayList<Car> cars;
    private int passengerCapacity;
    private int nCars;

    // Constructor
    /** 
     * A constructor creating a Train based on its FuelType, FuelCapacity, the number of cars it can hitch, 
     * and the number of passengers per car. 
     * @param FuelType the type of fuel the train uses 
     * @param fuelCapacity the total capacity of the fuel 
     * @param nCars the total cars the train can hitch 
     * @param passengerCapacity the number of passengers that can fit in each car
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.nCars = nCars; 
        this.passengerCapacity = passengerCapacity; 
        this.my_Engine = new Engine(fuelType, fuelCapacity, fuelCapacity);
        this.cars = new ArrayList<Car>(nCars); 
        for(int i = 0; i < nCars; i++){
            Car newCar = new Car(passengerCapacity);
            cars.add(newCar);
        }
    }

    // Accessors 

    /**
     * An accessor returning the specific engine of this train
     * @return the specific engine
     */
    public Engine getEngine(){
        return this.my_Engine; 
    }

    /**
     * An accessor returning the name of a specific instance of a car based off of its order in the train 
     * @param i the order the car is in the train
     * @return the name of the i-th car
     */
    public Car getCar(int i){
        return cars.get(i);
    }

    /**
     * An accessor returning the maximum capacity of the entire train based on the number of cars and the number of total seats per car
     * @return the total capacity of the train
     */
    public int getMaxCapacity(){
        System.out.println(passengerCapacity);
        System.out.println(nCars);
        return passengerCapacity * nCars;
    }

    /**
     * An accessor returning the number of seats left on the train 
     * @return the number of seats left on the train 
     */
    public int seatsRemaining(){
        int total_empty_seats = 0;
        for(int i = 0; i < this.nCars; i++){
             int x = getCar(i).seatsRemaining(); 
             total_empty_seats += x;
        }
        return total_empty_seats;
    }

    // Methods 
    /**
     * A method that prints a manifest (sorted by car) of every passenger on the train
     */
    public void printManifest(){
        System.out.println("TOTAL TRAIN MANIFEST");
        for(int i = 0; i < this.nCars; i++){
            System.out.println("Car " + i + "----------");
            getCar(i).printManifest();
        }
    }
}
