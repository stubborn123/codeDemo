package com.example.zp_redis_2;

import com.example.zp_redis_2.config.RedisConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.RedisTemplate;


import javax.annotation.Resource;

@SpringBootTest
class ZpRedis2ApplicationTests {

//    @Resource
//    private RedisTemplate redisTemplate;

    @Autowired
    //这里通过@qualifier 来指定注入的bean
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;

//    RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        // redisTemplate 操作不同的数据类型，api和我们的指令是一样的
        // opsForValue 操作字符串 类似String
        // opsForList 操作List 类似List
        // opsForHah

        // 除了基本的操作，我们常用的方法都可以直接通过redisTemplate操作，比如事务和基本的CRUD

        // 获取连接对象
        //RedisConnection connection = redisTemplate.getConnectionFactory().getConnection();
        //connection.flushDb();
        //connection.flushAll();

        redisTemplate.opsForValue().set("mykey112","zhangpeng111");
        System.out.println(redisTemplate.opsForValue().get("mykey112"));
        System.out.println(redisTemplate.opsForValue().get("mykey112"));
    }


}
