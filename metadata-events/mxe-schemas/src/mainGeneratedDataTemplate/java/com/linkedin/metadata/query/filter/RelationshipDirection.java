
package com.linkedin.metadata.query.filter;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * The relationship direction in a relationship filter
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/query/filter/RelationshipDirection.pdl.")
public enum RelationshipDirection {


    /**
     * The incoming edge to a source node in the graph
     * 
     */
    INCOMING,

    /**
     * The outgoing edge to a source node in the graph
     * 
     */
    OUTGOING,

    /**
     * This is used for a query where the direction of the edge does not matter
     * 
     */
    UNDIRECTED,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query.filter/**The relationship direction in a relationship filter*/enum RelationshipDirection{/**The incoming edge to a source node in the graph*/INCOMING/**The outgoing edge to a source node in the graph*/OUTGOING/**This is used for a query where the direction of the edge does not matter*/UNDIRECTED}", SchemaFormatType.PDL));

}
