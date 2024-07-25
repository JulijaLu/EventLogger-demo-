package seb.restful.api;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import seb.restful.api.model.Event;

@SpringBootApplication
@MapperScan("seb.restful.api.mapper")
@MappedTypes(Event.class)
public class EventMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventMonitorApplication.class, args);
	}

}
