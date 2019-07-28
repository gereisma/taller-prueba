package uy.edu.cei.taller.service;

import org.springframework.stereotype.Service;

@Service("a")
public class OneMessageService implements MessageService {

	public static final String MESSAGE = "este es un mensaje";

	public String fetchMessage() {
		return MESSAGE;
	}
}
