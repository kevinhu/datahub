
package com.linkedin.events.metadata;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Descriptor for a change action
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/events/metadata/ChangeType.pdl.")
public enum ChangeType {


    /**
     * insert if not exists. otherwise update
     * 
     */
    UPSERT,

    /**
     * NOT SUPPORTED YET
     * insert if not exists. otherwise fail
     * 
     */
    CREATE,

    /**
     * NOT SUPPORTED YET
     * update if exists. otherwise fail
     * 
     */
    UPDATE,

    /**
     * NOT SUPPORTED YET
     * delete action
     * 
     */
    DELETE,

    /**
     * NOT SUPPORTED YET
     * patch the changes instead of full replace
     * 
     */
    PATCH,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.events.metadata/**Descriptor for a change action*/enum ChangeType{/**insert if not exists. otherwise update*/UPSERT/**NOT SUPPORTED YET\ninsert if not exists. otherwise fail*/CREATE/**NOT SUPPORTED YET\nupdate if exists. otherwise fail*/UPDATE/**NOT SUPPORTED YET\ndelete action*/DELETE/**NOT SUPPORTED YET\npatch the changes instead of full replace*/PATCH}", SchemaFormatType.PDL));

}
