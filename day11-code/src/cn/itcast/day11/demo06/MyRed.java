package cn.itcast.day11.demo06;

import cn.itcast.day11.red.RedPacketFrame;

public class MyRed extends RedPacketFrame {
    /**
     * 构造方法：生成红包界面
     *
     * @param title 页面的标题
     */
    public MyRed(String title) {
        super(title);
    }
}
