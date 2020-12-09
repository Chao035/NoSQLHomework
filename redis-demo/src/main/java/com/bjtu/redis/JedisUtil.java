package com.bjtu.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Map;
import java.util.Set;

public class JedisUtil {
    private static JedisPool jedisPool = JedisInstance.getInstance();
    private static Jedis jedis = jedisPool.getResource();

    public JedisUtil() {
    }

    public static Jedis getJedis() {
        if (jedis == null)
            jedis = jedisPool.getResource();
        return jedis;
    }

    public void incr(String key) throws Exception {
        jedis.incr(key);
    }

    public void incr(String key, int num) throws Exception {
        jedis.incrBy(key, num);
    }

    public String get(String key) throws Exception {
        return jedis.get(key);
    }

    public void addLog(long date) throws Exception {
        jedis.zadd("date", date, String.valueOf(date));
    }

    public long getFreq(long num) throws  Exception {
        return jedis.zcount("date", System.currentTimeMillis() - num, System.currentTimeMillis());
    }

    public void clear() throws Exception {
        jedis.del("count");
        jedis.del("date");
    }
}
