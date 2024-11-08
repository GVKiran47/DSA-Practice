import java.util.HashMap;
import java.util.jar.JarOutputStream;

public class hashMyapp {
    public static void main(String[] args) {
        HashMap<String,Integer> hs = new HashMap<>();
        hs.put("Kiran",9574);
        hs.put("Rithwik",2346);
        System.out.println(hs);
        System.out.println(hs.get("Kiran"));
        System.out.println(hs.containsValue(9574));
        hs.clear();
        System.out.println(hs);
    }
}
