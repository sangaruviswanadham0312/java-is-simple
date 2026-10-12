package arrays;
public class ArrysDemo {
    static int[] ages;
    public static void main(String[] args) {
        ages = new int[10];
        ages[0] = 21;
        ages[1] = 22;
        ages[2] = 23;
        ages[3] = 24;
        ages[4] = 25;
        ages[5] = 21;
        ages[6] = 22;
        ages[7] = 26;
        ages[8] = 29;
        ages[9] = 27;
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        	
        }
    }
}


