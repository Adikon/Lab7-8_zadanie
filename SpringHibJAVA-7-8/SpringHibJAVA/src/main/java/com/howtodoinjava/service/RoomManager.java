package com.howtodoinjava.service;

import java.util.List;

import com.howtodoinjava.entity.RoomEntity;

public interface RoomManager {
	public void addRoom(RoomEntity Room);
    public List<RoomEntity> getAllRooms();
    public void deleteRoom(Integer RoomId);
}
