import java.util.*;

public class SensorIoT {
    public static void main(String[] args) {
        Deque<Integer> temperaturas = new ArrayDeque<>();

        int[] lecturas = {20, 21, 22, 23, 24, 25, 26};

        for (int temperatura : lecturas) {
            if (temperaturas.size() == 5) {
                temperaturas.removeFirst();
            }

            temperaturas.addLast(temperatura);
            System.out.println(temperaturas);
        }
    }
}
