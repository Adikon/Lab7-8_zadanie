package com.howtodoinjava.dao;

import com.howtodoinjava.entity.RoomEntity;

import java.util.List;

public interface RoomDAO
{
    public void addRoom(RoomEntity room);
    public List<RoomEntity> getAllRooms();
    public void deleteRoom(Integer roomId);
}