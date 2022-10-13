import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] sum = {1,4,7,3,5};
        System.out.println(func(sum.length, sum));

        List<Integer> array = new ArrayList<>(Arrays.asList(1,4,7,3,5));
        System.out.println(arFunc(array));
    }

    public static int func(int massiveLength,int[] sum){
        massiveLength -= 1;
        if(massiveLength < 0) return 0;
        return sum[massiveLength] + func(massiveLength,sum);
    }

    public static int arFunc(List array){
        if(array.size() == 0) return 0;
        int keks = (int) array.get(0);
        array.remove(0);
        return keks + arFunc(array);
    }
}
