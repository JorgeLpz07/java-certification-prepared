/*******************************************************************************
 * Copyright (C) 25 mar 2021 jrglo
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/

package labs.pm.data;

import java.io.Serializable;

/**
 * @version 1.0
 * @author Jorge Augusto Lopez Ortega
 */

public class Review implements Comparable<Review>, Serializable {

	private Rating rating;
	private String comments;

	public Review(Rating rating, String comments) {
		this.rating = rating;
		this.comments = comments;
	}

	public Rating getRating() {
		return rating;
	}

	public String getComments() {
		return comments;
	}

	@Override
	public String toString() {
		return "Review [rating=" + rating + ", comments=" + comments + "]";
	}

	@Override
	public int compareTo(Review other) {
		return other.rating.ordinal() - this.rating.ordinal();
	}

}
