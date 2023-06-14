import java.util.Scanner;

public class Find_duplicate {

    public static int[] findDuplicates(int[] nums) {
        int[] counts = new int[nums.length];
        int countIndex = 0;

        for (int i = 0; i < nums.length - 1; i++) { // Update the loop condition
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                counts[countIndex] = Math.abs(nums[i]);
                countIndex++;
            } else {
                nums[index] = -nums[index];
            }
        }

        int[] duplicates = new int[countIndex];

        for (int i = 0; i < countIndex; i++) {
            duplicates[i] = counts[i];
        }

        return duplicates;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = sc.nextInt();
        int[] arr = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] duplicates = findDuplicates(arr);
        System.out.print("Duplicates in the array: ");
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
    }
}
