package Vehicle;

import static java.lang.Math.round;

public class Vehicle {

    private String plate;
    private float capacity;
    private int fuelcap;
    private float lkm;

    public Vehicle(String plate, float capacity, int fuelcap, float lkm) {
        this.plate = plate;
        this.capacity = capacity;
        this.fuelcap = fuelcap;
        this.lkm = lkm;
    }

    private float calculateRange() {
        float range = fuelcap / lkm * 100;
        // zaokrąglanie do 2 miesjc po przecinku
        range *=100;
        range = Math.round(range);
        range /=100;
        return range;
    }

    public void printVehicleInfo()  {
        if (calculateRange() > 1300) {
            System.out.println("Pojazd " + plate + " ma " + capacity + "(t) ładowności. Zasięg na jednym tankowaniu wynosi " + calculateRange() +
                    " co wykazuje, że jest bardzo ekonomiczny i należy w niego inwestować.");
        } else if(calculateRange() > 1200 && calculateRange() < 1300) {
            System.out.println("Pojazd " + plate + " ma " + capacity + "(t) ładowności. Zasięg na jednym tankowaniu wynosi " + calculateRange() +
                    " co wykazuje, że jest ekonomiczny i można w niego inwestować.");
        } else if(calculateRange() > 1000 && calculateRange() < 1200) {
            System.out.println("Pojazd " + plate + " ma " + capacity + "(t) ładowności. Zasięg na jednym tankowaniu wynosi " + calculateRange() +
                    " co wykazuje, że jest przeciętny pod względem ekonomicznym.");
        } else {
            System.out.println("Pojazd " + plate + " ma " + capacity + "(t) ładowności. Zasięg na jednym tankowaniu wynosi " + calculateRange() +
                    " co wykazuje, że nie jest ekonomiczny i należy się go pozbyć!");
        }
    }

    public String getPlate() {
        return plate;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }


    public float getCapacity() {
        return capacity;
    }
    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }


    public int getFuelcap() {
        return fuelcap;
    }
    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }


    public float getLkm() {
        return lkm;
    }
    public void setLkm(float lkm) {
        this.lkm = lkm;
    }
}
