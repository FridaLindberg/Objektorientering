package sprint4.√∂vningsuppgift12Chatt;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ChattWriters {

    private static List<PrintWriter> writers = new ArrayList<>();

    public void addWriter (PrintWriter w) {
        writers.add(w);
    }
    public List<PrintWriter> getWriters() {
        return writers;
    }
}
