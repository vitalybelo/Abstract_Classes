public class Main
{

    public static void main(String[] args) {

        Lamp lamp = new Lamp(100);

        lamp.setBrightness(0.5);
        lamp.changeBrightness(0.5);
        System.out.println("Яркость лампы = " + lamp.brightness);
        System.out.println("Потребление энергии = " + lamp.getEnergyConsumption());

    }
}
