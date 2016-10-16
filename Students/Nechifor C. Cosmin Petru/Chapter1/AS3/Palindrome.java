package AS3;

/**
 * Created by p on 10/9/2016.
 */
public class Palindrome {
    private int numberOfDigits = 0;
    private int numberToBeChecked;
    private int biggestPalindrome = 0;
    public Palindrome(int numberOfDigits){
        this.numberOfDigits = numberOfDigits;
    }

    public void getPalindrome(){
        switch (numberOfDigits){
            case 3:
            {
                for(int i=999;i>=100;i--){
                    for(int j = 999; j>= 100; j--){
                        numberToBeChecked = i*j;
                        if(isPalindrom(numberToBeChecked)){
                            if(biggestPalindrome < numberToBeChecked){
                                biggestPalindrome = numberToBeChecked;
                            }
                            break;
                        }//end if
                    }//end for j
                }//edn for i
                System.out.println("The biggest palindrom is: " + biggestPalindrome);
                break;
            }//End case 3

            case 4:
            {
                for(int i=9999;i>=1000;i--){
                    for(int j = 9999; j>= 1000; j--){
                        numberToBeChecked = i*j;
                        if(checkPalindrom(numberToBeChecked)){
                            if(biggestPalindrome < numberToBeChecked){
                                biggestPalindrome = numberToBeChecked;
                            }
                            break;
                        }//end if
                    }//end for j
                }//edn for i
                System.out.println("The biggest palindrom is: " + biggestPalindrome);
                break;
            }


        }//end switch
    }//end getPalindrome

    private boolean isPalindrom(int i){
        int reverse = 0;
        int original;
        int number;

        original = i;

        while(i > 0){

            number = i % 10;
            reverse = reverse * 10;
            reverse += number;
            i = i / 10;
        }

        if(original == reverse ){
            return true;
        }

        return false;

    }

}

