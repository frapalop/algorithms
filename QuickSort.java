/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Inspiration from http://www.vogella.com/articles/JavaAlgorithmsQuicksort/article.html
 */
public class QuickSort {
        private Integer[] numbers;
        private int number;
        private long comparisons = 0;

  public void sort(Integer[] values) {
    // Check for empty or null array
    if (values ==null || values.length==0){
      return;
    }
    this.numbers = values;
    number = values.length;
    //take up median pivot
    quicksort_med(0, number - 1);
  }

  private void quicksort_med(int low, int high) {
    int i = low, j = high;
    // Get the pivot element from the middle of the list
    int pivot = numbers[low + (high-low)/2];

    // Divide into two lists
    while (i <= j) {
      // If the current value from the left list is smaller then the pivot
      // element then get the next element from the left list
      while (numbers[i] < pivot) {
        i++;
        comparisons++;
      }
      // If the current value from the right list is larger then the pivot
      // element then get the next element from the right list
      while (numbers[j] > pivot) {
        j--;
        comparisons++;
      }

      // If we have found a values in the left list which is larger then
      // the pivot element and if we have found a value in the right list
      // which is smaller then the pivot element then we exchange the
      // values.
      // As we are done we can increase i and j
      if (i <= j) {
        exchange(i, j);
        i++;
        j--;
        
        
      }
    }
    // Recursion
    if (low < j) {
          quicksort_med(low, j);
      }
    if (i < high) {
          quicksort_med(i, high);
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
