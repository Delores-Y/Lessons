package $_Redis;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Connect {

    public static void main(String[] args) {
        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis("localhost");
//        jedis.auth("heylee");
        System.out.println("Connection to server successfully");
        //check whether server is running or not
        System.out.println("Server is running: "+jedis.ping());

        //set the data in redis string
        jedis.set("name", "Redis tutorial");
        // Get the stored data and print it
        System.out.println("Stored string in redis:: "+ jedis.get("name"));

        System.out.println("************************");

        //store data in redis list
        jedis.lpush("tutorial-list", "Redis");
        jedis.lpush("tutorial-list", "Mongodb");
        jedis.lpush("tutorial-list", "Mysql");
        // Get the stored data and print it
        List<String> list = jedis.lrange("tutorial-list", 0 ,5);

        System.out.println("************************");

        for(int i = 0; i<list.size(); i++) {
            System.out.println("Stored string in redis:: "+list.get(i));
        }


        System.out.println("************************");

        // Get the stored data and print it
        Set<String> set = jedis.keys("*");
        Iterator it1 = set.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        };

        System.out.println("************************");

        for (String value : set) {
            System.out.println(value);
        }


    }
}