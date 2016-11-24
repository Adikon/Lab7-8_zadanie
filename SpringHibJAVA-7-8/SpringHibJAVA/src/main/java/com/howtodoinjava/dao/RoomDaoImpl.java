package com.howtodoinjava.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.entity.CustomerEntity;

@Repository
public class RoomDaoImpl implements RoomDAO  {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public void addRoom(RoomEntity room) {
		this.sessionFactory.getCurrentSession().save(room);
	}	

	@SuppressWarnings("unchecked")
	@Override
	public List<RoomEntity> getAllRooms() {
		return this.sessionFactory.getCurrentSession().createQuery("from RoomEntity").list();
	}

	@Override
	public void deleteRoom(Integer roomId) {
		RoomEntity room = (RoomEntity) sessionFactory.getCurrentSession().load(
				RoomEntity.class, roomId);
        if (null != room) {
        	this.sessionFactory.getCurrentSession().delete(room);
        }
	}
	
	

}
