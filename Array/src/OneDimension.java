public class OneDimension {
   int arr[]=null;

   //generate
    public OneDimension(int sizeOfArr){
        arr=new int[sizeOfArr];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }

    //print an array
    public void traverseArray(){
        try{
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]+" ");
            }
        }
        catch (Exception e){
            System.out.println("array does not exist");
        }
    }

    //insert in an array
    public void insert(int location,int value){
        try{
            if(arr[location]==Integer.MIN_VALUE){
                arr[location]=value;
                System.out.println("Succesfully inserted");
            }
            else{
                System.out.println("Cell already occupied");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
    }

    //access
    public void access(int location){
        try{
            if(arr[location]!=Integer.MIN_VALUE){
                System.out.println(arr[location]);
            }
            else{
                System.out.println("No value available");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index accessed");
        }
    }

    //delete , given the cell index
    public void delete(int location){
        try{
            if(arr[location]!=Integer.MIN_VALUE){
                arr[location]=Integer.MIN_VALUE;
            }
            else{
                System.out.println("Already empty");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index accessed");
        }
    }

    //search, return the index
    public void search(int value){
        try{
            for(int i=0;i<arr.length;i++){
                if(arr[i]==value){
                    System.out.println("The value :"+value+" is located at index: "+i);
                }
                else{
                    System.out.println("The value is not found in the array");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index is accessed");
        }
    }
}
