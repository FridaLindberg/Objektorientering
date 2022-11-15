package sprint4.intro;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress adress = InetAddress.getLocalHost();
        System.out.println(adress);
    }
}
