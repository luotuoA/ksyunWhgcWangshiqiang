package com.ksyun.whgc.wangshiqiang.thirdQuestion;

public class PrintABC {
    private static Object lock = new Object();
    private static int count = 0;

    public static class PrintTask implements Runnable {
        private String id;
        private int sequence;
        public PrintTask(String id, int sequence) {
            this.id = id;
            this.sequence = sequence;
        }
        public void run() {
            for (int i = 0; i < 5;) {
                synchronized (lock) {
                    while (count % 3 != sequence) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count++;
                    i++;
                    System.out.print(id);
                    lock.notifyAll();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
