package animal;

public class Books {
    public static void main(String[] args) {

        String[] names = {"Tanka", "Enock", "Ruda"};
        Books books = new Books();
//        System.out.println(names[1]);

        books.displayNames(names);
    }

    public void displayNames(String[] names){
        System.out.println(names);
    }
}
