package com.vinslearn.conferencedemo.repositories;

import com.vinslearn.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
