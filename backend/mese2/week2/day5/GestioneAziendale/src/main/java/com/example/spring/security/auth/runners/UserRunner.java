package com.example.spring.security.auth.runners;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.spring.security.auth.roles.ERole;
import com.example.spring.security.auth.roles.Role;
import com.example.spring.security.auth.roles.RoleRepository;
import com.example.spring.security.auth.users.User;
import com.example.spring.security.auth.users.UserRepository;

@Component
public class UserRunner implements ApplicationRunner {
	
	@Autowired RoleRepository roleRepository;
	@Autowired UserRepository userRepository;
	@Autowired PasswordEncoder encoder;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Role admin = new Role();
		admin.setRoleName(ERole.ROLE_ADMIN);
//		roleRepository.save(admin);
		
		Role user = new Role();
		user.setRoleName(ERole.ROLE_USER);
//		roleRepository.save(user);
		
		Role moderator = new Role();
		moderator.setRoleName(ERole.ROLE_MODERATOR);
//		roleRepository.save(moderator);
		
		Set<Role> adminRole = new HashSet<Role>();
		adminRole.add(admin);
		adminRole.add(moderator);
		adminRole.add(user);
		
		Set<Role> moderatorRole = new HashSet<Role>();
		moderatorRole.add(moderator);
		moderatorRole.add(user);
		
		Set<Role> userRole = new HashSet<Role>();
		userRole.add(user);
		
		User userAdmin = new User();
		userAdmin.setNome("Damiano");
		userAdmin.setCognome("Tiberi");
		userAdmin.setUsername("DamTib");
		userAdmin.setEmail("dam@tib.com");
		userAdmin.setPassword(encoder.encode("112233"));
		userAdmin.setRoles(adminRole);
//		userRepository.save(userAdmin);
		
		User simpleUser = new User();
		simpleUser.setNome("Manuel");
		simpleUser.setCognome("Ferrucci");
		simpleUser.setUsername("manufer");
		simpleUser.setEmail("man@fer.com");
		simpleUser.setPassword(encoder.encode("123456"));
		simpleUser.setRoles(userRole);
//		userRepository.save(simpleUser);
		
		User userModerator = new User();
		userModerator.setNome("Stefano");
		userModerator.setCognome("Violi");
		userModerator.setUsername("stevio");
		userModerator.setEmail("ste@vio.com");
		userModerator.setPassword(encoder.encode("qwertyu"));
		userModerator.setRoles(moderatorRole);
//		userRepository.save(userModerator);
	}

}
