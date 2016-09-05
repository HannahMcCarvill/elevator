
public class ELEVATOR
{
    // instance variables - replace the example below with your own
    private int current_floor;
    private int top_floor;
    private int bottom_floor;
    private int occupants;
    private int PassengerLimit;

    public ELEVATOR()
    {
        // initialise instance variables
        current_floor = 0;
        top_floor = 11;
        bottom_floor = 0;
        occupants = 0;
        PassengerLimit = 6;
    }

    public void ascend()
    {
        if(current_floor < top_floor) {
            current_floor = current_floor + 1;
        }
        else{
            System.out.println("Sorry you are at the top floor");
        }

    }

    public void descend()
    {
        if(current_floor > bottom_floor){
            current_floor = current_floor - 1;

        }
        else{
            System.out.println("Sorry you are now at the bottom floor");
        }

    }

    public void board()
    {
        if(occupants < PassengerLimit){
            occupants = occupants + 1;
        }
        else{
            System.out.println("Sorry the lift is full");
        }
    }

    public void exit()
    {
        if(occupants > PassengerLimit){
            occupants = occupants - 1;
        }
        else{
            System.out.println("The lift has no passengers and will stay were it is");
        }
    }
}
