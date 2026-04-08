public class Palindrome {

    public static void main(String[] args) {

        int num = 121, reversed = 0, remainder, original;

        original = num;

        while(num != 0){
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }

        if(original == reversed)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome");
    }
}
