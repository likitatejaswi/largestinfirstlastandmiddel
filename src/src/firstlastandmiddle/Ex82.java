package firstlastandmiddle;

public class Ex82 {
    public int first(int[] array){
        int max = -1;
        if(array[0] > array[(array.length-1)/2]){
             max = array[0];
        }else {
            max = array[(array.length-1)/2];
        }
        if (array[array.length-1] > max){
            max = array[array.length-1];
        }

        return max;
    }
}
