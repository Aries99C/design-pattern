package principle.lod.work;

public class WorkApp {
    public static void main(String[] args) {
        Client client = new Client();
        Worker worker =  new Worker();

        client.command(worker);
    }
}

class Client {
    public void command(Worker worker) {
        worker.work();
    }
}

class Worker {
    private void workA() {
        System.out.println("工作A完成");
    }
    private void workB() {
        System.out.println("工作B完成");
    }
    private void workC() {
        System.out.println("工作C完成");
    }
    public void work() {
        workA();
        workB();
        workC();
    }
}