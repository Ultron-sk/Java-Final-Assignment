import java.util.Arrays;

public class Question6_Stream {
    public static void main(String[] args) {
        int [] arr={4,6,1,9,3,4,9,2,90,45,67,12,43,3,0,245,9,2,0,15,12,4};
        //sorting
        Arrays.stream(arr).sorted().forEach(n->System.out.print(n+" "));
        System.out.println();
        //filtering odd numbers out
        Arrays.stream(arr).filter(n->n%2==0).forEach(n->System.out.print(n+" "));
        System.out.println();
        //printing the sum
        int ans = Arrays.stream(arr).reduce(0,Integer::sum);
        System.out.println(ans);
    }

}
