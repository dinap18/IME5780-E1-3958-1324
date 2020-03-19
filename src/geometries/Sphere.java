package geometries;

import primitives.Point3D;
import primitives.Vector;

/**
 * Class Sphere
 */
public class Sphere extends RadialGeometry
{
    /**
     *fields (center)
     */
    Point3D _center;

    /**
     * Constructor of Sphere
     * @param _radius
     * @param _center
     */
    public Sphere(double _radius, Point3D _center)
    {
        super(_radius);
        this._center = _center;
    }

    /**
     * GetNormal Function
     * @param p
     * @return null
     */
    @Override
    public Vector getNormal(Point3D p)
    {
        return null;
    }

    /**
     * GetCenter function
     * @return center
     */
    public Point3D get_center() {
        return _center;
    }

    @Override
    public String toString() {
        return super.toString()+
                " center" + _center ;
    }
}
