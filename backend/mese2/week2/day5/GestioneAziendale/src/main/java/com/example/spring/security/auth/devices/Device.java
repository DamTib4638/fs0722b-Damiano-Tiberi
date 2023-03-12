package com.example.spring.security.auth.devices;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.spring.security.auth.users.User;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "devices")
@NoArgsConstructor
@Data
@ToString
public class Device {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDevice;
	
	@Enumerated(EnumType.STRING)
	private TipoDevice tipoDevice;
	
	@Enumerated(EnumType.STRING)
	private StatoDevice statoDevice;
	
	@ManyToOne
	@JoinColumn(name = "id", nullable = true)
	private User user;

}
