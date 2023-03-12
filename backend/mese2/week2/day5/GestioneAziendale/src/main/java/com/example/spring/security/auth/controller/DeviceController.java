package com.example.spring.security.auth.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.security.auth.devices.Device;
import com.example.spring.security.auth.devices.DeviceRepository;
import com.example.spring.security.auth.users.UserRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/devices")
public class DeviceController {
	
	@Autowired
	DeviceRepository deviceRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping
	@PreAuthorize("hasRole('ADMIN')")
	public Page<Device> deviceList(Pageable pageable) {
		Page<Device> findAll = deviceRepository.findAll(pageable);
		return findAll;
	}
	
	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Device> createDevice(@RequestBody Device device) {
		if (device.getUser() == null || userRepository.existsByUsername(device.getUser().getUsername())) {
			Device deviceInserito = deviceRepository.save(device);
			return new ResponseEntity<Device>(deviceInserito, HttpStatus.OK);
		}
		return null;
	}
	
	@PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Device> updateDevice(@RequestBody Device device) {
        if (device.getUser() == null || userRepository.existsByUsername(device.getUser().getUsername())) {
            Device deviceModificato = deviceRepository.save(device);
            return new ResponseEntity<Device>(deviceModificato, HttpStatus.OK);
        }
        return null;
    }
	
	@DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> deleteDevice(@PathVariable Long id) {
        Device deviceEliminato = deviceRepository.findById(id).get();
        if (deviceEliminato != null) {
            deviceRepository.delete(deviceEliminato);
            return new ResponseEntity<String>("Device eliminato correttamente!", HttpStatus.OK);
        }
        return null;
    }

}
