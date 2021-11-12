/*
 * 生产者消费者模式
 * */
public class TestPC {
    public static void main(String[] args) {
        SynContainer synContainer = new SynContainer();
        Producer producer = new Producer(synContainer, "线程一");
        Consumer consumer = new Consumer(synContainer);
//        Producer producer2 = new Producer(synContainer, "线程二");
        producer.start();
//        producer2.start();
        consumer.start();
    }
}

class Producer extends Thread {
    SynContainer synContainer;

    public Producer(SynContainer synContainer, String name) {
        super(name);
        this.synContainer = synContainer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synContainer.push(new chicken());
//            System.out.println(getName()+"生产了" + (i + 1) + "只鸡");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    SynContainer synContainer;

    public Consumer(SynContainer synContainer) {
        this.synContainer = synContainer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synContainer.pop();
//            System.out.println("取了" + (i + 1) + "只鸡");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class chicken {
    int id;
}

class SynContainer {
    private chicken[] chickens = new chicken[100];
    private int count = 0;

    public synchronized void push(chicken c) {
        if (count == chickens.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            chickens[count] = c;
            count++;
            System.out.println("生产了一只鸡,现在鸡的数量为：" + count);
            this.notifyAll();
        }
    }

    public synchronized chicken pop() {
        if (count == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        this.notifyAll();
        System.out.println("取走了一只鸡,现在鸡的数量为：" + count);
        return chickens[count];
    }
}