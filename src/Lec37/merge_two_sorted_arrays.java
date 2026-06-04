package Lec37;

public class merge_two_sorted_arrays {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5};
        int[] arr2 = {1, 5, 7, 9, 11, 13, 15};

        int[] result = merge_two_array(arr1, arr2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] merge_two_array(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k++] = arr1[i++];

            } else {
                ans[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            ans[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            ans[k++] = arr2[j++];
        }
        return ans;
    }
}