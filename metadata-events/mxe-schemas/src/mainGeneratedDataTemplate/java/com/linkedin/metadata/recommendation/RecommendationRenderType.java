
package com.linkedin.metadata.recommendation;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Enum that defines how the modules should be rendered.
 * There should be two frontend implementation of large and small modules per type.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/recommendation/RecommendationRenderType.pdl.")
public enum RecommendationRenderType {


    /**
     * Simple list of entities
     * 
     */
    ENTITY_NAME_LIST,

    /**
     * List of platforms to search
     * 
     */
    PLATFORM_SEARCH_LIST,

    /**
     * Tag search list
     * 
     */
    TAG_SEARCH_LIST,

    /**
     * Glossary term search list
     * 
     */
    GLOSSARY_TERM_SEARCH_LIST,

    /**
     * A list of recommended searches
     * 
     */
    SEARCH_QUERY_LIST,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.recommendation/**Enum that defines how the modules should be rendered.\nThere should be two frontend implementation of large and small modules per type.*/enum RecommendationRenderType{/**Simple list of entities*/ENTITY_NAME_LIST/**List of platforms to search*/PLATFORM_SEARCH_LIST/**Tag search list*/TAG_SEARCH_LIST/**Glossary term search list*/GLOSSARY_TERM_SEARCH_LIST/**A list of recommended searches*/SEARCH_QUERY_LIST}", SchemaFormatType.PDL));

}
