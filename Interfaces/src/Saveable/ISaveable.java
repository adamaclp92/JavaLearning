package Saveable;

import java.util.ArrayList;

public interface ISaveable {
    ArrayList<String> write();
    void read(ArrayList<String> list);

}
