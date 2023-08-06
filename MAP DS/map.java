import java.util.*;


public class map {
public static void main(String[] args){
    int i=0;
    char y[] = {'s','a','y','a','k'};
    Map<Character,Integer> map = new HashMap<>();

    int size = y.length;
    while(i != size){
        if(map.containsKey(y[i]) == false){

            map.put(y[i],1);
        
        }
        else{
            int oldval = map.get(y[i]);
            int newval = oldval +1;
            map.put(y[i],newval);
        }
        
        i++;
    }
}    
}
