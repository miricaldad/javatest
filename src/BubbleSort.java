import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {3,9,5,2,8,12,65,23,41};
        bubble(nums);
        choose(nums);
        quickSort(nums,0,nums.length-1);
        System.out.println("快速排序：");
        System.out.println(Arrays.toString(nums));
    }
    static void bubble(int a[]){
        int temp = 0;
        for(int i = 0; i < a.length-1;i++){
            for(int j = 0; j < a.length - i - 1;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("冒泡排序：");
        for (int i = 0; i < a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void quickSort(int a[],int startIndex,int endIndex){
        if(startIndex >= endIndex){
            return;
        }
        int pivotIndex = patition(a,startIndex,endIndex);
        quickSort(a,startIndex,pivotIndex-1);
        quickSort(a,pivotIndex+1,endIndex);

    }

    static int patition(int a[],int startIndex,int endIndex){
        int pivot = a[startIndex]; //设置基准元素
        int left = startIndex;//
        int right = endIndex;
        while (left != right){//
            while (left < right && a[right]>pivot){
                right--;//若右>基准点，右--

            }
            while (left < right && a[left] <= pivot){
                left++;//若左<基准点，左++
            }
            if(left < right){ //当a[left]>pivot||a[right]<pivot时，交换a[left]和a[rigth]
                int p = a[left];
                a[left] = a[right];
                a[right] = p;
            }

        }
        a[startIndex] = a[left];
        a[left] = pivot;
        return left;

    }
    
    static void choose(int a[]){
        int min = 0;  //记录最小值的索引
        //遍历 n-1 轮，最后一个数不用遍历比较
        for(int i = 0; i < a.length - 1; i++) {
            min = i;    //初始最小值为每轮循环的第一个数
            //遍历初始最小值后的所有数
            for(int j = i + 1; j < a.length; j++) {
                if(a[min] > a[j]) {    //判断是否存在比最小值小的数
                    min = j;        //记录下标
                }
            }
            if(min != i) {      //判断最小值的索引是否等于初始最小值的索引
                int temp = a[min];    //不是则进行最小值交换
                a[min] = a[i];
                a[i] = temp;
            }
        }
        System.out.println("选择排序：");
        for (int i = 0; i < a.length;i++){

            System.out.print(a[i]+" ");

        }
        System.out.println();
    }
}
