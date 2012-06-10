package com.plusonelabs.calendar.calendar;

import com.plusonelabs.calendar.model.EventEntry;

public class CalendarEntry extends EventEntry {

	private int eventId;
	private String title;
	private long endDate;
	private int color;
	private boolean allDay;
	private boolean alarmActive;
	private boolean recurring;

	public CalendarEntry() {

	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public CalendarEntry(String title, long startDate) {
		this.title = title;
		setStartDate(startDate);
	}

	public CalendarEntry(String title, long startDate, long endDate) {
		this(title, startDate);
		this.endDate = endDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getEndDate() {
		return endDate;
	}

	public void setEndDate(long endDate) {
		this.endDate = endDate;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public boolean isAllDay() {
		return allDay;
	}

	public void setAllDay(boolean allDay) {
		this.allDay = allDay;
	}

	public int compareTo(CalendarEntry otherEntry) {
		if (isSameDay(otherEntry.getStartDate())) {
			if (allDay) {
				return -1;
			} else if (otherEntry.allDay) {
				return 1;
			}
		}
		return super.compareTo(otherEntry);
	}

	@Override
	public String toString() {
		return "EventEntry [eventId=" + eventId + ", title=" + title + ", endDate=" + endDate
				+ ", color=" + color + ", allDay=" + allDay + ", getStartDate()=" + getStartDate()
				+ "]";
	}

	public void setAlarmActive(boolean active) {
		this.alarmActive = active;
	}

	public boolean isAlarmActive() {
		return alarmActive;
	}

	public void setRecurring(boolean recurring) {
		this.recurring = recurring;
	}

	public boolean isRecurring() {
		return recurring;
	}

}
