
public class ELEVATOR
{
    // instance variables - replace the example below with your own
    private int current_floor;
    private int top_floor;
    private int bottom_floor;

    public ELEVATOR()
    {
        // initialise instance variables
        current_floor = 0;
        top_floor = 11;
        bottom_floor = 0;
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
}
