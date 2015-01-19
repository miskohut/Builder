package builderimpl;

/**
 * Created by misko on 19.1.2015.
 */
public class Main {

    public static void main(String[] args) {
        Builder builder = new ComputerBuilder();
        builder.buildCase("HP").buildKeyboard("logitech").buildMonitor("ASUS").buildMouse("genius");

        Computer basicComputer = builder.getComputer();

        System.out.println(basicComputer.getKeyboard().getManufacturer());
        System.out.println(basicComputer.getMonitor().getManufacturer());
        System.out.println(basicComputer.getMouse().getManufacturer());
        System.out.println(basicComputer.getCase().getManufacturer());


        System.out.println("/================== clearing ... =====================/");
        builder.clear();

        Computer extendedComputer = builder.buildCase("HP").buildKeyboard("logitech")
                                    .buildMouse("genius").buildMonitor("ASUS").buildMic("BLA")
                                    .buildPrinter("LEXMARK").buildSpeaker("miyako").getComputer();

        System.out.println(extendedComputer.getKeyboard().getManufacturer());
        System.out.println(extendedComputer.getMonitor().getManufacturer());
        System.out.println(extendedComputer.getMouse().getManufacturer());
        System.out.println(extendedComputer.getCase().getManufacturer());
        System.out.println(extendedComputer.getPrinter().getManufacturer());
        System.out.println(extendedComputer.getSpeaker().getManufacturer());
        System.out.println(extendedComputer.getMic().getManufacturer());


    }
}
