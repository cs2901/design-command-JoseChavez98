package command;

public class Light {
    private boolean isOn = false;
    public void  on(){
        isOn = true;
        System.out.println("LivingRoom Light is "+isOn);
    }

    public void off(){
        isOn = false;
        System.out.println("LivingRoom Light is "+isOn);
    }

}
