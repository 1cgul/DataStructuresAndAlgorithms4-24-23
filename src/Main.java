class MyDS{
    int[] solutionRepo = new int[50001];
    public void insert(int loc){
        solutionRepo[loc]=10;
    }
    public void remove(int loc){
        solutionRepo[loc]=0;
    }
    public boolean search(int loc){
        return solutionRepo[loc]==10;
    }
}
public class Main {

    public static void main(String[] args) {



    }

    int getGCD(int a, int b){ //O(n-m) runtime
        if(a==b) return a;
        else if(a>b) return getGCD(a-b,b);
        else return getGCD(a,b-a);
    }
}