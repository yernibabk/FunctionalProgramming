
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       // ArrayList<Integer> numberSet1 = Arrays.asList({1, 3, 6, 4, 9,7});
        
        int[] numberSet2 = {-1, -3};
        
        Arrays.asList(1, 3, 6, 4, 9,7);
        int[] numberSet3 = {1, 2, 3};
        System.out.println(findMissingKthPositive(Arrays.asList(1, 3, 6, 4, 9,7), 3));
        //System.out.println(calcularPrimero(numberSet2));
        //System.out.println(calcularPrimero(numberSet3));
    }
    
    public static int findMissingKthPositive(List<Integer> arr, int k)
    {
    	int c=0;
    	List<Integer> result = new ArrayList<Integer>();
    	while(result.size()<=k)
    	{
    		if(!arr.contains(c))
    			result.add(c);
    		c++;
    	}
    	return result.get(k);
    }
    
    
//    public static int findKthPositive8(int[] arr, int k) {
//        int n = arr.length;
//        
//        int l = 0, r = n - 1;
//        
//        while (l <= r) {
//            int mid = l + (r - l) / 2;
//            
//            if (arr[mid] - (mid + 1) < k) {
//                l = mid + 1;
//            } else {
//                r = mid - 1;
//            }
//        }
//        
//        return l + k;
//    }
//    
//    public static int findKthPositive(int[] arr, int k) {
//        int n = arr.length;
//        
//        int l = 0, r = n - 1;
//        
//        while (l <= r) {
//            int mid = l + (r - l) / 2;
//            
//            if (arr[mid] - (mid + 1) < k) {
//                l = mid + 1;
//            } else {
//                r = mid - 1;
//            }
//        }
//        
//        return l + k;
//    }
}	