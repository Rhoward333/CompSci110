//class declaration
public class Messenger {

	 //Data field
	public String defaultMessage = "Stinky the Wonder Hapmster will rise again!";
	
	//Class member (Static)
	//Formula for declaring a method: 
	//Scope - Public: Everyone can see it.
	//scope [static] returnType/void methodName([parameter list]) {}
	public static String MessageConcatinator(String msg) {
		return "Message: " + msg;
		}
	
	//Instance member (non-static)
	public String whateverYouWantToCallIt() {
		return "Default Message: " + defaultMessage;
	}
	
	public static void main(String[] args){		
		//Create a new instance of Messenger
		Messenger m = new Messenger();
		
		//Call the static method, use the returned string
		System.out.println(Messenger.MessageConcatinator("Whatever... and things."));
		
		//Call the instance method, use the returned string
		System.out.println(m.whateverYouWantToCallIt());
	}
	
}


	
	

