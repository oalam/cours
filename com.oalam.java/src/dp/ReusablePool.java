/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HumanBooster
 */
public class ReusablePool {

    private static ReusablePool instance = new ReusablePool();

    public static ReusablePool getInstance() {
        return instance;
    }
    int maxSize = 10;
    List<Reusable> pool = new ArrayList<>();
    boolean locks[] = new boolean[maxSize];

    private ReusablePool() {

        for (int i = 0; i < maxSize; i++) {
            pool.add(new Reusable());
            locks[i] = false;
        }

    }

    public Reusable acquire() {

        int freeObjectIndex = -1;

        for (Boolean isLocked : locks) {
            freeObjectIndex++;
            if (!isLocked) {
                locks[freeObjectIndex] = true;
                return pool.get(freeObjectIndex);
            }
        }

        return null;
    }

    public void release(Reusable r) {

        int objectIndex = pool.indexOf(r);
        if (objectIndex != -1) {
            locks[objectIndex] = false;
        }


    }

    public void clear() {
        for (int i = 0; i < maxSize; i++) {
            locks[i] = false;
        }

    }
}
