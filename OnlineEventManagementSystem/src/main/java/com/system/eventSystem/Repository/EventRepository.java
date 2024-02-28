package com.system.eventSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.eventSystem.Model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
