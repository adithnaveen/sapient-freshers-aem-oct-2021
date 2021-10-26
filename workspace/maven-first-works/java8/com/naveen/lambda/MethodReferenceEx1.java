package com.naveen.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

import lombok.extern.slf4j.Slf4j;

interface SaySomething {
	public void say();
}

class SomeStringWorks {
	public static String concatName(String firstName, String lastName) {
		return firstName.toUpperCase() + ", " + lastName.toUpperCase();
	}
}

@Slf4j
public class MethodReferenceEx1 {

	public static void hello() {
		log.info("Hi Hello");
	}

	public static String sayHello(String name) {
		return "HELLO " + name.toUpperCase();
	}

	public static void main(String[] args) {
		hello();

		SaySomething saySomthing = MethodReferenceEx1::hello;
		saySomthing.say();

		Function<String, String> function = (t) -> "Hello " + t;
		System.out.println(function.apply("Naveen"));

		Function<String, String> function1 = MethodReferenceEx1::sayHello;
		System.out.println(function1.apply("Rishab"));

		BiFunction<String, String, String> getFullName = (t, u) -> t.toUpperCase() + " " + u.toUpperCase();

		System.out.println(getFullName.apply("Pankhuri", "Awasthi"));

		BiFunction<String, String, String> getFullNameClassImpl = 
					SomeStringWorks::concatName;
		System.out.println(getFullNameClassImpl.apply("Sajid", "Ansari"));

	}
}
