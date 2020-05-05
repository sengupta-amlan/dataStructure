import java.awt.*;

public class TwoDimensionMain {
    public static void main(String[] args) {
        TwoDimension arr1=new TwoDimension(2,2);
        TwoDimension arr2=new TwoDimension(2,2);
        arr1.insert(0,0,1);
        arr1.insert(0,1,2);
        arr1.insert(1,0,3);
        arr1.insert(1,1,4);

        arr2.insert(0,0,4);
        arr2.insert(0,1,3);
        arr2.insert(1,0,2);
        arr2.insert(1,1,1);
        TwoDimension result=new TwoDimension(2,2);
        result.product(arr1,arr2);
        result.traverse();
    }




}
