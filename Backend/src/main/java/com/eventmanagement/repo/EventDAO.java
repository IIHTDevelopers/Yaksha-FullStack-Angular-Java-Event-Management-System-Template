package com.eventmanagement.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventmanagement.entity.Event;

@Repository
public interface EventDAO extends JpaRepository<Event, Long> {

}
