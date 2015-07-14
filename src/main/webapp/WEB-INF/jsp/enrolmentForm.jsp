<h3>Enrolment Form</h3>
<form:form method="POST" action="enrolments">
	<form:errors element="div" cssClass="error" path="*">No, stupid! That's WRONG.</form:errors>
	<br/>
	<form:errors cssClass="error" element="span" path="accountId" /><br/>
	<form:label path="accountId">Account Number: </form:label>
	<form:input path="accountId" /> <br/>
	<form:checkbox path="termsAccepted" cssErrorClass="error" />
	<form:label path="termsAccepted">I Accept the Terms and Conditions</form:label> <br/>
	<form:errors cssClass="error" element="span" path="termsAccepted" /><br/>
	<input type="submit" value="ENROL" />
</form:form>