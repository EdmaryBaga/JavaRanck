package mx.com.hacker_ranck.gonet.acm_icpc_team;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution {
    // Complete the acmTeam function below.
    private static int[] acmTeam(String[] topic) {
        int n = topic.length;
        BigInteger[] bi = new BigInteger[n];

        for (int i = 0; i < n; i++) bi[i] = new BigInteger(topic[i], 2);

        int maxTopic = 0;
        int teamCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                BigInteger iuj = bi[i].or(bi[j]);
                int bitCount = iuj.bitCount();
                if (bitCount > maxTopic) {
                    maxTopic = bitCount;
                    teamCount = 1;
                } else if (bitCount == maxTopic) {
                    teamCount++;
                }
            }
}

    return new int[]{ maxTopic, teamCount };
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/cam06/Desktop/H4ck3rR4nck/HackerRanck/src/diagonal.txt"));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));
            if (i != result.length - 1) {
                bufferedWriter.write("\n");
                
            }
            System.out.println(result[i]);
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
