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
<<<<<<< HEAD
		//new changes from talha
		System.out.println("Talha Commit");

=======
>>>>>>> ce3c77b6e72f215e3d00dd9b61871183cf07f2cc
		GitprogamcheckApplication newteamobj = new GitprogamcheckApplication();

		System.out.println(newteamobj);
		System.out.println("Kamran' 2nd commit");
	}
}
