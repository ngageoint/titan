package com.thinkaurelius.titan.graphdb.edgetypes;

import com.thinkaurelius.titan.core.TitanType;
import com.thinkaurelius.titan.graphdb.vertices.InternalTitanVertex;

public interface InternalTitanType extends TitanType, InternalTitanVertex {
	
	public EdgeTypeDefinition getDefinition();

    public boolean isFunctionalLocking();


    /**
     * Checks whether this type is hidden.
     * If a type is hidden, its relations are not included in edge retrieval operations. Types used internally
     * are hidden so they don't interfere with user types.
     *
     * @return true, if the type is hidden, else false.
     * @see com.thinkaurelius.titan.graphdb.edgetypes.system.SystemType
     */
    public boolean isHidden();
	
}
