package mail;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendGmail {

    private static final String USERNAME = "maibaokhanh2610@gmail.com";
    private static final String PASSWORD = "baokhanh99@@";

    public void sendEmail(String to, String subject, String content,String cc) {
        try {
            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");
            Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(USERNAME, PASSWORD);
                }
            });
            Message message = new MimeMessage(session);
            message.setHeader("Content-Type", "text/plain; charset=UTF-8");
            message.setFrom(new InternetAddress(to));
//            message.setRecipients(Message.RecipientType.TO,
//                    InternetAddress.parse(received));
//            message.setRecipients(Message.RecipientType.CC,
//                    InternetAddress.parse(cc));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));
            message.setRecipients(Message.RecipientType.CC,
                    InternetAddress.parse(cc));
            message.setSubject(subject);
            message.setText(content);
            message.setContent(content, "text/html");
            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}
