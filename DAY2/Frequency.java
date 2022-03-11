package DAY2;

public class Frequency {
    public static void frequency(String input){
        int count[] = new int [26] , index = 0;
        String  str = "";
        int temp;
        while(index < input.length()){
            if(input.charAt(index) != ' '){
                temp = (int) input.charAt(index) - 97;
//                System.out.println(input.charAt(index)+" "+temp);
                count[ temp ]++ ;
            }
            index++;
        }
        index = 0;
        while(index < 26){
            if(count[index] != 0)
            {
                System.out.println((char) (index + 97) + " -> " + count[index]);
            }
            index++;
        }
//        return str;
    }
}
