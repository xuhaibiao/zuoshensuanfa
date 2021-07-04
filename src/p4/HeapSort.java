package p4;


/**
 * 堆排序（大根堆）
 * @author HaibiaoXu
 * @date Create in 13:21 2021/6/15
 * @modified By
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 8, 7, 6};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void sort(int[] arr){
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            heapInsert(arr, i);
        }
//        for (int i = arr.length - 1; i >= 0; i--) {
//            heapify(arr, i, arr.length);
//        }
        int heapSize = arr.length;
        while (heapSize > 1) {
            swap(arr, 0, --heapSize);
            heapify(arr,0,heapSize);
        }
    }

    /**
     * 插入堆（大根）
     * @param arr 数组
     * @param index 要插入堆中的下标号
     */
    public static void heapInsert(int[] arr, int index){
        while (arr[(index - 1) / 2] < arr[index]) {
            swap(arr, (index - 1) / 2, index);
            index = (index - 1) / 2;
        }
    }

    /**
     * 调整堆
     * @param arr 数组
     * @param index 要去掉的下标号
     * @param heapSize 堆大小
     */
    public static void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            // 大的孩子节点下标
            int large = left + 1 < heapSize && arr[left] < arr[left + 1] ? left + 1 : left;
            if (arr[index] > arr[large]) {
                break;
            }
            swap(arr, index, large);
            index = large;
            left = index * 2 + 1;
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

}
