package com.richo.test.gradle;

import com.google.common.base.Preconditions;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello world!");
	}

	public String getString(String name)
	{
		Preconditions.checkNotNull(name);
		return "Hello " + name;
	}
}

