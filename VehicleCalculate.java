package Vehicle;

public class VehicleCalculate {
    public static void main(String[] args) {

        Vehicle truck1 = new Vehicle("KR878NJ/MAN TGL", 5.5f, 250, 19.5f);
        truck1.printVehicleInfo();
        Vehicle truck2 = new Vehicle("KR9A301/MAN TGM", 7.0f, 200, 23.5f);
        truck2.printVehicleInfo();
        Vehicle truck3 = new Vehicle( "KR3N065/DAF LF", 8.0f, 250, 22.5f);
        truck3.printVehicleInfo();
        Vehicle truck4 = new Vehicle( "KR8CA24/IVECO EC", 8.0f, 300, 21.5f);
        truck4.printVehicleInfo();
    }
}