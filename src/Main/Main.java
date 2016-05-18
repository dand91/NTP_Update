package Main;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Andersson on 18/05/16.
 */

public class Main {

    private static Long adjustment;

    public static void main(String[] args){


        NTPThread thread = new NTPThread();

        thread.addObserver(new Observer() {
            @Override
            public void update(Observable observable, Object object) {

                adjustment = (Long) object;

            }
        });

        while(true){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            thread.getInfo();

        }


    }
}
