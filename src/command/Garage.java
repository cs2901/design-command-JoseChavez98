package command;

public class Garage {
        private static boolean isOn = false;
        public static void  open(){
            isOn = true;
            System.out.println("Garage door open ");
        }

        public static void close(){
            isOn = false;
            System.out.println("Garage door close ");
        }

}
