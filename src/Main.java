public class Main {
    public static void main(String[] args) {


//    static double ortochoSan(int a, int b, int c) {
//        return (a + b + c) / 3;
       int[] array={4,5,9,3} ;
        System.out.println(kichineSan(array));


    }

    static int kichineSan(int[] array){
       int min = 0;
       for (int i =0;i<array.length;i++){
           if(array[i]<min);
           min = array[i];
          }

return min;
    }
}