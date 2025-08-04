package tasks;

class Appliance {
    public void turnOn() {
        System.out.println("Appliance is turned on");
    }
}

class Fan extends Appliance {
    public void rotate() {
        System.out.println("Fan is rotating");
    }
}

class CeilingFan extends Fan {
    public void setSpeed() {
        System.out.println("Ceiling fan speed is set");
    }

    public static void main(String[] args) {
        CeilingFan cf = new CeilingFan();
        cf.turnOn();
        cf.rotate();
        cf.setSpeed();
    }
}
