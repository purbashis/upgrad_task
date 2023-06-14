import java.util.Scanner;

class Search_el_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Create the array
        int[] arr = new int[size];

        // Read the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Read the element to search
        System.out.print("Enter the element to search: ");
        int element = sc.nextInt();

        // Count the occurrences of the element
        int count = countOccurrences(arr, element);

        // Print the result
        printResult(element, count);

        // Close the scanner
        sc.close();
    }

    static int countOccurrences(int[] arr, int element) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }
        return count;
    }

    static void printResult(int element, int count) {
        if (count > 0) {
            System.out.println("The element " + element + " is present in the array.");
            System.out.println("It occurs " + count + " time(s).");
        } else {
            System.out.println("The element " + element + " is not present in the array.");
        }
    }

}
