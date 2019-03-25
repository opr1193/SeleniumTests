package com.infarmbureau.incorporated.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = { "/TestsSpringContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
abstract public class IntegrationIncTestWithSpring extends IfbIncorporatedTest {


}
