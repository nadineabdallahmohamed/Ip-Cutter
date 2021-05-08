package ip_cutter;

import java.util.*;

public class IP_Cutter{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        String name = myObj.nextLine();
        String[] result = name.split("[.]");
        int i;
        for(i=0;i<4;++i){
            System.out.println(result[i]); 
        }
          
    }
}
