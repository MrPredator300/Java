public class LongestMIrrorSubArray {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 0,0,1, 1, 1 };
        int n = arr.length;
        System.out.println(maxLength(arr,n));
    }

    static int maxLength(int arr[], int n)
    {
        int maxLen = 0;
        int i = 0;
        int j = i + 1;

        while (j < n) {
            if (arr[i] != arr[j]) {
                maxLen = Math.max(maxLen, 2);
                int l = i - 1;
                int r = j + 1;
                while (l >= 0 && r < n && arr[l] == arr[i] && arr[r] == arr[j]) {
                    l--;
                    r++;
                }
                maxLen = Math.max(maxLen, 2 * (r - j));
            }
            i++;
            j = i + 1;
        }
        return maxLen;
    }

}
