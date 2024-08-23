import java.util.HashMap;
import java.util.HashSet;

class Solution {

    static int x=0, y=0;
    public void move(char c){
        if(c == 'L'){
            if(x>-5) x -= 1;
        }else if(c == 'R'){
            if(x<5) x += 1;
        }else if(c == 'U'){
            if(y<5) y += 1;
        }else if(c == 'D'){
            if(y>-5) y -= 1;
        }
    }

    public int solution(String dirs) {
        int answer = 0;

        HashSet<String> set = new HashSet<>();
        for(int i=0; i<dirs.length(); i++){
            int px = x;
            int py = y;
            move(dirs.charAt(i));
            String str = String.format("%s %s %s %s",px,py,x,y);
            String str2 = String.format("%s %s %s %s",x,y,px,py);
            if(!(px==x && py == y)){
                set.add(str);
                set.add(str2);    
            }
            
            System.out.println(String.format("str%d : %s / %s / %d",i+1,str,dirs.charAt(i),set.size()/2));
        }

        return set.size()/2;
    }
}
