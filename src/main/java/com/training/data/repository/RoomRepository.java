package com.training.data.repository;

import com.training.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface RoomRepository extends CrudRepository<Room, Long> {
    Room findByNumber(String number);

}
