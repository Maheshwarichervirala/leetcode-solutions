import java.util.*;

class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {

        Arrays.sort(asteroids);

        long m = mass;

        for (int i = 0; i < asteroids.length; i++) {

            if (m >= asteroids[i]) {
                m = m + asteroids[i];
            }
            else {
                return false;
            }
        }

        return true;
    }
}