package com.aurionpro.creational.AbstractFactory.model;

import java.util.Scanner;

public interface IAccountFactory {
	IAccount makeAccount(Scanner scanner, Long accounNumber);
}
