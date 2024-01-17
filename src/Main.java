public class Main {
    public static void main(String[] args) {
        watch();
    }
    public static void watch() {
        for (int hour = 0; hour <= 23; hour++){
            for (int minute = 0; minute <= 59; minute++){
                for (int seconde = 0; seconde <= 60; seconde++){
                    System.out.println(hour + " : " + minute + " : " + seconde);
                }
            }
        }
    }
}