//2) Вывести все простые числа от 1 до 1000


public class exercise2 {
    public static void main(String[] args){
        int[] array = new int[1000];
        for (int i = 2; i <= 1000 ; i++) {
            int count = 0;
            for (int j = 2; j < i ; j++) {
                if(i%j==0){
                    count+=1;
                }
            }
            if(count==0){
                System.out.println(i);
            }

        }
    }
}
