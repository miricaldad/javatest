public class SumArray {


    public static void main(String[] args) {
        int array1[] = {1,2,3,4,5};
        int array2[] = {6,8};
        int newArray[] = new int [array1.length+array2.length];
        for(int i = 0 ;i < newArray.length;i++){
            if (i<array1.length){
                newArray[i] = array1[i];
            }
            if (i>=array1.length){
                newArray[i] =array2[i-array1.length];
            }
        }
        for (int i = 0 ;i < newArray.length;i++){
            System.out.println(newArray[i]);
        }
    }
}
