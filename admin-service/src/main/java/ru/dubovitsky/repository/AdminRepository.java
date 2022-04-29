package ru.dubovitsky.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dubovitsky.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
