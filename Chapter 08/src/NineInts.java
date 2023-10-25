public class NineInts {
    public static void main (String args[]) {
        int numbers[] = {10, 15, 19, 23, 26, 29, 31, 34, 38};
        
        for(int i = 0 ; i < numbers.length; i++){
            //first to last
            System.out.print(numbers[i] + "\t");
        }

        System.out.println("");

        for(int i = numbers.length - 1; i >= 0; i--){
            //last to first
            System.out.print(numbers[i] + "\t");
        }
    }
}
