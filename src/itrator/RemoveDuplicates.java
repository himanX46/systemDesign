package itrator;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("K1","V1");
        map.put("K2","V1");
        map.put("K3","V2");
        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
        boolean duplicate = false;

        while(it.hasNext()){
            Map.Entry<String,String> current = it.next();
            for(Map.Entry<String,String> entry: map.entrySet()){
                if(entry.getValue().equals(current.getValue())){
                    duplicate = true;
                    break;
                }
            }
            if(duplicate){
                it.remove();
            }
        }
    }
}
