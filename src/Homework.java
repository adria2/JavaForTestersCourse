public class Homework {
    public static void main(String[] args) {

        // 1. Cztery zmienne typu int
        double firstNumber = 23;
        double secondNumber = 45;
        double thirdNumber = 66;
        double fourthNumber = 8;
//        double sumFirstAndSecond = firstNumber + secondNumber;
//        double sumThirdAndForth = thirdNumber + fourthNumber;


        // 2. Sprawdzenie czy suma dwóch pierwszych jest parzysta
        if ((firstNumber + secondNumber) % 2 == 0) {
            System.out.println("Suma pierwszej i drugiej liczby jest parzysta");
        } else {
            System.out.println("Suma pierwszej i drugiej liczby jest nieparzysta");
        }

        // 3. Sprawdzenie czy suma dwóch pozostałych jest parzysta
        if ((thirdNumber + fourthNumber) % 2 == 0) {
            System.out.println("Suma trzeciej i czwartej liczby jest parzysta");
        } else {
            System.out.println("Suma trzeciej i czwartej liczby jest nieparzysta");
        }

        // 4. Jeżeli dwie sumy są parzyste to wyświetl informację, że obie liczby są parzyste
        if (((firstNumber + secondNumber) % 2 == 0) && ((thirdNumber + fourthNumber) % 2 == 0)) {
            System.out.println("Obie sumy są parzyste");
        } else {
            System.out.println("Przynajmniej jedna z sum jest nieparzysta");
        }
    }
}
