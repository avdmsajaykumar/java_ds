package hackerrankprograms;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GatewayThrottling {

    List<Integer> input = Arrays.asList(1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7);
    GatewayThrottling(){
        System.out.println(Result.droppedRequests(input));
    }

    public static void main(String[] args) {
        new GatewayThrottling();
    }
}

class Result {

    /*
     * Complete the 'droppedRequests' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY requestTime as parameter.
     */

    public static int droppedRequests(List<Integer> requestTime) {
        // Write your code here
        System.out.println(requestTime.toString());
        int output = 0;
        Map<Integer, Integer> droppedAlready = new HashMap<>();

        for(int i = 0; i<requestTime.size(); i++){
            if(i>2 && requestTime.get(i).equals(requestTime.get(i - 3))){
                if(!droppedAlready.containsKey(requestTime.get(i))
                        || droppedAlready.get(requestTime.get(i))!=i){
                    droppedAlready.put(requestTime.get(i), i);
                    output++;
                    System.out.println(requestTime.get(i));
                }

            }

            if(i>19 && (requestTime.get(i) - requestTime.get(i-20))<10){
                if(!droppedAlready.containsKey(requestTime.get(i))
                        || droppedAlready.get(requestTime.get(i))!=i){
                    droppedAlready.put(requestTime.get(i), i);
                    output++;
                    System.out.println(requestTime.get(i));
                }

            }

            if(i>59 && (requestTime.get(i) - requestTime.get(i-60))<60){
                if(!droppedAlready.containsKey(requestTime.get(i))
                        || droppedAlready.get(requestTime.get(i))!=i){
                    droppedAlready.put(requestTime.get(i), i);
                    output++;
                    System.out.println(requestTime.get(i));
                }

            }
        }


        return output;
    }

}
