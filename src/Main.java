public class Main {
    public static void main(String[] args) {



    }

    int getGCD(int a, int b){ //O(n-m) runtime
        if(a==b) return a;
        else if(a>b) return getGCD(a-b,b);
        else return getGCD(a,b-a);
    }
}