// given a route containing 4 directions(E, W, N, S), find the shortest path to reach destination.

public class shortestpath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";

        int x = 0;
        int y = 0;

        for(int i =0; i<path.length();i++){
            char dir = path.charAt(i);

            if(dir == 'N'){
                y++;
            }else if (dir == 'S'){
                y--;
            }else if(dir == 'E'){
                x++;
            }else{
                x--;
            }
        }
        double shortest = Math.sqrt(x*x + y*y);
        System.out.println(shortest);
    }
}
