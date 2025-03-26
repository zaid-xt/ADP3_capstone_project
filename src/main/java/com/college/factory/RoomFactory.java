package com.college.factory;

import com.college.domain.Room;

public class RoomFactory {
    public static Room createRoom(String roomID, String roomType,float roomPrice, boolean availablity, String features) {
        return new Room.RoomBuilder(roomID,roomType,roomPrice,availablity,features).build();
    }
}
