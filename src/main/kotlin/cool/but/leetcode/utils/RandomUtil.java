package cool.but.leetcode.common.utils;

import java.util.Random;

public class RandomUtil {
	public static int[] getPositiveNums(int num, int max) {
		int[] arr = new int[num];
		Random random = new Random();
		for (int i = 0; i < num; i++) {
			arr[i] = random.nextInt(max);
		}
		return arr;
	}
	
	public static int[] getRandomNums(int num, int max) {
		int[] arr = new int[num];
		Random random = new Random();
		for (int i = 0; i < num; i++) {
			arr[i] = random.nextInt(max * 2) - max;
		}
		return arr;
	}
	
	public static boolean isSortedBigger(int[] nums) {
		boolean isSorted = true;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) return false;
		}
		return isSorted;
	}
}
