package geometries;
import primitives.*;

import java.util.List;
import java.util.Objects;

/**
 *  interface that contains list of intersection points
 */
public interface Intersectable {
    List<GeoPoint> findIntersections(Ray ray);

    /**
     * static helper class geoPoint
     */
    public static class GeoPoint {
        public Geometry geometry;
        public Point3D point;

        /**
         * get geometry function
         * @return geometry
         */
        public Geometry getGeometry() {
            return geometry;
        }

        /**
         * get Point function
         * @return Point3D
         */
        public Point3D getPoint() {
            return point;
        }

        /**
         * constructor for static helper class geoPoint
         * @param geometry geometric shape
         * @param point Point3D point
         */
        public GeoPoint(Geometry geometry, Point3D point) {
            this.geometry = geometry;
            this.point = point;
        }

        /**
         * equals function for static helper class intersectable
         * @param o geoPoint
         * @return if the geoPoints are equal
         */
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GeoPoint geoPoint = (GeoPoint) o;
            return Objects.equals(geometry, geoPoint.geometry) &&
                    Objects.equals(point, geoPoint.point);
        }


    }




}
