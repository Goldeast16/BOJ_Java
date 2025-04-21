package silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class N32932 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = br.readLine().trim().split(" ");
        int N = Integer.parseInt(nk[0]);
        int K = Integer.parseInt(nk[1]);

        Field field = new Field();
        for (int i = 0; i < N; i++) {
            String[] xy = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            field.addObstacle(x, y);
        }

        String commands = br.readLine().trim();
        field.execute(commands);
        field.printDroneLocation();
    }
}


class Drone {
    private int x = 0;
    private int y = 0;

    int getX() { return x; }
    int getY() { return y; }

    void moveTo(int nx, int ny) {
        this.x = nx;
        this.y = ny;
    }
}

class Field {
    private final Drone drone = new Drone();
    private final Set<String> obstacles = new HashSet<>();

    private static String key(int x, int y) {
        return x + "#" + y;
    }

    void addObstacle(int x, int y) {
        obstacles.add(key(x, y));
    }

    void execute(String cmds) {
        for (int i = 0; i < cmds.length(); i++) {
            int cx = drone.getX();
            int cy = drone.getY();
            char c = cmds.charAt(i);

            int nx = cx, ny = cy;
            switch (c) {
                case 'U' -> ny++;
                case 'D' -> ny--;
                case 'R' -> nx++;
                case 'L' -> nx--;
            }

            if (!obstacles.contains(key(nx, ny))) {
                drone.moveTo(nx, ny);
            }
        }
    }

    void printDroneLocation() {
        System.out.println(drone.getX() + " " + drone.getY());
    }
}
