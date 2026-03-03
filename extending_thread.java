public class Worker extends Thread {

    int id;
    int N;

    public Worker(int id, int N) {
        this.id = id;
        this.N = N;
    }

    public void run() {
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
