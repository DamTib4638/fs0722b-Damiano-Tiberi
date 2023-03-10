package com.example.spring.security.auth.roles;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "be_service_roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Role {
	@Id
	//@SequenceGenerator(name = "be_service_roles_id_seq", sequenceName = "be_service_roles_id_seq", allocationSize = 1)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "be_service_roles_id_seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ERole roleName;

}