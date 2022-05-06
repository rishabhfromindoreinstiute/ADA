/*import java.util.Scanner;

class prims {
    public int minKey(int key[],boolean mstSet[],int V){
        int min=100000;
        int min_index=0;
        for(int v=0;v<V;v++){
            if(mstSet[v]==false && key[min]<min){
               min=key[v];
               min_index=v;
            }
        }
        return min_index;
    }
    public void printMST(int parent[],int graph[][],int V){
        System.out.println("Edge weight:");
        for(int v=1;v<V;v++){
           System.out.println(parent[v]+" "+v+" "+graph[v][parent[v]]);
        }
    }
    public void primMST(int graph[][],int V){
        int parent[]=new int[V];
        int key[]=new int[V];
        boolean mstSet[]=new boolean[V];
        for(int i=0;i<V;i++){
            key[i]=100000;
            mstSet[i]=false;
        }
        key[0]=0;
        parent[0]=-1;
        for(int count=0;count<V-1;count++){
            int u=minKey(key,mstSet,V);
            mstSet[u]=true;
            for(int v=0;v<V;v++){
                if(graph[u][v]!=0 && mstSet[v]==false &&graph[u][v]<key[v]){
                    parent[v]=u;
                    key[v]=graph[u][v];
                }
            }
        }
        printMST(parent,graph,V);
    }
    public static void main(String args[]){
        prims p=new prims();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of vertex:");
        int V=sc.nextInt();
        System.out.println("Enter the edge vertex to vertex");
        int graph[][]=new int[V][V];
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                graph[i][j]=sc.nextInt();
            }
        }
        p.primMST(graph,V);

    }
}*/


