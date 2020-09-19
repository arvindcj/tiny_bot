package algo.sort;

import algo.Common;
// import org.apache.log4j.Logger;
//  import org.apache.log4j.BasicConfigurator;

public class InsertionSort {

    Integer[] array;
    //static Logger logger = Logger.getLogger(InsertionSort.class);

    public InsertionSort(Integer[] a) {
      //BasicConfigurator.configure();
      Common.getInstance();
      array = a;
    }

    public Integer[] sort() {
        for(int i=1; i < array.length; i++)
          insert(i);
        return array;
    }

    private void insert(int position){
        int index = position - 1;
        int value = array[position];
        while((index >= 0) && (array[index] > value)) {
          array[index+1] = array[index];
          index -= 1;
        }
        array[index] = value;
    }
}
