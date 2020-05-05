public class OneDimensionMain {
    public static void main(String[] args) {
        System.out.println("Create an array of size 10");
        OneDimension arr=new OneDimension(10);

        arr.insert(0,10);
        arr.insert(1,20);
        arr.insert(2,50);
        arr.insert(3,40);
        arr.insert(4,30);


        System.out.println("************");
        arr.access(1);

        arr.search(20);

        arr.delete(3);

        arr.traverseArray();
    }
}
