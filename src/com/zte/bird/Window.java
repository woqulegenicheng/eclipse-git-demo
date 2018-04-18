package com.zte.bird;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
public class Window {
	
	
	public Window() {
		//创建窗口
		JFrame win=new JFrame("橡树鸟游戏");
		//创建窗口的大小
				win.setSize(432,644);
				//创建场景
				final BirdScene scene=new BirdScene();
				//添加场景
				win.add(scene);
				//显示窗口
				win.show();
				addTimer(scene);
	}
	//添加定时器
	public void addTimer(final BirdScene scene) {
		Timer t = new Timer();
		//执行定时器
		t.schedule(new TimerTask(){
			@Override
		public void run() {
			scene.bird.update();
			scene.street.update();
			scene.c1.update();
			scene.c2.update();
			scene.street.update();
			scene.repaint();//重画
		}
			
		},0,1000/60);
	
	}
	
}
