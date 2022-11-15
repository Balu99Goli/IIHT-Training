package com.learn.core.SpringCoreDemo.ReferenceInjection;

public class Object1 {
	
	private int x;
	private Object2 obj;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public Object2 getObj() {
		return obj;
	}
	public void setObj(Object2 obj) {
		this.obj = obj;
	}
	public Object1(int x, Object2 obj) {
		super();
		this.x = x;
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "Object1 [x=" + x + ", obj=" + obj + "]";
	}
	public Object1() {
		super();
	}
	
	

}
