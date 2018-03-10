package learningjee.service;

import java.util.ArrayList;
import java.util.List;

public class WelcomeServiceLayer {
	public List<String> getMessages(String name) {
		List<String> messages = new ArrayList<String>();
		messages.add("Hello " + name);
		messages.add("Welcome to Java Spring course");
		return messages;
	}
}
