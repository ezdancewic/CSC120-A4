import java.util.ArrayList;

public class Car {
    // Attributes 
    private int maximum_capacity;
    private ArrayList<Passenger> passengers;

    // Constructor 
    /**
     * A constructor that creates a car based on its maximum capacity
     * @param maximum_capacity how many passengers can fit in this specific car
     */
    public Car(int maximum_capacity){
        this.maximum_capacity = maximum_capacity; 
        this.passengers = new ArrayList<Passenger>(maximum_capacity); 
    }

    // Accessor-like Methods
    
    /**
     * An accessor returning the maximum capacity of this specicic car
     * @return the maximum number of passengers in this car
     */
    public int getCapacity(){
        return this.maximum_capacity;
    }

    /**
     * An accessor returning the number of passengers currently in a specific car
     * @return the number of passengers currently in the car
     */     
    public int getNumPassengers(){
        return passengers.size();
    }

    /** 
     * An accesssor returning the number of seats remaining in a specific car
     * @return the number of remaining seats
     */
    public int seatsRemaining(){
        int seats_remaining = this.maximum_capacity - passengers.size();
        return seats_remaining;
    }

    // Methods
    
    /**
     * A method that adds a specific passenger to a specific car 
     * @param p the passenger being added
     * @return T if the passenger was successfully added (only if there's space in the car), and F if it wasn't
     */
    public boolean addPassenger(Passenger p){
      if(seatsRemaining() > 0){
        passengers.add(p);
        System.out.println("passenger added");
        return true;
      }  
      else{
        return false;
      }

    }

    /**
     * A method which returns a specific passenger from a specific car
     * @param p the passenger to remove
     * @return T if the passenger was successfully removed (only if the passenger was actually in the car) and F if they weren't removed
     */ 
    public boolean removePassenger(Passenger p){
        for (int i = 0; i < passengers.size(); i++){
            if(passengers.get(i) == p){
                passengers.remove(i);
                return true;
            }
            else{
                continue; //might not be necessary? 
            }
        }
        return false;
    }

    /**
     * A method with no parameters and no returns, which prints out a formatted list of each passenger in a specific car.
     */
    void printManifest(){
        if(getNumPassengers() > 0){
            System.out.println("MANIFEST");
            for (int i = 0; i < passengers.size(); i++ ){
                System.out.println(passengers.get(i).getName());
            }
        }
        else{
            System.out.println("This car is EMPTY.");
        } 
   } 
    

}