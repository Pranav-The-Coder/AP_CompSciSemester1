/*
 *  Author:  Pranav A
 *  Date: October 28
 */

package pkg;
import java.util.Random;
import java.util.Scanner;

public class PooleDwarf {
	private String name;
	private int age;

	public PooleDwarf() {
		this.name = "";
		this.age = 0;
	}

	public PooleDwarf(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}
}
