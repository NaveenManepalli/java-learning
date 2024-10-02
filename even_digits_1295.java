// leet problem number (1295. Find Numbers With In Even Number Of Digits)

public  class even_digits_1295 {

    public static void main(String[]args){

        int[] nums={12,3452,548620,-142,9,3,654,};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int []nums){
        int count =0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
     static boolean even(int num){
        int numberofDigits = digits(num);
        return numberofDigits % 2 == 0;
     }

    static int digits(int num){
        if (num<0){

            num = num * -1;
        }

        if (num == 0){
            return 1;
        }

        int count=0;


        while (num>0){
            count++;
            num = num/10;
        }
        return count;
//        return (int)(Math.log10(num))+1;
    }

}
