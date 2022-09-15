package com.jinsu.design.pattern.test.chain;

import com.jinsu.design.pattern.chain.ChainPattern;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 责任链模式测试
 *
 * @author lxy-beichen
 * @date 2022年09月15日 13:24:30
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ChainPatternTest {

    @Autowired
    private ChainPattern chainPattern;

    @Test
    public void test() {
        chainPattern.exec();
    }
}
