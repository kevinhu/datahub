
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/OwnershipSource.pdl.")
public enum OwnershipSourceType {


    /**
     * Auditing system or audit logs
     * 
     */
    AUDIT,

    /**
     * Database, e.g. GRANTS table
     * 
     */
    DATABASE,

    /**
     * File system, e.g. file/directory owner
     * 
     */
    FILE_SYSTEM,

    /**
     * Issue tracking system, e.g. Jira
     * 
     */
    ISSUE_TRACKING_SYSTEM,

    /**
     * Manually provided by a user
     * 
     */
    MANUAL,

    /**
     * Other ownership-like service, e.g. Nuage, ACL service etc
     * 
     */
    SERVICE,

    /**
     * SCM system, e.g. GIT, SVN
     * 
     */
    SOURCE_CONTROL,

    /**
     * Other sources
     * 
     */
    OTHER,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common,enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}", SchemaFormatType.PDL));

}
