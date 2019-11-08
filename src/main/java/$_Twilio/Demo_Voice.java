package $_Twilio;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

import java.net.URI;
import java.net.URISyntaxException;

public class Demo_Voice {

    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "AC3c87a4b10228aa465fd590d3d0d69468";
    public static final String AUTH_TOKEN = "f7b74ab7af415366ba1777d87dd4d025";

    public static void main(String[] args) throws URISyntaxException {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        String from = "+14344424918";
        String to = "+8615711325779";

        Call call = Call.creator(new PhoneNumber(to), new PhoneNumber(from),
                new URI("http://demo.twilio.com/docs/voice.xml")).create();

        System.out.println(call.getSid());
    }
}
