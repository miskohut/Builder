package builderimpl;

/**
 * Created by misko on 19.1.2015.
 */
public interface Builder {
    public Builder buildMonitor(String manufacturer);
    public Builder buildKeyboard(String manufacturer);
    public Builder buildMouse(String manufacturer);
    public Builder buildSpeaker(String manufacturer);
    public Builder buildMic(String manufacturer);
    public Builder buildCase(String manufacturer);
    public Builder buildPrinter(String manufacturer);
    public Computer getComputer();
    public void clear();
}
