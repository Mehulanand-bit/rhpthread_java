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
