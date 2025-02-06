package dsa.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int count = 0;

//        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
//            count++;
//            for (int i = 0; i < lastUnsortedIndex; i++){
//                count++;
//                if(intArray[i] > intArray[i+1]){
//                    swap(intArray, i, i+1);
//                }
//            }
//        }

        for(int i=0; i< intArray.length; i++){
            for (int j = 0; j < intArray.length-i; j++) {
                if(intArray[j]>intArray[j+1]){
                    int temp = intArray[j];
                    intArray[j]=intArray[j+1];
                    intArray[j+1]=temp;
                }

            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j){
        if(i == j ){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
