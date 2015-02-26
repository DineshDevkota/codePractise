
/**
 * Created by dineshdevkota on 2/25/15.
 *
 */
public class delectdups {

    public static void main(String []args){

        String test ="hello the world is hell0!!!!";
        char [] testarray=test.toCharArray();
        for(char a:testarray){
            System.out.print(a);
        }
        int current=0;

        System.out.println();

        while(current<test.length()){
            int runner=0;
            while(current!= runner){
                if(testarray[current]==testarray[runner]){
                    testarray[current]='*';

                }
                runner++;
            }
            if (test.charAt(runner)==test.charAt(runner)){
                current++;
            }

        }

        for(char a:testarray){
            System.out.print(a);
        }

    }

}

