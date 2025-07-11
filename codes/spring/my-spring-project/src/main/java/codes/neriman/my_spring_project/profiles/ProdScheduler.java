package codes.neriman.my_spring_project.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "production")
public class ProdScheduler {
	@Scheduled(fixedRate = 5000)
	public void doIt() {
		System.out.println("prod scheduler");
	}
}

