package com.original_game.janken;
 
import javax.swing.JFrame;
 
public class Game {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ウィンドウ設定
		JFrame frame = new JFrame("じゃんけんほい！");
		frame.setSize(640, 480);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		Panel.createPanel(frame);
		
		//ウィンドウ表示
		frame.setVisible(true);
	}
}