package com.ngdeveloper.Todo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


import com.ngdeveloper.Todo.dto.HotelDto;
import com.ngdeveloper.Todo.service.HotelService;

//@SpringBootTest
class TodoApplicationTests {
	
	@Autowired
	HotelService hotelService;

	@Test
	void contextLoads() {
		//set data
		HotelDto hotelDto = new HotelDto();
		hotelDto.setId(1L);
		hotelDto.setImageUrl("");
		hotelDto.setName("test");
		hotelDto.setPrice(1.0);
		
		//actual call invoke
		HotelDto hotel= hotelService.save(hotelDto);
		
		
		// verify
		//assertEq
		
		
		
		
	}

}
