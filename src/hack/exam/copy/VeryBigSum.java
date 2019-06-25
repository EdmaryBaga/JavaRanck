package hack.exam.copy;
import java.io.*;
import java.util.*;


class Solution {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
    	long total=0;
    	for (int p=0; p<ar.length; p++) {
    		total+=ar[p];
    	}
    	return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/cam06/Desktop/H4ck3rR4nck/HackerRanck/src/diagonal2.txt"));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] ar = new long[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arItems[i]);
            ar[i] = arItem;
        }

        long result = aVeryBigSum(ar);
        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
