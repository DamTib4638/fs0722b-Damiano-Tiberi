package com.example.spring.security.auth.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.spring.security.auth.devices.Device;
import com.example.spring.security.auth.devices.DeviceRepository;
import com.example.spring.security.auth.devices.StatoDevice;
import com.example.spring.security.auth.devices.TipoDevice;
import com.example.spring.security.auth.users.User;
import com.example.spring.security.auth.users.UserRepository;

@Component
public class DeviceRunner implements ApplicationRunner {
	
	@Autowired DeviceRepository deviceRepository;
	@Autowired UserRepository userRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
//		User amministratore = userRepository.findById(1l).get();
		
//		User utente = userRepository.findById(2l).get();
		
//		User moderatore = userRepository.findById(3l).get();
		
//		Device smartphone = new Device();
//		smartphone.setStatoDevice(StatoDevice.IN_MANUTENZIONE);
//		smartphone.setTipoDevice(TipoDevice.SMARTPHONE);
//		smartphone.setUser(utente);
//		deviceRepository.save(smartphone);
		
//		Device tablet = new Device();
//		tablet.setStatoDevice(StatoDevice.ASSEGNATO);
//		tablet.setTipoDevice(TipoDevice.TABLET);
//		tablet.setUser(amministratore);
//		deviceRepository.save(tablet);
		
//		Device laptop = new Device();
//		laptop.setStatoDevice(StatoDevice.DISMESSO);
//		laptop.setTipoDevice(TipoDevice.LAPTOP);
//		laptop.setUser(amministratore);
//		deviceRepository.save(laptop);
		
	}

}
