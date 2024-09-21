package animal;

public class Testing {

    public static void main(String[] args) {

        int[] arrayInt = {1,2};

        for(int i = 0; i < arrayInt.length ; i++){
            System.out.println(arrayInt[i]);
        }

        for(int i: arrayInt){
            System.out.println(i);
        }
    }
}
