package uy.edu.cei.taller.service;

import org.springframework.stereotype.Service;

@Service("b")
public class OtherMessageService implements MessageService {

	@Override
	public String fetchMessage() {
		return "OtherMessageService";
	}
}
