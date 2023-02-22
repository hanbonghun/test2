import java.util.*;

public class Main {
    static int[] dx = {1,0,1};
    static int[] dy = {0,1,1};
    static boolean[][] visited;
    static int answer= 0 ;

    public static void main(String[] args) {
        int d= 5;
        int k =1 ;
        Queue<int[]> q = new LinkedList<>();
        visited = new boolean[d+1][d+1];
        visited[0][0] = true;  //시작점
        q.add(new int[] {0,0}) ;

        while(!q.isEmpty()){
            int[]p =q.poll();
            answer++;
            for(int i=0; i<3; i++){
                int nx = p[0]+k*dx[i];
                int ny = p[1]+k*dy[i];

                if( nx>d || ny>d||visited[nx][ny] || dist(nx,ny)>d) continue;
                visited[nx][ny]= true;
                q.add(new int[]{nx,ny});
            }
        }

        System.out.println(answer);

    }
    static double dist(int x, int y){
        return Math.sqrt(x*x+y*y);
    }

}

