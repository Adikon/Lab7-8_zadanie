package com.howtodoinjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.howtodoinjava.entity.RoomEntity;
import com.howtodoinjava.service.RoomManager;

@Controller
public class EditRoomController {
	
	@Autowired
	private RoomManager RoomManager;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listRoom(ModelMap map)
	{
		map.addAttribute("room", new RoomEntity());
		map.addAttribute("roomList", RoomManager.getAllRoom());
		
		return "editRoomList";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addRoom(@ModelAttribute(value="room") RoomEntity room, BindingResult result)
	{
		RoomManager.addRoom(roomList);
		return "redirect:/";
	}

	@RequestMapping("/delete/{roomId}")
	public String deleteRoom(@PathVariable("roomId") Integer roomId)
	{
		customerManager.deleteRoom(roomId);
		return "redirect:/";
	}

	public void setRoomManager(RoomManager roomManager) {
		this.roomManager = roomManager;
	}
}
