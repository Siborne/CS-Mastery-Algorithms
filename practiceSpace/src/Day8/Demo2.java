package Day8;

import java.util.*;
import java.io.*;

public class Demo2{
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream writer = new PrintStream(new BufferedOutputStream(System.out));
    
    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        UnionFind uf = new UnionFind(n);
        while(m-->0){
            st = new StringTokenizer(reader.readLine());
            String op = st.nextToken();
            if(op.equals("1")){
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                uf.union(x,y);
            }else if(op.equals("2")){
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                if(uf.find(x)==uf.find(y)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }

    public static class UnionFind{
        int[] parent;
        int[] size;

        public UnionFind(int n){
            parent = new int[n+1];
            size = new int[n+1];
            for(int i = 0;i<=n;i++){
                parent[i] = i;
                size[i] = 1;
            }
        }

        public int find(int x){
            if(parent[x] != x){
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public void union(int x,int y){
            int rootX = find(x);
            int rootY = find(y);
            if(rootX == rootY){
                return;
            }
            if(size[rootX] < size[rootY]){
                int temp = rootX;
                rootX = rootY;
                rootY = temp;
            }

            parent[rootY] = rootX;
            size[rootX] += size[rootY];
        }

        public int getSize(int x){
            int root = find(x);
            return size[root];
        }

    }

}