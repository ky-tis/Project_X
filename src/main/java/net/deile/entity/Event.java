package net.deile.entity;

import java.sql.Date;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Event {

	@Id
	private long event_id;

	private String title;

	private String details;

	private String address;

	private String fromDate;

	private String toDate;

	private Integer max_participant;

	private Integer participant;

	private String tentative_participant;

	private Boolean public_flag;

}
