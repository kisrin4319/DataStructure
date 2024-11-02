import java.util.Arrays;

public class BubbleSort {

    public void bubbleSort() {
        //bubble Sort
        int maxLength = 1000;

        int[] mockArr = new int[maxLength];

        for (int i = 0 ; i < mockArr.length; i++) {
            mockArr[i] = (int) (Math.random() * maxLength) +1;
        }

        int temp = 0;
        for (int i =0; i < mockArr.length; i++) {
            for (int j = 1; j<mockArr.length-i; j++) {
                if (mockArr[j-1] > mockArr[j]) {
                    temp = mockArr[j-1];
                    mockArr[j-1] = mockArr[j];
                    mockArr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(mockArr));
    }
}
