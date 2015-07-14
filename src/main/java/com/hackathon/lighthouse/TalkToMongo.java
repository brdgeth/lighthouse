package com.hackathon.lighthouse;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.hackathon.lighthouse.documents.Enrolment;
import com.hackathon.lighthouse.documents.Interest;
import com.hackathon.lighthouse.repository.EnrolmentRepository;

@Component
public class TalkToMongo {

	private static final String MY_ACCOUNT_ID = "myAccountID";
	private static final String MY_ACCOUNT_ID_2 = "myAccountID2";
	private static final String[] INTEREST_NAMES = { "Gadgets", "Green energy", "Phones", "Flying", "Outdoors",
			"Software", "Fashion" };

	@Autowired
	private EnrolmentRepository enrolmentRepository;

	public static void main(String[] args) throws Exception {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml")) {
			TalkToMongo talkToMongo = ctx.getBean(TalkToMongo.class);
			Enrolment enrolment = new Enrolment();
			enrolment.setAccountId(MY_ACCOUNT_ID);
			enrolment.setEnrolmentDateTime(new Date().toString());
			enrolment.setRegisteredInterests(talkToMongo.createInterests());
			talkToMongo.saveEnrolment(enrolment);
			Enrolment enrolment2 = new Enrolment();
			enrolment2.setAccountId(MY_ACCOUNT_ID_2);
			enrolment2.setEnrolmentDateTime(new Date().toString());
			enrolment2.setRegisteredInterests(talkToMongo.createInterests());
			talkToMongo.saveEnrolment(enrolment2);
		}
		System.out.println("bye!");

	}

	private void saveEnrolment(Enrolment enrolment) {
		Enrolment saved = enrolmentRepository.save(enrolment);
		System.out.println("--- saved:");
		System.out.println(saved);
		System.out.println("--- all:");
		List<Enrolment> findAll = enrolmentRepository.findAll();
		for (Enrolment e : findAll) {
			System.out.println(e);
		}
		System.out.println("--- by accountId:");
		Iterable<Enrolment> byAccountId = enrolmentRepository.findByAccountId(MY_ACCOUNT_ID);
		for (Enrolment e : byAccountId) {
			System.out.println(e);
		}

	}

	private Collection<Interest> createInterests() {
		Interest[] interests = new Interest[3];
		for (int i = 0; i < interests.length; i++) {
			String randomInterestName = INTEREST_NAMES[(int) (Math.random() * INTEREST_NAMES.length)];
			Interest interest = new Interest(randomInterestName);
			interests[i] = interest;
		}
		return Arrays.asList(interests);
	}

}
