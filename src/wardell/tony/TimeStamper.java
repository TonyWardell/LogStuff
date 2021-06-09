package wardell.tony;

import java.text.SimpleDateFormat;

public class TimeStamper {

    // 2021-03-24 16:48:05
    private static final SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String stamp() {

        return (sdf3.format(System.currentTimeMillis()));         // 2021-03-24 16:48:05

    }
}
