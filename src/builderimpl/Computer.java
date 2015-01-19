package builderimpl;

import builderimpl.computerparts.*;

/**
 * Created by misko on 19.1.2015.
 */
public class Computer {


    private Case Case;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private Speaker speaker;
    private Mic mic;
    private Printer printer;

    public Case getCase() {
        return Case;
    }

    public void setCase(Case aCase) {
        Case = aCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Mic getMic() {
        return mic;
    }

    public void setMic(Mic mic) {
        this.mic = mic;
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }


}
