import java.util.Arrays;

public class InsertionSort {

    public void insertionSort() {

        int max_length = 1000;

        int[] mockArr = new int[max_length];

        for (int i = 0; i < max_length; i++) {
            mockArr[i] = (int) (Math.random() * max_length)+1;
        }

        for(int i = 1; i <mockArr.length; i++) {
            int temp = mockArr[i];
            int prev = i -1;

            while((prev >= 0) && (mockArr[prev] > temp)) {
                mockArr[prev+1] = mockArr[prev];
                prev--;
            }
            mockArr[prev+1] = temp;
        }
        System.out.println(Arrays.toString(mockArr));

    }
}
