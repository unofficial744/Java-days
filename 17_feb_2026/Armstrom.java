public class Armstrom {
    
    public static void main(String[] args) {
        int num = 1534;

        // 1*3 + 5*5 + 3*3 
        // 123 = 1*3 + 2*3 + 3*3

        int val = num;
        int sum = 0;
        int count  = 0;
        while (val>0) {
            int lastdigi = val % 10;
            sum = lastdigi;
            val /= 10;
        }
        System.out.println(count);
    }
}
