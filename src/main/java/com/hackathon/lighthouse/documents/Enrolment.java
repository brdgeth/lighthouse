package com.hackathon.lighthouse.documents;

import java.util.Collection;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="enrolments")
public class Enrolment {
	
	private ObjectId _id;

	private String accountId;
	private String enrolmentDateTime;
	private Collection<Interest> registeredInterests;
	
	public ObjectId get_id() {
		return _id;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getEnrolmentDateTime() {
		return enrolmentDateTime;
	}

	public void setEnrolmentDateTime(String enrolmentDateTime) {
		this.enrolmentDateTime = enrolmentDateTime;
	}

	public Collection<Interest> getRegisteredInterests() {
		return registeredInterests;
	}

	public void setRegisteredInterests(Collection<Interest> registeredInterests) {
		this.registeredInterests = registeredInterests;
	}

	@Override
	public String toString() {
		return "Enrolment [_id=" + _id + ", accountId=" + accountId + ", enrolmentDateTime=" + enrolmentDateTime
				+ ", registeredInterests=" + registeredInterests + "]";
	}


}
