package hack.challenge;
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

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    	
    	/*Integer[] result = new Integer[queries.size()];
    	int found=0;    	
    	for(int i=0;i<queries.size();i++ ) {
	    	if(strings.contains(queries.get(i))) {
	    		System.out.println("Process: "+strings+"/"+queries.get(i));
	    		result[i]=found+1;
	    	}
    		result.add(Collections.frequency(strings, queries.get(i)));
	    	
    	}
    	return Arrays.asList(result);*/
    	
    	/*
    	ArrayList result =  new ArrayList();
    	for(int i=0;i<queries.size();i++ ) {
    		result.add(Collections.frequency(strings, queries.get(i)));
    	}
    	return result;
    	*/
        IntStream.range(0, queries.size()).mapToObj(i->strings).
        mapToLong(q->strings.stream().filter(q::equals).count()).forEach(System.out::println);
        
        return new ArrayList();
    }

}

public class StringArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ////BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> strings = IntStream.range(0, stringsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());
        
        System.out.println("Input: "+strings+"/"+queries);
        
        List<Integer> res = Result.matchingStrings(strings, queries);
        
        System.out.println("Response: "+res);
        //bufferedWriter.write(
        System.out.println(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
