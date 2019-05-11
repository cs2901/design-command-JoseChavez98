package  command;
public class Kitchen {

    private static boolean isOn = false;
    public static void  on(){
        isOn = true;
        System.out.println("Light  in Kitchen is "+isOn);
    }

    public static void off(){
        isOn = false;
        System.out.println("Light in Kitchen is "+isOn);
    }
}
