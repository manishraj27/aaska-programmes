import java.util.*;

public class Undisperable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); 
        
        while (--t>=0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i) {
                arr[i] = sc.nextInt(); 
            }
            
          
            int totalCount = 0;
            Map<Integer, Integer> elementFrequency = new HashMap<>();
            
            int leftIndex = 0;
            for (int rightIndex = 0; rightIndex < n; ++rightIndex) {
               
                elementFrequency.put(arr[rightIndex], elementFrequency.getOrDefault(arr[rightIndex], 0) + 1);
                
              
                while (elementFrequency.getOrDefault(1, 0) > 0 
                        && elementFrequency.getOrDefault(2, 0) > 0 
                        && elementFrequency.getOrDefault(3, 0) > 0) {
                    
                  
                    totalCount += n - rightIndex;
                    
                 
                    int leftElement = arr[leftIndex];
                    elementFrequency.put(leftElement, elementFrequency.get(leftElement) - 1);
                    
                 
                    if (elementFrequency.get(leftElement) == 0) {
                        elementFrequency.remove(leftElement);
                    }
                    
                   
                    leftIndex++;
                }
            }
            
            
            System.out.println(totalCount);
        }
    }
}
