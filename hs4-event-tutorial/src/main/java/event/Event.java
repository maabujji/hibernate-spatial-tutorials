package event;

import com.vividsolutions.jts.geom.Point;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Karel Maesen, Geovise BVBA
 *         creation-date: 6/18/12
 */
@Entity
public class Event {

        @Id
        @GeneratedValue(generator="increment")
        @GenericGenerator(name="increment", strategy = "increment")
        private Long id;

        private String title;

        private Date date;

        @Type(type="org.hibernate.spatial.GeometryType")
        private Point location;

        public Event() {
        }

        public Long getId() {
            return id;
        }

        private void setId(Long id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Point getLocation() {
            return this.location;
        }

        public void setLocation(Point location) {
            this.location = location;
        }
}