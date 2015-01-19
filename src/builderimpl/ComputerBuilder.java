package builderimpl;

import builderimpl.computerparts.*;

/**
 * Created by misko on 19.1.2015.
 */
public class ComputerBuilder implements Builder {

    private Computer computer;

    public ComputerBuilder() {
        computer = new Computer();
    }


    @Override
    public Builder buildMonitor(String manufacturer) {
        computer.setMonitor(new Monitor(manufacturer));
        return this;
    }

    @Override
    public Builder buildKeyboard(String manufacturer) {
        computer.setKeyboard(new Keyboard(manufacturer));
        return this;
    }

    @Override
    public Builder buildMouse(String manufacturer) {
        computer.setMouse(new Mouse(manufacturer));
        return this;
    }

    @Override
    public Builder buildSpeaker(String manufacturer) {
        computer.setSpeaker(new Speaker(manufacturer));
        return this;
    }

    @Override
    public Builder buildMic(String manufacturer) {
        computer.setMic(new Mic(manufacturer));
        return this;
    }

    @Override
    public Builder buildCase(String manufacturer) {
        computer.setCase(new Case(manufacturer));
        return this;
    }

    @Override
    public Builder buildPrinter(String manufacturer) {
        computer.setPrinter(new Printer(manufacturer));
        return this;
    }

    @Override
    public Computer getComputer() {
        return computer;
    }

    public void clear() {
        computer = new Computer();
    }
}
