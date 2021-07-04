package p4;

import java.util.PriorityQueue;

/**
 * @author HaibiaoXu
 * @date Create in 16:06 2021/6/15
 * @modified By
 */
public class SortedArrayDistanceLessK {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 8, 7, 6};
        sortedArrayDistanceLessK(arr, 2);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void sortedArrayDistanceLessK(int[] arr, int k) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 默认小根堆
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int i = 0;
        // 前k个放入小根堆中
        for (; i <= Math.min(arr.length - 1, k); i++) {
            heap.add(arr[i]);
        }
        int idx = 0;
        arr[idx++] = heap.poll();
        for (; i < arr.length; i++) {
            heap.add(arr[i]);
            arr[idx++] = heap.poll();
        }
        while (!heap.isEmpty()) {
            arr[idx++] = heap.poll();
        }
    }
}
