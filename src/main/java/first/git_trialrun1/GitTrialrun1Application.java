package first.git_trialrun1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTrialrun1Application {

    public static void main(String[] args) {
        SpringApplication.run(GitTrialrun1Application.class, args);

        System.out.println("GitTrialrun1Application started");

        System.out.println("Testing code changes in git, to practise branching");

        //From here you enter the new branch

        System.out.println("1st branching started");

        //practicing pull requests
        System.out.println("Greeting from a new member, practicing pull requests");
    }
}
