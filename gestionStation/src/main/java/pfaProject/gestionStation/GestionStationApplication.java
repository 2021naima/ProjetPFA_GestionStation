package pfaProject.gestionStation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
/*import org.springframework.security.config.authentication.UserServiceBeanDefinitionParser;
import org.springframework.security.core.parameters.P;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import pfaProject.gestionStation.entities.AppUser;
import pfaProject.gestionStation.entities.role;
import pfaProject.gestionStation.service.appUserServiceImplement;
import javax.servlet.annotation.ServletSecurity;
 */
import java.util.ArrayList;


@SpringBootApplication
public class GestionStationApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionStationApplication.class, args);
	}

/*	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	@Bean
	CommandLineRunner run(appUserServiceImplement userService ) {
		return args -> {
			userService.saveRole(new role(null, "ROLE_USER"));
			userService.saveRole(new role(null, "ROLE_MANAGER"));
			userService.saveRole(new role(null, "ROLE_ADMIN"));
			userService.saveRole(new role(null, "ROLE_SUPER_ADMIN"));

			userService.saveUser(new AppUser(null, "john travolta", "john", "123", new ArrayList<>()));
			userService.saveUser(new AppUser(null, "will smith", "will", "123", new ArrayList<>()));
			userService.saveUser(new AppUser(null, "naima bourhym", "naima", "123", new ArrayList<>()));
			userService.saveUser(new AppUser(null, "jim carry", "jim", "123", new ArrayList<>()));

			userService.addRoleToUser("john","ROLE_USER");
			userService.addRoleToUser("john","ROLE_MANAGER");
			userService.addRoleToUser("will","ROLE_MANAGER");
			userService.addRoleToUser("jim","ROLE_ADMIN");
			userService.addRoleToUser("naima","ROLE_SUPER_ADMIN");
			userService.addRoleToUser("naima","ROLE_USER");



		};
	}
*/
}
