package com.tragent.pressing.service.implementation;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import com.tragent.pressing.model.Role;
import com.tragent.pressing.repository.RoleRepository;
import com.tragent.pressing.service.RoleService;

@Service
@Secured("ROLE_ADMINISTRATION")
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleRepository	roleRepository;

	@Override
	public Collection<Role> findAll() {
		
		Collection<Role> roles = roleRepository.findAll();
		return roles;
	}

	@Override
	public Role findById(Long id) {
		
		Role role = roleRepository.findOne(id);
		return role;
	}

	@Override
	public Role findByName(String name) {
		
		Role role = roleRepository.findByName(name);
		return role;
	}

	@Override
	public Role create(Role role) {
		
		Role savedRole = roleRepository.save(role);
		return savedRole;
	}

	@Override
	public Role update(Role role) {
		
		Role updatedRole = roleRepository.save(role);
		return updatedRole;
	}

}
