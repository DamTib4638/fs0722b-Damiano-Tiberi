package com.example.spring.security.auth.devices;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.security.auth.users.User;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {

}
