/*  2.Посмотрите на код и подумайте сколько разных типов исключений вы тут сможете получить?
 */
public class Sem_2_DZ_2 {
    public static void main(String[] args) {
        String[][] arr = null; //{{"1", "2", "3"}, {"1", "2", "3"}, {"1", "2", "S3"}};
        System.out.println(sum2d(arr));
    }
    public static int sum2d(String[][] arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
