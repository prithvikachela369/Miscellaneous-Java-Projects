import java.awt.FlowLayout;//awt :- Abstract Windows Toolkit which supports GUI
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Introduction {

	public static void main(String[] args) {
		A a = new A();
		
	}

}

class A extends JFrame{//JFrame follows Card Layout means we can only see one card(Line)
	public A() {
		setLayout(new GridLayout());//Types of layout - CardLayout(Default), FlowLayout, GridLayout, NullLayout
		JLabel j = new JLabel("Hello Aliens how's the Spaceship!!");
		JLabel j2 = new JLabel("Hello World how's the Economy!!");
		add(j);
		add(j2);
		setVisible(true);
		setSize(500,500);// Units in pixel
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//this is method is used to close the JFrame
		//EXIT_ON_CLOSE is a static constant whose value is 3
	}
}