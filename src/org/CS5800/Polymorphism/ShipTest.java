package org.CS5800.Polymorphism;
// Driver Program
public class ShipTest {
    public static void main(String[] args) {
        // Array of Ship references with polymorphism
        Ship[] ships = new Ship[3];

        // Instantiate each type of ship
        ships[0] = new Ship("General Ship", "1990");
        ships[1] = new CruiseShip("Cruise Liner", "2005", 3000);
        ships[2] = new CargoShip("Cargo Carrier", "2010", 50000);

        // Loop through and call each print method
        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }
    }
}