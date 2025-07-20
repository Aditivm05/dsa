/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.ArrayList;
import java.time.LocalTime;
class Car {
    String name;
    int tyres;
    int cc;

    public Car(String name, int tyres, int cc) {
        this.name = name;
        this.tyres = tyres;
        this.cc = cc;
    }

    public void displayInfo() {
        System.out.println("Type of car: " + name);
        System.out.println("Number of Tyres: " + tyres);
        System.out.println("Value of cc: " + cc);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("SUV", 5, 700));
        cars.add(new Car("Sweden", 4, 600));
        cars.add(new Car("MPL", 6, 10000));

        for (Car car : cars) {
            long start = System.nanoTime();  // Start time before display
            car.displayInfo();
            long stop = System.nanoTime();   // Stop time after display

            System.out.println("Start Time: " + start);
            System.out.println("Stop Time: " + stop);
            System.out.println("Elapsed Time (ns): " + (stop - start));
            System.out.println("---------------------------");
 }
}
}