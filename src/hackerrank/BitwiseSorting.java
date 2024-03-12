package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BitwiseSorting {

    public static void main(String[] args) {
        BitwiseSorting bs = new BitwiseSorting();

        List<Integer> input = IntStream.range(1, 17).boxed().toList();
        System.out.println(input);

        for (Integer i: input) {
            bs.Insert(i);
        }

        System.out.println(bs.nodes.stream().map(x -> x.value).toList());
        System.out.println(bs.nodes.stream().map(x -> x.bits).toList());
    }

    List<Node> nodes = new ArrayList<>();
    public void Insert(Integer value) {
        var bits = calculateBits(value);
        if(nodes.size() == 0) {
            nodes.add(new Node(value, bits));
            return;
        }

        for (int i=0; i<nodes.size();i++){
            if(nodes.get(i).bits() > bits) {
                continue;
            }
            else if(nodes.get(i).bits().equals(bits)){
                if (nodes.get(i).value() > value) {
                    continue;
                }
                else {
                    nodes.add(i, new Node(value, bits));
                    break;
                }
            } else {
                nodes.add(i, new Node(value, bits));
                break;
            }
        }
    }

    public Integer calculateBits(Integer value){
        System.out.printf("%d\t", value);
        int bits = 0;
        while (value > 0) {
            if(value % 2 == 1) {
                bits++;
            }
            value = value / 2;
        }
        System.out.println(bits);
        return bits;
    }

    private record Node(Integer value, Integer bits) {

    }
}
