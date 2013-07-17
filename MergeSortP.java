/*
 * To change this template, choose Tools | Templates
 * and open the template in the
 * editor.
 */


/**
 *
 * @author frapalop
 */
public class MergeSortP {
 
    private Integer[] numbers, helper;
  //  private int[] helper;
    private int number;
    protected long switches= 0;
 
    
 public void sort(Integer[] values) {
    this.numbers = values;
    number = values.length;
    this.helper = new Integer[number];
    mergesort(0, number - 1);
    
}

    private void mergesort(int low, int high) {
      // Check if low is smaller than high, if not then the array is sorted
    if (low < high) {
      // Get the index of the element which is in the middle
      int middle = low + (high - low) / 2;
      // Sort the left side of the array
      mergesort(low, middle);
      // Sort the right side of the array
      mergesort(middle + 1, high);
      // Combine them both
      merge(low, middle, high);
    }
        
       
    }

    private void merge(int low, int middle, int high) {
        // Copy both parts into the helper array
        int k = low;
        int i=low;
        int j=middle + 1;
        for (int z = low; z <= high; z++) {
          helper[z] = numbers[z];
        }       
      
        
        while (i <= middle && j <= high) {
            if (helper[i] < helper[j]) {
            numbers[k] = helper[i];
            i++;
            } else if (helper[i] > helper[j]) {
                switches=switches + (middle - i + 1) ;
                numbers[k] = helper[j];
                j++;
        
            }
          k++;
        }
        
            while (i <= middle) { //copy the left of the array into the general
            numbers[k] = helper[i];
            k++;
            i++;
        }
        
        
        
        
//         System.out.println("This is numbers after sort: ");
//        for (i = 0; i <  numbers.length; i++) {
//        System.out.println("This is position "+ i + " value: " + numbers[i]);
//       }
        
        
        
  }

}
