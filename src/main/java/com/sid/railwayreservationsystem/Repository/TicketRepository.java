package com.sid.railwayreservationsystem.Repository;

import com.sid.railwayreservationsystem.Entity.TicketData;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<TicketData, ObjectId> {
}
