public class ProjectEuler {
    public static void main(String[] args) {
        long sum = 0;
        int num1 = 1;
        int num2 = 2;
        int num3 = 0;

        sum = num2;

        while(num2 < 4000000){
            num3 = num1+num2;

            if(num3%2 == 0){
                sum += num3;
            }


            num1 = num2;
            num2 = num3;

        }

        System.out.println("La suma es...");
        System.out.println(sum);
    }
}
