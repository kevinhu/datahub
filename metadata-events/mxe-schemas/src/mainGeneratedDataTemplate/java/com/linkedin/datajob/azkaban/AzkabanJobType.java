
package com.linkedin.datajob.azkaban;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * The various types of support azkaban jobs
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/datajob/azkaban/AzkabanJobType.pdl.")
public enum AzkabanJobType {


    /**
     * The command job type is one of the basic built-in types. It runs multiple UNIX commands using java processbuilder.
     * Upon execution, Azkaban spawns off a process to run the command.
     * 
     */
    COMMAND,

    /**
     * Runs a java program with ability to access Hadoop cluster.
     * https://azkaban.readthedocs.io/en/latest/jobTypes.html#java-job-type
     * 
     */
    HADOOP_JAVA,

    /**
     * In large part, this is the same Command type. The difference is its ability to talk to a Hadoop cluster
     * securely, via Hadoop tokens.
     * 
     */
    HADOOP_SHELL,

    /**
     * Hive type is for running Hive jobs.
     * 
     */
    HIVE,

    /**
     * Pig type is for running Pig jobs.
     * 
     */
    PIG,

    /**
     * SQL is for running Presto, mysql queries etc
     * 
     */
    SQL,

    /**
     * Glue type is for running AWS Glue job transforms.
     * 
     */
    GLUE,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.datajob.azkaban/**The various types of support azkaban jobs*/enum AzkabanJobType{/**The command job type is one of the basic built-in types. It runs multiple UNIX commands using java processbuilder.\nUpon execution, Azkaban spawns off a process to run the command.*/COMMAND/**Runs a java program with ability to access Hadoop cluster.\nhttps://azkaban.readthedocs.io/en/latest/jobTypes.html#java-job-type*/HADOOP_JAVA/**In large part, this is the same Command type. The difference is its ability to talk to a Hadoop cluster\nsecurely, via Hadoop tokens.*/HADOOP_SHELL/**Hive type is for running Hive jobs.*/HIVE/**Pig type is for running Pig jobs.*/PIG/**SQL is for running Presto, mysql queries etc*/SQL/**Glue type is for running AWS Glue job transforms.*/GLUE}", SchemaFormatType.PDL));

}
