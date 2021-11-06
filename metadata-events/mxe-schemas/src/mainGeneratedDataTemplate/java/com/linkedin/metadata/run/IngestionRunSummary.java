
package com.linkedin.metadata.run;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/run/IngestionRunSummary.pdl.")
public class IngestionRunSummary
    extends RecordTemplate
{

    private final static IngestionRunSummary.Fields _fields = new IngestionRunSummary.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.run,record IngestionRunSummary{runId:string,timestamp:long,rows:long}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_RunId = SCHEMA.getField("runId");
    private final static RecordDataSchema.Field FIELD_Timestamp = SCHEMA.getField("timestamp");
    private final static RecordDataSchema.Field FIELD_Rows = SCHEMA.getField("rows");

    public IngestionRunSummary() {
        super(new DataMap(4, 0.75F), SCHEMA);
    }

    public IngestionRunSummary(DataMap data) {
        super(data, SCHEMA);
    }

    public static IngestionRunSummary.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for runId
     * 
     * @see IngestionRunSummary.Fields#runId
     */
    public boolean hasRunId() {
        return contains(FIELD_RunId);
    }

    /**
     * Remover for runId
     * 
     * @see IngestionRunSummary.Fields#runId
     */
    public void removeRunId() {
        remove(FIELD_RunId);
    }

    /**
     * Getter for runId
     * 
     * @see IngestionRunSummary.Fields#runId
     */
    public String getRunId(GetMode mode) {
        return obtainDirect(FIELD_RunId, String.class, mode);
    }

    /**
     * Getter for runId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IngestionRunSummary.Fields#runId
     */
    @Nonnull
    public String getRunId() {
        return obtainDirect(FIELD_RunId, String.class, GetMode.STRICT);
    }

    /**
     * Setter for runId
     * 
     * @see IngestionRunSummary.Fields#runId
     */
    public IngestionRunSummary setRunId(String value, SetMode mode) {
        putDirect(FIELD_RunId, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for runId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IngestionRunSummary.Fields#runId
     */
    public IngestionRunSummary setRunId(
        @Nonnull
        String value) {
        putDirect(FIELD_RunId, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for timestamp
     * 
     * @see IngestionRunSummary.Fields#timestamp
     */
    public boolean hasTimestamp() {
        return contains(FIELD_Timestamp);
    }

    /**
     * Remover for timestamp
     * 
     * @see IngestionRunSummary.Fields#timestamp
     */
    public void removeTimestamp() {
        remove(FIELD_Timestamp);
    }

    /**
     * Getter for timestamp
     * 
     * @see IngestionRunSummary.Fields#timestamp
     */
    public Long getTimestamp(GetMode mode) {
        return obtainDirect(FIELD_Timestamp, Long.class, mode);
    }

    /**
     * Getter for timestamp
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IngestionRunSummary.Fields#timestamp
     */
    @Nonnull
    public Long getTimestamp() {
        return obtainDirect(FIELD_Timestamp, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for timestamp
     * 
     * @see IngestionRunSummary.Fields#timestamp
     */
    public IngestionRunSummary setTimestamp(Long value, SetMode mode) {
        putDirect(FIELD_Timestamp, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for timestamp
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IngestionRunSummary.Fields#timestamp
     */
    public IngestionRunSummary setTimestamp(
        @Nonnull
        Long value) {
        putDirect(FIELD_Timestamp, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for timestamp
     * 
     * @see IngestionRunSummary.Fields#timestamp
     */
    public IngestionRunSummary setTimestamp(long value) {
        putDirect(FIELD_Timestamp, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for rows
     * 
     * @see IngestionRunSummary.Fields#rows
     */
    public boolean hasRows() {
        return contains(FIELD_Rows);
    }

    /**
     * Remover for rows
     * 
     * @see IngestionRunSummary.Fields#rows
     */
    public void removeRows() {
        remove(FIELD_Rows);
    }

    /**
     * Getter for rows
     * 
     * @see IngestionRunSummary.Fields#rows
     */
    public Long getRows(GetMode mode) {
        return obtainDirect(FIELD_Rows, Long.class, mode);
    }

    /**
     * Getter for rows
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IngestionRunSummary.Fields#rows
     */
    @Nonnull
    public Long getRows() {
        return obtainDirect(FIELD_Rows, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for rows
     * 
     * @see IngestionRunSummary.Fields#rows
     */
    public IngestionRunSummary setRows(Long value, SetMode mode) {
        putDirect(FIELD_Rows, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for rows
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IngestionRunSummary.Fields#rows
     */
    public IngestionRunSummary setRows(
        @Nonnull
        Long value) {
        putDirect(FIELD_Rows, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for rows
     * 
     * @see IngestionRunSummary.Fields#rows
     */
    public IngestionRunSummary setRows(long value) {
        putDirect(FIELD_Rows, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public IngestionRunSummary clone()
        throws CloneNotSupportedException
    {
        return ((IngestionRunSummary) super.clone());
    }

    @Override
    public IngestionRunSummary copy()
        throws CloneNotSupportedException
    {
        return ((IngestionRunSummary) super.copy());
    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        public PathSpec runId() {
            return new PathSpec(getPathComponents(), "runId");
        }

        public PathSpec timestamp() {
            return new PathSpec(getPathComponents(), "timestamp");
        }

        public PathSpec rows() {
            return new PathSpec(getPathComponents(), "rows");
        }

    }

}
