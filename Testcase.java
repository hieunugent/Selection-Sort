import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class Testcase{
  @Test
  public void Testcase1(){
    int [] expected = {1, 2, 3, 4, 5, 6, 7,8};
    int [] input = {8, 7, 6, 5, 4 ,3, 2, 1};
    assertTrue(compare(Solution.selectionSort(input), expected));
  }
  public boolean compare(int[] arr1 , int[] arr2){
      if(arr1.length != arr2.length){
        return false;
      }
      for(int i = 0 ; i < arr1.length; i++){
        if(arr1[i] != arr2[i]){
          return false;
        }
      }
      return true;
    }
}
