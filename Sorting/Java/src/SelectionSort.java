import java.util.HashMap;
import java.util.LinkedHashMap;

public class SelectionSort {

    public int[] sort(int nums[]) {
        int n = nums.length;

        // One by one move boundary of unsorted subnumsay
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted numsay
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (nums[min_idx]>nums[j])
                    min_idx = j;
            }
            // Swap the found minimum element with the first
            // element
            int temp = nums[min_idx];
            nums[min_idx] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }

    //
    public int[] sortMod(int nums[]) {
        int n = nums.length, indexBack = nums.length-1;
        int [] sortnumsay = new int[n];

        LinkedHashMap<Integer,Integer> x = new LinkedHashMap<Integer,Integer>();
        System.out.println();
        // One by one move boundary of unsorted subnumsay
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted numsay
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (nums[min_idx]>nums[j])
                    min_idx = j;
            }
            // Swap the found minimum element with the first
            // element
            int temp = nums[min_idx];
            nums[min_idx] = nums[i];
//            nums[i] = temp;
            System.out.println(temp);
            if(!x.containsKey(temp)){
                x.put(temp,1);
            }else{
                int y = x.get(temp);
                x.replace(temp,y,++y);
            }
        }
        int t = nums[nums.length-1];
        if(!x.containsKey(t)){
            x.put(t,1);
        }else{
            int y = x.get(t);
            x.replace(t,y,++y);
        }

        int index = 0;
        for (Integer key: x.keySet()) {
            int numOFTimes = x.get(key);
            if(numOFTimes==1){
                sortnumsay[index] = key;
            }else{
                for (int i = 0; i < numOFTimes; i++) {
                    if(i==0)sortnumsay[index] = key;
                    else{
                        sortnumsay[indexBack] = key;
                        indexBack--;
                    }
                }
            }
            index++;
        }
        System.out.println(index);
        return sortnumsay;
    }
}
