package Vehicle;

public class Vehicle {
    String plate; // nazwa pojazdu
    float capacity; // ładowność
    int fuelcap; // pojemność zbiornika paliwa
    double lkm; // spalanie na 100km
    // użycie metody range() do obliczenia
    void range() {
        System.out.println("Pojazd " + plate + " ma " + capacity + "(t) ładowności. Zasięg na jednym tankowaniu wynosi "
                            + (int) (fuelcap / lkm * 100) + "(km)");
    }
}
