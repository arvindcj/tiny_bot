package algo;

public class Common {

    public static Common common = null;

    private Common(){}

    public static Common getInstance() {
        if(common == null)
          common = new Common();
        return common;
    }

    public void print_array(Integer[] array, String array_content){
      System.out.println("Printing the array :" + array_content);
      for(int i=0; i < array.length; i++)
          System.out.println(array[i]);
    }
}
