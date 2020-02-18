package Vehicle;

import Vehicle.Vehicle;

public class VehicleCalculate {
    public static void main(String[] args) {

        Vehicle truck1 = new Vehicle();
        Vehicle truck2 = new Vehicle();
        Vehicle truck3 = new Vehicle();
        Vehicle truck4 = new Vehicle();
        int range;

        truck1.plate = "KR878NJ/MAN TGL";
        truck1.capacity = 5.5f;
        truck1.fuelcap = 250;
        truck1.lkm = 19.5;
        System.out.print("Pojazd KR878NJ ma ");
        truck1.range();

        truck2.plate = "KR9A301/MAN TGM";
        truck2.capacity = 7.0f;
        truck2.fuelcap = 200;
        truck2.lkm = 23.5;
        System.out.print("Pojazd KR9A301 ma ");
        truck2.range();

        truck3.plate = "KR3N065/DAF LF";
        truck3.capacity = 8.0f;
        truck3.fuelcap = 250;
        truck3.lkm = 22.5;
        System.out.print("Pojazd KR3N065 ma ");
        truck3.range();

        truck4.plate = "KR8CA24/IVECO EC";
        truck4.capacity = 8.0f;
        truck4.fuelcap = 300;
        truck4.lkm = 21.5;
        System.out.print("Pojazd KR8CA24 ma ");
        truck4.range();
    }
}