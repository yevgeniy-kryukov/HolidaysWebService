package org.yryukov.holidaysws;

//класс, для запуска веб-сервера с веб-сервисами
import javax.xml.ws.Endpoint;
//класс нашего веб-сервиса
import org.yryukov.holidaysws.HolidaysWebServiceImpl;
import java.util.Scanner;

public class HolidaysWebServicePublisher {
	public static void main(String[] args) {
		// запускаем веб-сервер на порту 8085
		// и по адресу, указанному в первом аргументе,
		// запускаем веб-сервис, передаваемый во втором аргументе

		Endpoint ep = Endpoint.create(new HolidaysWebServiceImpl());
		ep.publish("http://localhost:8085/ws/holidays");

		boolean isWsStarted = true;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Type 'stop' for stop service: ");
			if (scanner.nextLine().equals("stop")) {
				ep.stop();
				isWsStarted = false;
			}
		} while (isWsStarted);

		System.out.println("Service was stopped");
	}
}
