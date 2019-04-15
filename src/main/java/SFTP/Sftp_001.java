package SFTP;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

import java.util.Properties;

public class Sftp_001 {
    public static void main(String[] args) {

        String privatekey = "~/.ssh/id_rsa";
        String username = "heylee";
        String host = "localhost";
        int port = 25;

        try {
            JSch jsch = new JSch();
            jsch.addIdentity(privatekey);
            Session session = jsch.getSession(username, host, port);

            Properties config = new Properties();
            config.put("StrictHostKeyChecking", "no");
            config.put("PreferredAuthentications", "publickey");
            session.setConfig(config);

            session.connect();
            System.out.println("SFTP key session connected.");

            session.disconnect();
        } catch (JSchException e) {
            e.printStackTrace();
        }
    }
}
