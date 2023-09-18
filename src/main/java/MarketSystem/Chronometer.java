package MarketSystem;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Enzo Portillo.
 */
public class Chronometer extends Thread {

    private int hours, minutes, seconds;

    @Override
    public void run() {
        for (hours = 0; hours < 12; hours++) {
            for (minutes = 0; minutes < 60; minutes++) {
                for (seconds = 0; seconds < 60; seconds++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Chronometer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

    public String getTime() {
        String time = hours + ":" + minutes + ":" + seconds;
        return time;
    }
}
