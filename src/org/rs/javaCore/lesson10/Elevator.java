package org.rs.javaCore.lesson10;

/**
 * Created by ADI on 03.07.2015.
 */
public class Elevator {
    private int fromFloor;
    private int toFloor;

    public Elevator(int fromFloor, int toFloor) {
        this.fromFloor = fromFloor;
        this.toFloor = toFloor;
    }

    public void elevatorTrip(){
        switch (fromFloor){
            case 1:
                System.out.println("1");
                fromFloor++;
                if (fromFloor > toFloor){
                    break;
                }
            case 2:
                System.out.println("2");
                fromFloor++;
                if (fromFloor > toFloor){
                    break;
                }
            case 3:
                System.out.println("3");
                fromFloor++;
                if (fromFloor > toFloor){
                    break;
                }
            case 4:
                System.out.println("4");
                fromFloor++;
                if (fromFloor > toFloor){
                    break;
                }
            case 5:
                System.out.println("5");
                fromFloor++;
                if (fromFloor > toFloor){
                    break;
                }
            case 6:
                System.out.println("6");
                fromFloor++;
                if (fromFloor > toFloor){
                    break;
                }
            case 7:
                System.out.println("7");
                fromFloor++;
                if (fromFloor > toFloor){
                    break;
                }
            case 8:
                System.out.println("8");
                fromFloor++;
                if (fromFloor > toFloor){
                    break;
                }
            case 9:
                System.out.println("9");
                fromFloor++;
                if (fromFloor > toFloor){
                    break;
                }

        }
    }
}
