
package com.linkedin.datajob;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Job statuses
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/datajob/JobStatus.pdl.")
public enum JobStatus {


    /**
     * Jobs being initialized.
     * 
     */
    STARTING,

    /**
     * Jobs currently running.
     * 
     */
    IN_PROGRESS,

    /**
     * Jobs being stopped.
     * 
     */
    STOPPING,

    /**
     * Jobs that have stopped.
     * 
     */
    STOPPED,

    /**
     * Jobs with successful completion.
     * 
     */
    COMPLETED,

    /**
     * Jobs that have failed.
     * 
     */
    FAILED,

    /**
     * Jobs with unknown status (either unmappable or unavailable)
     * 
     */
    UNKNOWN,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.datajob/**Job statuses*/enum JobStatus{/**Jobs being initialized.*/STARTING/**Jobs currently running.*/IN_PROGRESS/**Jobs being stopped.*/STOPPING/**Jobs that have stopped.*/STOPPED/**Jobs with successful completion.*/COMPLETED/**Jobs that have failed.*/FAILED/**Jobs with unknown status (either unmappable or unavailable)*/UNKNOWN}", SchemaFormatType.PDL));

}
