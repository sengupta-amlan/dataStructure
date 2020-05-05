public class TwoDimension {
    int arr[][] = null;

    //instantiate
    public TwoDimension(int row, int column) {
        arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    //insert
    public void insert(int row, int column, int value) {
        try {
            if (arr[row][column] == Integer.MIN_VALUE) {
                arr[row][column] = value;
                System.out.println("The value " + value + " is added to the two dimensional array");
            } else {
                System.out.println("The space is already occupied");
            }
        } catch (Exception e) {
            System.out.println("The location is not available");
        }
    }

    //traverse
    public void traverse() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr[0].length); j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int rowLength() {
        return arr.length;
    }

    public int columnLength() {
        return (arr[0]).length;
    }

    //access
    public int access(int row, int column) {
        try {
            if (arr[row][column] == Integer.MIN_VALUE) {
                return -1;
            } else {
                return arr[row][column];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return Integer.MIN_VALUE;
        }
    }

    //search
    public void search(int value) {
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < ((arr[0]).length); j++) {
                    if (arr[i][j] == value) {
                        System.out.println("The value is found in the given array, at the position" + i + "," + j);
                        break;
                    }
                }
            }
            System.out.println("The value is not found");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index is not found");
        }
    }

    //delete
    public void delete(int row, int column) {
        try {
            if (arr[row][column] == Integer.MIN_VALUE) {
                System.out.println("No value is there to be deleted");
            } else {
                arr[row][column] = Integer.MIN_VALUE;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index is not available");
        }
    }

    public static int product(TwoDimension arr1, TwoDimension arr2) {
        int r1 = arr1.rowLength();
        int c1 = arr1.columnLength();
        int r2 = arr2.rowLength();
        int c2 = arr2.columnLength();

        if (c1 == r2) {
            int x=0;
            //TwoDimension arr3 = new TwoDimension(r1, c2);
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    x=0;
                    for(int k=0;k<r2;k++){
                        x+=arr1.access(i,k)*arr2.access(k,j);
                    }
                }
            }
            return x;
        }
        else{
            return -1;
        }
    }

}
