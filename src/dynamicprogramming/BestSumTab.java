package dynamicprogramming;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BestSumTab {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bestSum(8,new int[]{2,3,5})));
    }

    public static int [] bestSum(int target, int []arr){
        // create an array of lenght target sum and fill it with null values

        if(target==0 )
            return null;
        List<List<Integer>> table = new ArrayList<List<Integer>>();
        List<Integer>lst = new ArrayList<>();
        table.add(lst);
        for(int i=1;i<=target; i++){
            table.add(null);
        }
        for(int i=0;i <=target; i++){
            if(table.get(i) != null){
               for(int num:arr){
                   int ndx = i +num;
                   if(ndx > target)
                       continue;
                   lst= table.get(ndx);
                  if(lst == null)
                      lst = new ArrayList<>();
                  // copy all elements from table i to ndx
                   List<Integer> src = table.get(i);
                   List<Integer> dst = table.get(ndx);
                   dst = new ArrayList<>();
                   dst.addAll(src);
                   // add num
                   dst.add(num);
                   if(table.get(ndx) == null || dst.size() < table.get(ndx).size() ){
                       table.remove(ndx);
                       table.add(ndx,dst);
                   }

               }
            }
        }
  return table.get(target).stream().mapToInt(x -> x).toArray();

    }

    public List<Integer> getElements(List<List<Integer>> table, int pos, int num){
      table.get(pos).add(num);
        return table.get(pos);
    }
}
