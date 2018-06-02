package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pl.edu.agh.to.booking.hotelProvider.HotelProvider;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;



public class ListSteps {

	HotelManager hotelManager = HotelProvider.getExampleHotelManager();
	Hotel hotel = HotelProvider.getExampleHotel();

	Room bookingRoom;
	Customer bookingCustomer;
	Booking booking;
	

	@Given("there are a list of rooms with some bookings made")
	public void there_are_a_list_of_rooms_with_some_bookings_made() {
	
		
	}

	@When("^the list of bookings is displayed$")
	public void the_list_of_bookings_is_displayed() {
	
		
	}
	@Then("^each room points to a person booking it or is available$")
	public void each_room_points_to_a_person_booking_it_or_is_available() {
		
		// TU NIE WIEM CO
	
		
	}

	

	


	
}
