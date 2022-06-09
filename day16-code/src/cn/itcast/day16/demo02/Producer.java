package cn.itcast.day16.demo02;

class Producer implements Runnable{
    public Container con;
    public Producer(Container con){
        this.con = con;
    }
    public void run(){
        while(true){
            synchronized(con){
                if(con.currentNum < con.max){
                    con.currentNum++;
                    System.out.println(" 生产者正在生产...+1, 当前产品数："+con.currentNum);
                    con.notify();
                }else if(con.currentNum == con.max){//
                    System.out.println("箱子已经饱和，生产者停止生产，正在等待消费...");
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

