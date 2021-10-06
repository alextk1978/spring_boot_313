package ru.alextk.spring_boot_313.repository;

import org.springframework.data.repository.CrudRepository;
import ru.alextk.spring_boot_313.model.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
}
