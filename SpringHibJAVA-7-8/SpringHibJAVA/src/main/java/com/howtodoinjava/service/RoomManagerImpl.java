package com.howtodoinjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava.dao.RoomDAO;
import com.howtodoinjava.entity.RoomEntity;

@Service
public class RoomManagerImpl implements RoomManager {
	
	@Autowired
    private RoomDAO RoomDAO;

	@Override
	@Transactional
	public void addRoom(RoomEntity Room) {
		customerDAO.addRoom(Room);
	}

	@Override
	@Transactional
	public List<RoomEntity> getAllRooms() {
		return RoomDAO.getAllRooms();
	}

	@Override
	@Transactional
	public void deleteRoom(Integer RoomId) {
		RoomDAO.deleteRoom(RoomId);
	}

	public void setRoomDAO(RoomDAO RoomDAO) {
		this.RoomDAO = RoomDAO;
	}
}
