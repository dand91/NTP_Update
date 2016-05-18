package Main;

/**
 * Created by Andersson on 18/05/16.
 */

public class Log {

    public static void i(String TAG , String message){

        System.out.println("Information: " + TAG + ": " + message);

    }
    public static void e(String TAG , String message){

        System.err.println("Error: " + TAG + ": " + message);

    }
    public static void d(String TAG , String message){

        System.out.println("Debug: " + TAG + ": " + message);

    }
    public static void v(String TAG , String message){

        System.out.println("Verbose: " + TAG + ": " + message);

    }
    public static void W(String TAG , String message){

        System.err.println("Warning: " + TAG + ": " + message);

    }
}
