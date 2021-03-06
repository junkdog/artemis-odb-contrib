package net.mostlyoriginal.api.component.graphics;

import com.artemis.Component;
import com.artemis.annotations.Fluid;

/**
 * Animations.
 *
 * @author Daan van Yperen
 * @deprecated use Animation instead.
 */
@Fluid(swallowGettersWithParameters = true)
@Deprecated
public class Anim extends Component {

    public boolean flippedX; // flip animation, should not affect rotation.

    /** Playback speed factor. */
    public float speed = 1;
    /** Animation progression */
    public float age = 0;
    /** Loop animation when the end has been reached. */
    public boolean loop = true;

    /** Animation identifier. */
    /** write asset resolver */
    public String id;
    // @todo please oh please clean this up!
    public String id2;

    public Anim(String id) {
        this.id = id;
    }

    public Anim() {
    }

    public Anim set( String id)
    {
        this.id = id;
        return this;
    }
}
