package com.itxigua.test;

import com.itxigua.redis.JedisUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @author shkstart
 * @create 2019-04-28 9:36
 */
public class TestUtil {

    @Test
    public void testConnect() {
        Jedis jedis = JedisUtils.getJedis();
        jedis.set("name","xiaoming");
        jedis.set("age","20");

        System.out.println(jedis.get("name"));
        System.out.println(jedis.get("age"));

    }
}
