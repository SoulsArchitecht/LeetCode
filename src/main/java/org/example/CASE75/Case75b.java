package org.example.CASE75;

public class Case75b {

    public int[] sortColors(int[] nums) {
        final int RED = 0;
        final int WHITE = 1;
        final int BLUE = 2;

        int redPointer = 0;
        int bluePointer = 0;
        int i = 0;

        while (i <= bluePointer) {
            switch(nums[i]) {
                case RED:
                    swap(nums, i, redPointer);
                    redPointer++;
                    break;
                case WHITE:
                    i++;
                    break;
                case BLUE:
                    swap(nums, i, bluePointer);
                    bluePointer--;
                    break;
            }
        }

        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
