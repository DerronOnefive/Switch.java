import java.util.Random;

public class Switch {
    public static void main(String[] args){

        Random random = new Random();
        int min = 65;
        int max = 122;
        int randNo = min + random.nextInt((max - min) + 1);
        char c = (char) randNo;

        switch (Character.toLowerCase(c)){
            case 'a':
                System.out.println("The alphabet '"+ c +"' is in the first four letters");
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The alphabet '"+ c +"' is a vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
                System.out.println("The alphabet '"+ c +"' is in the first four letters");
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println("The alphabet '"+ c +"' is a consonant");
                break;
            default:
                System.out.println("The alphabet '"+ c +"' is not an alphabet character");
        }

    }
 }
