package com.victorsetubal.cursomc.cursomc.exceptions;

/**
 * Created by victorcardoso on 19/05/18.
 */
public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException (String msg) {
        super(msg);
    }

    public ObjectNotFoundException (String msg, Throwable cause) {
        super(msg, cause);
    }

}
