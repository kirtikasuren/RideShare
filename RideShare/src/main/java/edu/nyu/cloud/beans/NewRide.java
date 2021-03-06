/**
 * 
 */
package edu.nyu.cloud.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * This class represensts a new Ride that has been create by a user for sharing.
 * 
 * @author rahulkhanna Date:05-Apr-2016
 */
public class NewRide implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;
	private String requester;
	private String source;
	private String destination;
	private Date timeOfTrip;
	private Route selectedRoute;

	/**
	 * Constructor
	 * 
	 * @param requester
	 * @param source
	 * @param destination
	 * @param timeOfTrip
	 * @param possibleRoutes
	 */
	public NewRide(String requester, String source, String destination, Date timeOfTrip, Route selectedRoute) {
		super();
		this.requester = requester;
		this.source = source;
		this.destination = destination;
		this.timeOfTrip = timeOfTrip;
		this.selectedRoute = selectedRoute;
	}

	public String getRequester() {
		return requester;
	}

	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}

	public Date getTimeOfTrip() {
		return timeOfTrip;
	}

	/**
	 * @return the selectedRoute
	 */
	public Route getSelectedRoute() {
		return selectedRoute;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	public void setRequester(String requester) {
		this.requester = requester;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setTimeOfTrip(Date timeOfTrip) {
		this.timeOfTrip = timeOfTrip;
	}

	public void setSelectedRoute(Route selectedRoute) {
		this.selectedRoute = selectedRoute;
	}

}
