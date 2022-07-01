public class Faculty {

    public static int faculty(int num) {
        int result = 1;
        for (int i = 1; i <=num; i++) {
            result = (result * i);
        }
        return result;
    }

    public static int faculty2(int num) {

        int result = 1;
        int i = 1;


        while (i <= num){
            result = (result * i);
            i++;
        }

        System.out.println(result);

        return result;
    }
}
