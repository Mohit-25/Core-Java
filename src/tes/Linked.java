package tes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class Student
{
	int id;
	String name;
	String address;
	int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	
	
}
public class Linked {
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
		LinkedList list=new LinkedList();
		
	
		Student s1=new Student(1,"mohit","A'bad",21);
		Student s2=new Student(2,"meet","surat",22);
		Student s3=new Student(3,"darshit","vadodara",23);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		list.forEach(e->{
			System.out.println(e);
		});
		
	}

}
