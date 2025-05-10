// Simple Contact Management Create a class Contact with fields: name, phoneNumber, emailAddress.
// Create 3 Contact objects. Print the contact details only if the emailAddress is not empty (use if condition).
class Contact{
    String name;
    long phoneNumber;
    String emailAddress;
    public Contact(String name, long phoneNumber, String emailAddress){
        this.name= name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    public void showContact(){
        if( emailAddress == null || emailAddress.isEmpty()){
            System.out.println("No Email Address Entered.");
        }else{
            System.out.println("Name:" +name);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Email Address: " + emailAddress);
        }
    }
    public static void main(String[] args){
        Contact C1 = new Contact("John", 9779375757L, "john@gmail.com"); // In phone no. 'L' tells Java it's a long value
        Contact C2 = new Contact("Linda",9843234567L,"linda@gmail.com" );
        Contact C3 = new Contact("Hero", 9866476345L, "");
    C1.showContact();
    C2.showContact();
    C3.showContact();
    }
}