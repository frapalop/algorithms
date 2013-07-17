/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author frapalop
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 * Then , it should be sorting an array, by Split and merge methodology.
 *  1) it will split an array into 2
 *  2) It will sortout the 2 arrays into 1 
 *      A,B input sorted  Array
 *      C output array
 *      i=1;j=1;
 *      for k=1 to n
 *          if A(i) < B(i)
 *              C(k) = A(i)
 *              i++
 *          else (B(j)<A(i))
 *              C(k) = B(j)
 *              j++
 *           end (ignores end cases)
 * 
 */
public class algo{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        System.out.println("Lets do some merge sort"); 
        //create an object MergeSort
        //MergeSort a = new MergeSort();//display the string
        //MergeSortP a = new MergeSortP();
        QuickSortP a = new QuickSortP();
        //fake a basic test
       // int[] anIntArray = {0,1,2,3,4,5,6,7,8,9};
        
        //Test file ordering
        
        File int_input;
        //int_input = new File("C:/Users/frapalop/Documents/Perso/Algo1/IntegerArray.txt");
	//        int_input = new File("C:/Users/frapalop/Documents/Perso/Algo1/QuickSort.txt");
        //int_input = new File("C:/Users/frapalop/Documents/Perso/Algo1/file_tst_small.txt");
        
        
//        LineNumberReader  lnr = new LineNumberReader(new FileReader(int_input));
//        long size = lnr.skip(Long.MAX_VALUE);
//        System.out.println("The size of the file is: " + lnr.getLineNumber());
//           
//       Scanner scanner = new Scanner(int_input);
//      
//        int i = 0;
//        List<Integer> list = new ArrayList<>();
//        Integer[] anIntArray;
//        
//        while (scanner.hasNext() ) {
//    
//            list.add(scanner.nextInt());
//         }
//       anIntArray = (Integer[])list.toArray(new Integer[list.size()]);
        

//          Integer[] anIntArray={8, 2, 6, 10, 5, 4, 1, 3, 9, 7};
//         Integer[] anIntArray={1, 11, 5, 15, 2, 12, 9, 99, 77, 0};
            Integer[] anIntArray={2, 8, 9, 3, 7, 5, 10, 1, 6, 4};
//            Integer[] anIntArray={1,2,3,4,5,6,7,8,9,10};
//            Integer[] anIntArray={10,9,8,7,6,5,4,3,2,1};
          System.out.println("The size of the array is: " + anIntArray.length);
 

        
        
       //List the thing
//               for (int k = 0; k < anIntArray.length; k++) {
//               System.out.println("This is position "+ k + " value: " + anIntArray[k]);
//              }
//       for (int i2 = 0 ; i2 < anIntArray.length ; i2++)
//       {
//           System.out.println("This is position "+ i2 + " value: " + anIntArray[i2]);
//       }
    System.out.println("-------------Unsorted array-----------------");
   
//   
//        //top
//       System.out.println("-------------Top-----------------");
//        System.out.println("This is position "+ 0 + " value: " + anIntArray[0]);
//       System.out.println("This is position "+ 1 + " value: " + anIntArray[1]);
//       System.out.println("This is position "+ 2 + " value: " + anIntArray[2]);
//       System.out.println("This is position "+ 3 + " value: " + anIntArray[3]);
//       System.out.println("This is position "+ 4 + " value: " + anIntArray[4]);
//       //middle
//      System.out.println("-------------Middle-----------------");
//       System.out.println("This is position "+ ((anIntArray.length/2)-6) + " value: " + anIntArray[(((anIntArray.length/2)-6))]);
//       System.out.println("This is position "+ ((anIntArray.length/2)-5) + " value: " + anIntArray[((anIntArray.length/2)-5)]);
//       System.out.println("This is position "+ ((anIntArray.length/2)-4) + " value: " + anIntArray[((anIntArray.length/2)-4)]);
//       System.out.println("This is position "+ ((anIntArray.length/2)-3) + " value: " + anIntArray[((anIntArray.length/2)-3)]);
//       System.out.println("This is position "+ ((anIntArray.length/2)-2) + " value: " + anIntArray[((anIntArray.length/2)-2)]);
//       System.out.println("This is position last value: " + anIntArray[anIntArray.length/2-1]);
//       //bottom
//       System.out.println("-------------Bottom-----------------");
//       System.out.println("This is position "+ (anIntArray.length-6) + " value: " + anIntArray[(anIntArray.length-6)]);
//       System.out.println("This is position "+ (anIntArray.length-5) + " value: " + anIntArray[(anIntArray.length-5)]);
//       System.out.println("This is position "+ (anIntArray.length-4) + " value: " + anIntArray[(anIntArray.length-4)]);
//       System.out.println("This is position "+ (anIntArray.length-3) + " value: " + anIntArray[(anIntArray.length-3)]);
//       System.out.println("This is position "+ (anIntArray.length-2) + " value: " + anIntArray[(anIntArray.length-2)]);
//       System.out.println("This is position last value: " + anIntArray[anIntArray.length-1]);
//           
//       for (i = 0; i < anIntArray.length; i++) {
//        System.out.println("This is position "+ i + " value: " + anIntArray[i]);
//       }
//       
        
        a.sort(anIntArray);

        System.out.println("Now in sorted order");
// 
//       for (int kk = 0; kk < anIntArray.length; kk++) {
//        System.out.println("This is position "+ kk + " value: " + anIntArray[kk]);
//       }
//        
//       System.out.println("Now in sorted order");
//       for (int i2 = 0 ; i2 < anIntArray.length ; i2++)
//       {
//           System.out.println("This is position "+ i2 + " value: " + anIntArray[i2]);
//       }
//       System.out.println("-------------Sorted array-----------------");
//       System.out.println("-------------Top-----------------");
//        System.out.println("This is position "+ 0 + " value: " + anIntArray[0]);
//       System.out.println("This is position "+ 1 + " value: " + anIntArray[1]);
//       System.out.println("This is position "+ 2 + " value: " + anIntArray[2]);
//       System.out.println("This is position "+ 3 + " value: " + anIntArray[3]);
//       System.out.println("This is position "+ 4 + " value: " + anIntArray[4]);
//       //middle
//       System.out.println("-------------Middle-----------------");
//       System.out.println("This is position "+ ((anIntArray.length/2)-6) + " value: " + anIntArray[(((anIntArray.length/2)-6))]);
//       System.out.println("This is position "+ ((anIntArray.length/2)-5) + " value: " + anIntArray[((anIntArray.length/2)-5)]);
//       System.out.println("This is position "+ ((anIntArray.length/2)-4) + " value: " + anIntArray[((anIntArray.length/2)-4)]);
//       System.out.println("This is position "+ ((anIntArray.length/2)-3) + " value: " + anIntArray[((anIntArray.length/2)-3)]);
//       System.out.println("This is position "+ ((anIntArray.length/2)-2) + " value: " + anIntArray[((anIntArray.length/2)-2)]);
//       System.out.println("This is position last value: " + anIntArray[anIntArray.length/2-1]);
//       //bottom
//       System.out.println("-------------Bottom-----------------");
//       System.out.println("This is position "+ (anIntArray.length-6) + " value: " + anIntArray[(anIntArray.length-6)]);
//       System.out.println("This is position "+ (anIntArray.length-5) + " value: " + anIntArray[(anIntArray.length-5)]);
//       System.out.println("This is position "+ (anIntArray.length-4) + " value: " + anIntArray[(anIntArray.length-4)]);
//       System.out.println("This is position "+ (anIntArray.length-3) + " value: " + anIntArray[(anIntArray.length-3)]);
//       System.out.println("This is position "+ (anIntArray.length-2) + " value: " + anIntArray[(anIntArray.length-2)]);
//       System.out.println("This is position last value: " + anIntArray[anIntArray.length-1]);
      System.out.println("QuickSort, we have done: " + a.getcomparisons() + " comparisons");
       
       
    }
}
