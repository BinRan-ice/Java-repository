package cn.itcast.day16.demo02;

class Consumer implements Runnable{
    public Container con;
    public Consumer(Container con){
        this.con = con;
    }
    public void run(){
        while(true){
            synchronized(con){
                if(con.currentNum > 0 ){
                    con.currentNum--;
                    System.out.println(" 消费者正在消费...-1, 当前产品数："+con.currentNum);
                    con.notify();
                }else if(con.currentNum == 0){
                    System.out.println("箱子已经空了，消费者停止消费，正在等待生产...");
                    try {
                        con.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}