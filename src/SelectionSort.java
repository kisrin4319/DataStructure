import java.util.Arrays;

public class SelectionSort {

    public void selectionSort() {

        int indexMin , temp;

        int max_length = 1000;

        int[] mockArray = new int[max_length];

        for (int i = 0; i < max_length; i++) {
            mockArray[i] = (int)(Math.random()*max_length)+1;
        }

        for (int i = 0; i<mockArray.length; i++) {
            indexMin = i;

            for (int j = i+1; j < mockArray.length; j++) {
                if (mockArray[j] < mockArray[indexMin]) {
                    indexMin = j;
                }
            }
            temp = mockArray[indexMin];
            mockArray[indexMin] = mockArray[i];
            mockArray[i] = temp;
        }
        System.out.println(Arrays.toString(mockArray));
    }
}
