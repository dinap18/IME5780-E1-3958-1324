package scene;
import elements.*;
import geometries.*;
import primitives.*;

/**
 * class scene
 */
public class Scene {

    final String _name;
    final Geometries _geometries = new Geometries(); ;

    Color _background;
     Camera _camera;
     double _distance;
     AmbientLight _ambientLight;


    /**
     * get ambient light function
     * @return the scene's ambient light
     */
    public AmbientLight getAmbientLight() {
        return _ambientLight;
    }

    /**
     * get camera function
     * @return the scene's camera
     */
    public Camera getCamera() {
        return _camera;
    }

    /**
     * get geometries function
     * @return the scene's geometries
     */
    public Geometries getGeometries() {
        return _geometries;
    }

    /**
     * get distance function
     * @return the distance between the camera and the view plane
     */
    public double getDistance() {
        return _distance;
    }

    /**
     * constructor
     * @param _sceneName the scene's name
     */
    public Scene(String _sceneName){
        this._name= _sceneName;
    }

    /**
     * get background color function
     * @return the scene's background color
     */
    public Color getBackground() {
        return this._background;
    }

    /**
     * adds geometries to the scene's list of geometries
     * @param intersectables intersectable geometries to be added to the scene
     */
    public void addGeometries(Intersectable... intersectables) {
        for (Intersectable i:intersectables ) {
            _geometries.add(i);
        }
    }

    /**
     * removes geometries to the scene's list of geometries
     * @param intersectables intersectable geometries to be removed from the scene
     */
    public void removeGeometries(Intersectable... intersectables) {
        for (Intersectable i:intersectables ) {
            _geometries.remove(i);
        }
    }

    /**
     * set background color function
     * @param _background color
     */
    public void set_background(Color _background) {
        this._background = _background;
    }

    /**
     * set camera function
     * @param _camera camera
     */
    public void set_camera(Camera _camera) {
        this._camera = _camera;
    }

    /**
     * set distance function
     * @param _distance double
     */
    public void set_distance(double _distance) {
        this._distance = _distance;
    }

    /**
     * set ambient light function
     * @param _ambientLight ambient light
     */
    public void set_ambientLight(AmbientLight _ambientLight) {
        this._ambientLight = _ambientLight;
    }

    /**
     * class scene builder
     */
    public static class  SceneBuilder
    {
        private  String _name;
        private Color _background;
        private  Camera _camera;
        private  double _distance;
        private  AmbientLight _ambientLight;

        /**
         * constructor
         * @param _name the scene's name
         */
        public  SceneBuilder(String _name) {
            this._name = _name;
        }

        /**
         * adds a background to the scene
         * @param _background background color
         * @return scene builder
         */
        public SceneBuilder addBackground(Color _background) {
            this._background = _background;
            return this;
        }

        /**
         * adds a camera to the scene
         * @param _camera camera
         * @return scene builder
         */
        public SceneBuilder addCamera(Camera _camera) {
            this._camera = _camera;
            return this;
        }

        /**
         * adds the camera-view plane distance to the scene
         * @param _distance double
         * @return scene builder
         */
        public SceneBuilder addDistance(double _distance) {
            this._distance = _distance;
            return this;
        }

        /**
         * adds ambient light to the scene
         * @param _ambientLight ambient light
         * @return scene builder
         */
        public SceneBuilder addAmbientLight(AmbientLight _ambientLight) {
            this._ambientLight = _ambientLight;
            return this;
        }

        /**
         * builds the scene
         * @return a built scene
         */
        public Scene build()
        {
            Scene scene = new Scene(_name);
            scene._camera= _camera;
            scene._distance = _distance;
            scene._background = _background;
            scene._ambientLight =_ambientLight;
            return scene;
        }

    }

}
