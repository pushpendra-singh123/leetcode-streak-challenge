package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class RelativeSortArray_1122 {

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[arr1.length];
        int k = 0;
        for (var e: arr1){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for (int i = 0; i < arr2.length; i++) {
            int n = map.get(arr2[i]);
            while (n>0){
                arr[k] = arr2[i];
                k++;
                n--;
            }
        }
        ArrayList<Integer> arrl = new ArrayList<>();
        boolean b = true;
        for (int i = 0; i < arr1.length; i++) {
            b = true;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    b = false;
                    break;
                }
            }
            if (b){
                arrl.add(arr1[i]);
            }
        }
        Collections.sort(arrl);
        for (int e : arrl){
            arr[k] = e;
            k++;
        }
        return arr;
    }
}
