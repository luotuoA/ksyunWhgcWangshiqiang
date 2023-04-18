package Test;


import com.ksyun.whgc.wangshiqiang.thirdQuestion.PrintABC;

public class PrintABCTest {
    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintABC.PrintTask("A", 0));
        Thread threadB = new Thread(new PrintABC.PrintTask("B", 1));
        Thread threadC = new Thread(new PrintABC.PrintTask("C", 2));
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
