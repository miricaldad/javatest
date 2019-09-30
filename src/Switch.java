import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int code = 75;
        String grade;
        switch (code/10){
            case 9: grade = "优";
                break;
            case 8:grade  = "良好";
                break;
            case 7:
            case 6:grade  = "中";
                break;
            default:grade  = "差";

        }
        System.out.println(grade);
    }
}
