package Email;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Mail_001 {

    public static void main(String[] args) {

        String from = "wangjm@iata.org";
        String to = "chinawjm1993@gmail.com";
        String host = "localhost";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "false");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "25");

        Session session = Session.getInstance(props);

        try {
            // Creating a default Mime Message object.
            Message message = new MimeMessage(session);

            // To set header filed
            message.setFrom(new InternetAddress(from));

            // To set header filed
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

            // To set subject to header filed
            message.setSubject("Test Subject");

            // To set the actual message
            message.setText("Hello, this is sample for to check send email using JavaMailAPI ");

            // To send email
            Transport.send(message);
            System.out.println("Message send successfully!!!");
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}
