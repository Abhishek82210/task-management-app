package com.example.tast_management_system.repository;

import com.example.tast_management_system.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task , Long>
{

}
