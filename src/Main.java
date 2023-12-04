import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            String str = null;
            System.out.println(str.length());
            
        } catch (NullPointerException e){
            System.out.println("NullPointerException:値が設定されていません");
            System.out.println(e.getMessage());
        }
    }
}