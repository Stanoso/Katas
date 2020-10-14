import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        System.out.println(repeats(new int[]{4, 5, 7, 5, 4, 8}));

    }

    public static int repeats(int[] arr) {
        Arrays.sort(arr);
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] != arr[i + 1]) {
                    result += arr[i];
                }
            } else if (i < arr.length - 1) {
                if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1]) {
                    result += arr[i];
                }
            } else {
                if (arr[i] != arr[i - 1]) {
                    result += arr[i];
                }
            }


        }
        return result;
    }

}
