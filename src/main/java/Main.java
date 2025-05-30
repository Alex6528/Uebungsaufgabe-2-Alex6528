public class Main {

    // Aufgabe 1
    public static void printGreeting(String name) {
        System.out.println("Hallo " + name);
    }

    // Aufgabe 2
    public static void calculate(int numOne, int numTwo, String operation) {
        switch (operation) {
            case "sum":
                System.out.println(numOne + " + " + numTwo + " = " + (numOne + numTwo));
                break;
            case "difference":
                System.out.println(numOne + " - " + numTwo + " = " + (numOne - numTwo));
                break;
            case "product":
                System.out.println(numOne + " * " + numTwo + " = " + (numOne * numTwo));
                break;
            case "quotient":
                if (numTwo == 0) {
                    System.out.println("Division durch 0 ist nicht möglich");
                } else {
                    System.out.println(numOne + " / " + numTwo + " = " + ((double) numOne / numTwo));
                }
                break;
            default:
                System.out.println("Unbekannte Operation");
        }
    }

    // Aufgabe 3a: Quadrat
    public static double calculatePerimeter(double sideLength) {
        if (sideLength < 0) {
            System.out.println("Negative Kantenlängen sind nicht möglich");
            return -1;
        }
        double perimeter = 4 * sideLength;
        System.out.println("Der Umfang von einem Quadrat mit den Kantenlängen "
                + sideLength + " beträgt " + perimeter);
        return perimeter;
    }

    // Aufgabe 3b: Rechteck (Überladung)
    public static double calculatePerimeter(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Negative Kantenlängen sind nicht möglich");
            return -1;
        }
        double perimeter = 2 * (length + width);
        System.out.println("Der Umfang von einem Rechteck mit den Kantenlängen "
                + length + " und " + width + " beträgt " + perimeter);
        return perimeter;
    }

}
