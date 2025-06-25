package com.amattosmoraes.course.services.exceptions;

public class ResourcesNotFounfExceptions extends RuntimeException {

	private static final long serialVersionUID = 1L;

    public ResourcesNotFounfExceptions(Object id){
        super("Resource Not Found. Id " + id);
    }

}
