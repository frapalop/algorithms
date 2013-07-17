/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frapalop
 */
public class QuickSortP {
        private Integer[] numbers;
        private int number;
        private long comparisons = 0;

  public void sort(Integer[] values) {
    // Check for empty or null array BASE CASE
    if (values ==null || values.length==0 ) {
      return;
    }
    this.numbers = values;
    number = values.length;
    //take up leftmost pivot
    quicksort_right(0, number - 1);
  }

  private void quicksort_left(int low, int high) {
    int i = low; int j;
    //comparisons=comparisons+(high-low-1);
    // Get the pivot element from the middle of the list
    
    if (low < high) {
        
        int pivot = numbers[low];
        
        
        for (j=low+1;j<=high;j++){ //invariant [[p][p<][p>]]

            if (pivot < numbers[j]){

                //comparisons++;


            } else if (pivot > numbers[j]){

                exchange(i+1,j);//i denotes the limit of the p<, so to swap we need to move it to the leftmost item
                i++;
                //comparisons++;

            }
            comparisons++;
        }
        
        exchange(low,i); //We are done, j has reached its max value, just move pivot into position
        // Recursion
        quicksort_left(low, i-1);
        quicksort_left(i+1,high);
        }
  }

   private void quicksort_right(int low, int high) {
    int i = high; int j;
    // Get the pivot element from the middle of the list
    
    if (low < high) {
        
        int pivot = numbers[high];
        
        
        for (j=high-1;j>=low;j--){ //invariant [[p<][p>][p]]

            if (pivot > numbers[j]){


            } else if (pivot < numbers[j]){

                exchange(i-1,j);//i denotes the limit of the p<, so to swap we need to move it to the leftmost item
                i--;

            }
           comparisons++; 
        }
        
        exchange(i,high); //We are done, j has reached low, just move pivot into position
        // Recursion
        //comparisons=comparisons+((i-1)-(low-1));
        quicksort_right(low, i-1);
        //comparisons=comparisons+(high-(i));
        quicksort_right(i+1,high);
        }
  }
   
   
private void quicksort_median(int low, int high) {
    int i = high; int j;
    // Get the pivot element from the middle of the list
    
    if (low < high) {
        
        int pivot = numbers[high];
        
        
        for (j=high-1;j>=low;j--){ //invariant [[p<][p>][p]]

            if (pivot > numbers[j]){

                //comparisons++;


            } else if (pivot < numbers[j]){

                exchange(i-1,j);//i denotes the limit of the p<, so to swap we need to move it to the leftmost item
                i--;
                //comparisons++;

            }
            comparisons++;
        }
        
        exchange(i,high); //We are done, j has reached low, just move pivot into position
        // Recursion
        quicksort_right(low, i-1);
        quicksort_right(i+1,high);
        }
  }
      
      
  private void exchange(int i, int j) {
    int temp = numbers[i];
    numbers[i] = numbers[j];
    numbers[j] = temp;
  }
  public float getcomparisons(){
      
      return comparisons;
}
    
}
