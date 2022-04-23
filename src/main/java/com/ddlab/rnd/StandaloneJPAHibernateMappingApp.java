package com.ddlab.rnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ddlab.rnd.many2manyB.TestMany2ManyBiDirectional;

//import com.ddlab.rnd.many2manyB.TestMany2ManyBiDirectional;
//import com.ddlab.rnd.one2manyU.TestOne2ManyUniDirectional;

//import com.ddlab.rnd.one2oneB.TestOne2OneBiDirectional;

//import com.ddlab.rnd.many2manyB.TestMany2ManyBiDirectional;
//import com.ddlab.rnd.many2manyU.TestMany2ManyUniDirectional;
//import com.ddlab.rnd.one2manyB.TestOne2ManyBiDirectional;
//import com.ddlab.rnd.one2manyU.TestOne2ManyUniDirectional;
//import com.ddlab.rnd.one2oneB.TestOne2OneBiDirectional;
//import com.ddlab.rnd.one2oneU.TestOne2OneUniDirectional;
//import com.ddlab.rnd.one2oneU.TestOne2OneUniDirectional;

@SpringBootApplication
public class StandaloneJPAHibernateMappingApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(StandaloneJPAHibernateMappingApp.class, args);
		
//		TestOne2OneUniDirectional.saveInfo(applicationContext);
//		TestOne2OneBiDirectional.saveInfo(applicationContext);
		
		// One To Many
//		TestOne2ManyUniDirectional.saveInfo(applicationContext);
//		TestOne2ManyBiDirectional.saveInfo(applicationContext);
		
		// Many to Many
//		TestMany2ManyUniDirectional.saveInfo(applicationContext);
		TestMany2ManyBiDirectional.saveInfo(applicationContext);
		
	}

}
