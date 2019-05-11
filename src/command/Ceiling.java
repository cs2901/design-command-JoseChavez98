package command;

public class Ceiling {
    private static boolean isOn = false;
    public static void  high(){
        isOn = true;
        System.out.println("Ceiling fan in High ");
    }

    public static void low(){
        isOn = false;
        System.out.println("Ceiling fan is Low ");
    }
}
