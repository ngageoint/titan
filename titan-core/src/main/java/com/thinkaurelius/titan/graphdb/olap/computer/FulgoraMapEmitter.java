package com.thinkaurelius.titan.graphdb.olap.computer;

import com.tinkerpop.gremlin.process.computer.MapReduce;
import com.tinkerpop.gremlin.tinkergraph.process.computer.TinkerMapEmitter;

/**
 * @author Matthias Broecheler (me@matthiasb.com)
 */
public class FulgoraMapEmitter<K,V> extends TinkerMapEmitter<K, V> {

    public FulgoraMapEmitter(boolean doReduce) {
        super(doReduce);
    }

    protected void complete(final MapReduce<K, V, ?, ?, ?> mapReduce) {
        super.complete(mapReduce);
    }

}