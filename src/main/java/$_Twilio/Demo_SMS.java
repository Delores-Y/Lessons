package $_Twilio;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Demo_SMS {

    public static final String ACCOUNT_SID = "AC3c87a4b10228aa465fd590d3d0d69468";
    public static final String AUTH_TOKEN = "f7b74ab7af415366ba1777d87dd4d025";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber("+8615711325779"),
                new PhoneNumber("+14344424918"),
                "This is the ship that made the Kessel Run in fourteen parsecs?").create();

        System.out.println(message.getSid());
    }
}
