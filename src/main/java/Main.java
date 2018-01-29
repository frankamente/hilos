public class Main {

    public static void main(String[] args) throws InterruptedException {

        Runnable workFran = new WorkFran();
        Runnable workJorge = new WorkJorge();
        Thread threadFran = new Thread(workFran);
        Thread threadJorge = new Thread(workJorge);

        threadFran.start();
        threadJorge.start();

        System.out.println("KILLO trabaja!");

    }
}
