package				 com.example.gitprogamcheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitprogamcheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitprogamcheckApplication.class, args);

		System.out.println("Hello world...");
		System.out.println("Kamran' commit");
		// new changes from fawad
		System.out.println("hello team by fawad");

		GitprogamcheckApplication newteamobj = new GitprogamcheckApplication();

		System.out.println(newteamobj);
	}
}
