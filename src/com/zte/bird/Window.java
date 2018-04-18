package com.zte.bird;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
public class Window {
	
	
	public Window() {
		//��������
		JFrame win=new JFrame("��������Ϸ");
		//�������ڵĴ�С
				win.setSize(432,644);
				//��������
				final BirdScene scene=new BirdScene();
				//��ӳ���
				win.add(scene);
				//��ʾ����
				win.show();
				addTimer(scene);
	}
	//��Ӷ�ʱ��
	public void addTimer(final BirdScene scene) {
		Timer t = new Timer();
		//ִ�ж�ʱ��
		t.schedule(new TimerTask(){
			@Override
		public void run() {
			scene.bird.update();
			scene.street.update();
			scene.c1.update();
			scene.c2.update();
			scene.street.update();
			scene.repaint();//�ػ�
		}
			
		},0,1000/60);
	
	}
	
}
