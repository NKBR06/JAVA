package paymentSystem;

import java.util.Scanner;

interface SmartDevice {
    void turnOn();
    void turnOff();
    void status();
}

class SmartLight implements SmartDevice {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("SmartLight is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("SmartLight is now OFF.");
    }

    public void status() {
        System.out.println("The status of the SmartLight is " + (isOn ? "ON" : "OFF"));
    }
}

class SmartFan implements SmartDevice {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("SmartFan is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("SmartFan is now OFF.");
    }

    public void status() {
        System.out.println("The status of the SmartFan is " + (isOn ? "ON" : "OFF"));
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartDevice device;

        System.out.print("Choose the device (SmartFan/SmartLight): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("SmartFan")) {
            device = new SmartFan();
        } else if (choice.equalsIgnoreCase("SmartLight")) {
            device = new SmartLight();
        } else {
            System.out.println("Invalid device choice!");
            sc.close();
            return;
        }

        System.out.print("Action (Turn On/Turn Off/Status): ");
        String action = sc.nextLine();

        switch (action.toLowerCase()) {
            case "turn on":
                device.turnOn();
                break;
            case "turn off":
                device.turnOff();
                break;
            case "status":
                device.status();
                break;
            default:
                System.out.println("Invalid action");
        }

        sc.close();
    }
}
