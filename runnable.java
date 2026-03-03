public class Worker implements Runnable {
    int id, N;

    public Worker(int i, int N){
        this.id = i;
        this.N = N;
    }

  
    public void run(){
        doWork();
    }

    private void doWork(){
        for (int ctr = 1; ctr <= N; ctr++) {
            System.out.println("Wid=" + id + " ctr=" + ctr);
        }
    }
}


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        for(int wid = 1; wid <= K; wid++){
            Worker w = new Worker(wid);
            w.doWork(N);
        }

    }
}
