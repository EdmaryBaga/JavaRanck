
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
    	
    	int sumad1= 0;
    	int sumad2=0;
    	int index =arr.size()-1;
    	for (int i=0; i<=index; i++) {
    		sumad1 += arr.get(i).get(i);
    		sumad2 += arr.get(index-i).get(i);  
    		System.out.println(arr.get(1).get(2));
    	}
    	System.out.println("dato "+arr.size()+" "+sumad1+" "+sumad2);
    
    	
		return Math.abs(sumad1-sumad2);
    }

}

 class Solutiones{
   public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/cam06/Desktop/H4ck3rR4nck/HackerRanck/src/diagonal.txt"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

       
        int result = Result.diagonalDifference(arr);
        System.out.println(result);
        

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


