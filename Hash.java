import java.util.*;
import java.util.Scanner;

public class Hash {
    public int randomInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static int[] addX(int n, int arr[], int x)
    {
        int i;
        int newarr[] = new int[n + 1];
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];
  
        newarr[n] = x;
  
        return newarr;
    } 
    public static void main(String[] args)
    {
 
        // Creating an empty HashMap
        HashMap<Integer, Integer> hash_map = new HashMap<Integer, Integer>();
        // Mapping string values to int keys
        hash_map.put(0, 1);
        hash_map.put(1, 3);
        hash_map.put(2, 5);
        hash_map.put(3, 7);
        hash_map.put(4, 9);
        hash_map.put(5, 11);
        // Displaying the HashMap
        System.out.println("Hash map before insertion");
        System.out.println(hash_map);
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value to add: ");
        int value = scan.nextInt();
        System.out.println("Hash map after adding " + value);
        int[] test={1,3,5,7,9,11};
        Hash hash = new Hash();
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        test=hash.addX(6,test,value);
        Arrays.sort(test);
        for (int i=0;i<7;i++){
            map2.put(i, test[i]);
        }
        System.out.println(map2);
        Iterator<Map.Entry<Integer, Integer> >
            iterator = map2.entrySet().iterator();

        System.out.println("Hash map Before Swapping");
        System.out.println(map2);
        System.out.println("Hash map After Swapping");
        
        while (iterator.hasNext())
        {
            Map.Entry<Integer, Integer>
                entry
                = iterator.next();
            if (entry.getKey()==2) {
                entry.setValue(11);
            }
            if (entry.getKey()==6) {
                entry.setValue(3);
            }
        }
        System.out.println(map2);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 1; i <= 500; i++) {
            map.put(i,hash.randomInt(1000,9999));
        }
        int randomValue = hash.randomInt(1000,9999);
        System.out.println(randomValue);
        Iterator<Map.Entry<Integer, Integer> >
            iterator2 = map.entrySet().iterator();
        boolean found=false;
        while (iterator2.hasNext())
        {
            Map.Entry<Integer, Integer>
                entry2
                = iterator2.next();
            if (entry2.getValue()==randomValue) {
                System.out.println("Element found in the Hash map at "+entry2.getKey());
                found=true;
            }
        }
        if (found==false){
            System.out.println("Element not found in the Hash map");
        }

        scan.close();
    }
}
        