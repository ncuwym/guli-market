package cn.ck.common.sort;

/**
 * @author wangyuming
 */
public class MaoPaoSort {
    public static void main(String[] args) {
        int[] array = {56987, 4, 24, 78, 9, 90, 1};
        sort(array);
    }

    /**
    冒泡排序
    */
    public static void sort(int[] array) {
        //i代表比较轮数
        boolean isSort = true;
        for (int i = 1; i < array.length; i++) {
            //比较相邻的两个元素，较大的数往后冒泡
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSort = false;
                }
                if (isSort) {
                    break;
                }
            }
            for (int k : array) {
                System.out.print(" " + k);
            }
            System.out.println();
        }
    }
}
