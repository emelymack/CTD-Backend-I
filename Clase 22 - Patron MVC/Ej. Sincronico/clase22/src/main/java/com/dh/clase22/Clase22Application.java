package com.dh.clase22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
public class Clase22Application {

	public static void main(String[] args) {
		cargarBD();
		SpringApplication.run(Clase22Application.class, args);
		System.out.println("Soy la siguiente línea despues del run");
	}

	private static void cargarBD(){
		Connection connection=null;
		try{
			Class.forName("org.h2.Driver");
			connection=DriverManager.getConnection("jdbc:h2:~/cam9clase22" +
							";INIT=RUNSCRIPT FROM 'create.sql'",
					"sa","sa");
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
			try{
				connection.close();
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}
	}

}
