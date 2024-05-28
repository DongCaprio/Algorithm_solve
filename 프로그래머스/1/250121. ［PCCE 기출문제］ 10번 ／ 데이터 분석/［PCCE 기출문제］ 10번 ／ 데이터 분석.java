import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> list = new ArrayList<>();
        String[] strArr = {"code", "date", "maximum", "remain"};
        int extCode =0, sortByCode=0;
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].equals(ext)){
                extCode = i;
            }
            if(strArr[i].equals(sort_by)){
                sortByCode = i;
            }
        }
        for(int i=0; i<data.length; i++){
            if(data[i][extCode]<val_ext) {
                list.add(data[i]);
            }
        }
        int finalSortByCode = sortByCode;
        Collections.sort(list,(o1, o2)->o1[finalSortByCode]-o2[finalSortByCode]);


        return list;
    }
}