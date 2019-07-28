package uy.edu.cei.taller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.edu.cei.taller.bean.UserBean;
import uy.edu.cei.taller.dao.UserMapper;
import uy.edu.cei.taller.service.MessageService;

@RestController("/")
public class HomeController {

	private final UserMapper userMapper;
	private final MessageService messageService;

	@Autowired
	public HomeController(final UserMapper userMapper,
			@Qualifier("b") final MessageService messageService) {
		this.userMapper = userMapper;
		this.messageService = messageService;
	}

	@GetMapping
	public Message index() {
		System.out.println(this.messageService.fetchMessage());
		return new Message("hello world mas bonito");
	}
	
	@GetMapping("users")
	public List<UserBean> users() {
		return this.userMapper.all();
	}

	static class Message {
		private String message;

		public Message() {
		}

		public Message(String message) {
			super();
			this.message = message;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

	}
}
