
package com.linkedin.ml.metadata;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Model endpoint statuses
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/DeploymentStatus.pdl.")
public enum DeploymentStatus {


    /**
     * Deployments out of service.
     * 
     */
    OUT_OF_SERVICE,

    /**
     * Deployments being created.
     * 
     */
    CREATING,

    /**
     * Deployments being updated.
     * 
     */
    UPDATING,

    /**
     * Deployments being reverted to a previous version.
     * 
     */
    ROLLING_BACK,

    /**
     * Deployments that are active.
     * 
     */
    IN_SERVICE,

    /**
     * Deployments being deleted.
     * 
     */
    DELETING,

    /**
     * Deployments with an error state.
     * 
     */
    FAILED,

    /**
     * Deployments with unknown/unmappable state.
     * 
     */
    UNKNOWN,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Model endpoint statuses*/enum DeploymentStatus{/**Deployments out of service.*/OUT_OF_SERVICE/**Deployments being created.*/CREATING/**Deployments being updated.*/UPDATING/**Deployments being reverted to a previous version.*/ROLLING_BACK/**Deployments that are active.*/IN_SERVICE/**Deployments being deleted.*/DELETING/**Deployments with an error state.*/FAILED/**Deployments with unknown/unmappable state.*/UNKNOWN}", SchemaFormatType.PDL));

}
