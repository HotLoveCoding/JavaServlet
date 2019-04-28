package com.itxigua.redis;


import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ResourceBundle;

/**
 * @author cymstart
 * @create 2019-04-28 9:08
 */
public class JedisUtils {
    //定义全局变量
    private static JedisPool pool ;

    static{
        ResourceBundle bundle = ResourceBundle.getBundle("jedis");
        String host = bundle.getString("host");

        int maxTotal = Integer.parseInt(bundle.getString("maxTotal"));
        int maxWaitMillis = Integer.parseInt(bundle.getString("maxWaitMillis"));

      int port = Integer.parseInt(bundle.getString("port"));

        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(maxTotal);
        config.setMaxWaitMillis(maxWaitMillis);

       pool = new JedisPool(config, host, port);
    }

    public static Jedis getJedis() {
        return pool.getResource();
    }
}
