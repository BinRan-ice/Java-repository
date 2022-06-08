package cn.itcast.day16.demo02;

public class TestProducerConsumer{
    public static void main(String args[]){
        Container container = new Container(6);
        Producer producer =  new Producer(container);
        Consumer consumer = new Consumer(container);

        new Thread(producer, "producer").start();
        new Thread(consumer, "consumer").start();
    }
}
