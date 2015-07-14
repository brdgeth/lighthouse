package com.hackathon.lighthouse.formbeans;

import java.util.Arrays;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class EnrolmentFormBean {

	@NotBlank(message="The account number is missing")
	@Size(max = 12, message="The account number must be up to 12 characters long")
	private String accountId;

	@AssertTrue(message="You must accept our Ts & Cs first, fool!")
	private boolean termsAccepted;

	@Size(min = 1)
	private String[] categories;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public boolean isTermsAccepted() {
		return termsAccepted;
	}

	public void setTermsAccepted(boolean termsAccepted) {
		this.termsAccepted = termsAccepted;
	}

	public String[] getCategories() {
		return categories;
	}

	public void setCategories(String[] categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "EnrolmentFormBean [accountId=" + accountId + ", termsAccepted=" + termsAccepted + ", categories="
				+ Arrays.toString(categories) + "]";
	}

}
