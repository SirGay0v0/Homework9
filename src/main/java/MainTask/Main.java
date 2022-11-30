/*
1. Easy - создайте многопоточное приложение с 5 потоками

2. Medium - создайте многопоточный цикл и однопоточный цикл, замерьте время выполнения программы в обоих случаях
3. Hard - создайте программу инкремента до 100 в многопоточном режиме

// задание со звездочкой
3. Hard - смоделируйте в многопоточном режиме работу перевода денежных средств от одного покупателя к другому
(сумма перевода запрашивается с клавиатуры, пользователь для отправления/получения выбираются с клавиатуры)
*/
package MainTask;

public class Main {
    public static void main(String[] args) {

        GetAndSetTime getAndSetTime = new GetAndSetTime();

        MyThread mt1 = new MyThread("mt1");
        MyThread mt2 = new MyThread("mt2");
        MyThread mt3 = new MyThread("mt3");
        MyThread mt4 = new MyThread("mt4");
        MyThread mt5 = new MyThread("mt5");

        Thread thread1 = new Thread(mt1);
        Thread thread2 = new Thread(mt2);
        Thread thread3 = new Thread(mt3);
        Thread thread4 = new Thread(mt4);
        Thread thread5 = new Thread(mt5);

        getAndSetTime.setStartTime(System.currentTimeMillis());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }

}