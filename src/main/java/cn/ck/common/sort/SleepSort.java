package cn.ck.common.sort;

/**
 * @author wangyuming
 *
 */
public class SleepSort {

    public static void main(String[] args) {
        int[] nums = {1,5,67,89};
        sleepSort(nums);
    }

    /**
     * 睡眠排序
     *
     * @param nums []
     */
    public static void sleepSort(int[] nums) {
        for (final int num : nums) {
            new Thread(() -> {
                try {
                    Thread.sleep(num);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(num);
            }).start();
        }

    }
}
