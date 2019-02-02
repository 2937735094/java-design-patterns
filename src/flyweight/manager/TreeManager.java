package flyweight.manager;

import flyweight.tree.TreeFlyweight;

public class TreeManager {
    private int[][] treeArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public void displayTree() {
        for (int[] array : treeArray) {
            TreeFlyweight.display(array[0], array[1], array[2]);
        }
    }
}
