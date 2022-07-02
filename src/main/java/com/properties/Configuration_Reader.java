package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws IOException {

		File f = new File(
				"C:\\Users\\SyedAli\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\properties\\Adactin.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String getUrl() throws IOException {

		String url = p.getProperty("url");

		return url;

	}

	public String getUsername() throws IOException {

		String username = p.getProperty("username");

		return username;

	}

	public String getPassword() throws IOException {

		String password = p.getProperty("password");

		return password;

	}

	public String getLocation() {

		String location = p.getProperty("location");

		return location;

	}

	public String getHotels() {

		String hotels = p.getProperty("hotels");

		return hotels;

	}

	public String getRoom_type() {

		String room_type = p.getProperty("room_type");

		return room_type;

	}

	public String getRoom_nos() {

		String room_nos = p.getProperty("room_nos");

		return room_nos;

	}

	public String getDatepick_in() {

		String datepick_in = p.getProperty("datepick_in");

		return datepick_in;

	}

	public String getDatepick_out() {

		String datepick_out = p.getProperty("datepick_out");

		return datepick_out;

	}

	public String getAdult_room() {

		String adult_room = p.getProperty("adult_room");

		return adult_room;

	}

	public String getChild_room() {

		String child_room = p.getProperty("child_room");

		return child_room;

	}

	public String getFirst_name() {

		String first_name = p.getProperty("first_name");

		return first_name;

	}

	public String getLast_name() {

		String last_name = p.getProperty("last_name");

		return last_name;

	}

	public String getAddress() {

		String address = p.getProperty("address");

		return address;

	}

	public String getcc_num() {

		String cc_num = p.getProperty("cc_num");

		return cc_num;

	}

	public String getcc_type() {

		String cc_type = p.getProperty("cc_type");

		return cc_type;

	}

	public String getcc_exp_month() {

		String cc_exp_month = p.getProperty("cc_exp_month");

		return cc_exp_month;

	}

	public String getcc_exp_year() {

		String cc_exp_year = p.getProperty("cc_exp_year");

		return cc_exp_year;

	}

	public String getcc_cvv() {

		String cc_cvv = p.getProperty("cc_cvv");

		return cc_cvv;

	}

	public String getScreenshot() {

		String screenshot = p.getProperty("screenshot");

		return screenshot;

	}

}
