
    import java.util.Scanner;

class Majority_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        // Read the elements of the array
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Call the function to find the majority element
        int majorityElement = findMajorityElement(arr);
        
        // Print the result
        if (majorityElement != -1) {
            System.out.println("The majority element is: " + majorityElement);
        } else {
            System.out.println("No majority element found.");
        }
        
        sc.close();
    }
    
    static int findMajorityElement(int[] arr) {
        int count = 0;
        int majorityElement = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                majorityElement = arr[i];
                count = 1;
            } else if (arr[i] == majorityElement) {
                count++;
            } else {
                count--;
            }
        }
        
        count = 0;
        for (int num : arr) {
            if (num == majorityElement) {
                count++;
            }
        }
        
        if (count > arr.length / 2) {
            return majorityElement;
        } else {
            return -1;
        }
    }
}
