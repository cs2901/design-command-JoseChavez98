package command;

public class Stereo {
    private static boolean isOn = false;
    public static void  on(){
        isOn = true;
        System.out.println("Stereo ON ");
    }

    public static void off(){
        isOn = false;
        System.out.println("Stereo OFF ");
    }
}
