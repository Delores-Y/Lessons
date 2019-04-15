package Email;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

public class Mail_003 {

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
            message.setSubject("Html with Image Subject");

            // This mail has 2 part, the BODY and the embedded image
            MimeMultipart multipart = new MimeMultipart("related");

            // first part (the html)
            BodyPart messageBodyPart = new MimeBodyPart();

            // To set the actual message
            messageBodyPart.setContent("<H1>Hey man find the below image</H1><img src=\"cid:images\">>", "text/html");

            multipart.addBodyPart(messageBodyPart);

            // second part (the image)
            messageBodyPart = new MimeBodyPart();

            DataSource fds = new FileDataSource("src/main/resources/images/logo.png");
            messageBodyPart.setDataHandler(new DataHandler(fds));
            messageBodyPart.setHeader("Content-ID", "<images>");
            multipart.addBodyPart(messageBodyPart);

            message.setContent(multipart);

            // To send email
            Transport.send(message);
            System.out.println("Message send successfully!!!");
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}
