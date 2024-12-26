package com.example.migration;

import com.example.migration.entity.Text;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TextRepository extends CrudRepository<Text, UUID> {
}
