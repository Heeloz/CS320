package Contact;
public class Contact {
	private static final int PHONE_LENGTH = 10;
	private static final byte ID_LENGTH = 10;
	private static final byte FIRSTNAME_LENGTH = 10;
	private static final byte LASTNAME_LENGTH = 10;
	private static final byte ADDRESS_LENGTH = 30;
	private static final String INITIAL = "INITIAL";
	private static final String INITIAL_NUM = "3607981234";
	private String contactId; 
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact() {
		this.contactId = INITIAL;
		this.firstName = INITIAL;
		this.lastName = INITIAL;
		this.address = INITIAL;
		this.phone = INITIAL_NUM;
	}
	
	public Contact(String contactId) {
		 updateContactId(contactId);
		 this.firstName = INITIAL;
		 this.lastName = INITIAL;
		 this.phone = INITIAL_NUM;
		 this.address = INITIAL;
	 }
	
	public Contact(String contactId, String firstName) {
		 updateContactId(contactId);
		 updateFirstName(firstName);
		 this.lastName = INITIAL;
		 this.phone = INITIAL_NUM;
		 this.address = INITIAL;
	 }
	 
	public Contact(String contactId, String firstName, String lastName) {
		 updateContactId(contactId);
		 updateFirstName(firstName);
		 updateLastName(lastName);
		 this.phone = INITIAL_NUM;
		 this.address = INITIAL;
	 }
	 
	public Contact(String contactId, String firstName, String lastName,
		 String phoneNumber) {
		 updateContactId(contactId);
		 updateFirstName(firstName);
		 updateLastName(lastName);
		 updatePhoneNumber(phoneNumber);
		 this.address = INITIAL;
	 }
	 
	public Contact(String contactId, String firstName, String lastName,
		 String phoneNumber, String address) {
		 updateContactId(contactId);
		 updateFirstName(firstName);
		 updateLastName(lastName);
		 updatePhoneNumber(phoneNumber);
		 updateAddress(address);
	 }
		 public final String getContactId() { 
			 return contactId;
			 }
		 
		 public final String getFirstName() { 
			 return firstName; 
			 }
		 
		 public final String getLastName() { 
			 return lastName; 
			 }
		 
		 public final String getPhoneNumber() { 
			 return phone; 
			 }
		 
		 public final String getAddress() { 
			 return address; 
			 }
		 
		 public void updateFirstName(String firstName) {
			 if (firstName == null) {
				 throw new IllegalArgumentException("First name cannot be empty");
			 } else if (firstName.length() > FIRSTNAME_LENGTH) {
				 throw new IllegalArgumentException("First name cannot be longer than " + FIRSTNAME_LENGTH + " characters");
			 } else {
				 this.firstName = firstName;
			 }
		 }

		 public void updateLastName(String lastName) {
			 if (lastName == null) {
				 throw new IllegalArgumentException("Last name cannot be empty");
			 } else if (lastName.length() > LASTNAME_LENGTH) {
				 throw new IllegalArgumentException("Last name cannot be longer than " + LASTNAME_LENGTH + " characters");
			 } else {
				 this.lastName = lastName;
			 }
		 }
		 
		 public void updatePhoneNumber(String phoneNumber) {
			 String regex = "[0-9]+";
			 if (phoneNumber == null) {
				 throw new IllegalArgumentException("Phone number cannot be empty.");
			 } else if (phoneNumber.length() != PHONE_LENGTH) {
				 throw new IllegalArgumentException("Phone number length invalid. Ensure it is " + PHONE_LENGTH + " digits.");
			 } else if (!phoneNumber.matches(regex)) {
				 throw new IllegalArgumentException("Phone number cannot have anything but numbers");
			 } else {
				 this.phone = phoneNumber;
			 }
		 }

		 public void updateAddress(String address) {
			 if (address == null) {
				 throw new IllegalArgumentException("Address cannot be empty");
			 } else if (address.length() > ADDRESS_LENGTH) {
				 throw new IllegalArgumentException("Address cannot be longer than " + ADDRESS_LENGTH + " characters");
			 } else {
				 this.address = address;
			 }
		 }
		 
		 public void updateContactId(String contactId) {
			 if (contactId == null) {
				 throw new IllegalArgumentException("Contact ID cannot be empty");
			 } else if (contactId.length() > ID_LENGTH) {
				 throw new IllegalArgumentException("Contact ID cannot be longer than " + ID_LENGTH + " characters");
				 } else {
					 this.contactId = contactId;
				 }
		 }
}