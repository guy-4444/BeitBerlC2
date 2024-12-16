package site;

import heritage.*;

public class SiteMain {

    public static void start() {
        Subscriber c = new Subscriber("guy@gmail.com", 3);
        Guest g = new Guest("shay@gmail.com", 37);

        System.out.println(c.toString());
        System.out.println(g);
    }

}





