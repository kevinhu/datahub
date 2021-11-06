
package com.linkedin.ml.metadata;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;


/**
 * This section is intended to demonstrate the ethical considerations that went into MLModel development, surfacing ethical challenges and solutions to stakeholders.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/EthicalConsiderations.pdl.")
public class EthicalConsiderations
    extends RecordTemplate
{

    private final static EthicalConsiderations.Fields _fields = new EthicalConsiderations.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**This section is intended to demonstrate the ethical considerations that went into MLModel development, surfacing ethical challenges and solutions to stakeholders.*/@Aspect.name=\"mlModelEthicalConsiderations\"record EthicalConsiderations{/**Does the MLModel use any sensitive data (e.g., protected classes)?*/data:optional array[string]/** Is the MLModel intended to inform decisions about matters central to human life or flourishing \u2013 e.g., health or safety? Or could it be used in such a way?*/humanLife:optional array[string]/**What risk mitigation strategies were used during MLModel development?*/mitigations:optional array[string]/**What risks may be present in MLModel usage? Try to identify the potential recipients, likelihood, and magnitude of harms. If these cannot be determined, note that they were considered but remain unknown.*/risksAndHarms:optional array[string]/**Are there any known MLModel use cases that are especially fraught? This may connect directly to the intended use section*/useCases:optional array[string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Data = SCHEMA.getField("data");
    private final static RecordDataSchema.Field FIELD_HumanLife = SCHEMA.getField("humanLife");
    private final static RecordDataSchema.Field FIELD_Mitigations = SCHEMA.getField("mitigations");
    private final static RecordDataSchema.Field FIELD_RisksAndHarms = SCHEMA.getField("risksAndHarms");
    private final static RecordDataSchema.Field FIELD_UseCases = SCHEMA.getField("useCases");

    public EthicalConsiderations() {
        super(new DataMap(7, 0.75F), SCHEMA, 7);
    }

    public EthicalConsiderations(DataMap data) {
        super(data, SCHEMA);
    }

    public static EthicalConsiderations.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for data
     * 
     * @see EthicalConsiderations.Fields#data
     */
    public boolean hasData() {
        return contains(FIELD_Data);
    }

    /**
     * Remover for data
     * 
     * @see EthicalConsiderations.Fields#data
     */
    public void removeData() {
        remove(FIELD_Data);
    }

    /**
     * Getter for data
     * 
     * @see EthicalConsiderations.Fields#data
     */
    public StringArray getData(GetMode mode) {
        return obtainWrapped(FIELD_Data, StringArray.class, mode);
    }

    /**
     * Getter for data
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EthicalConsiderations.Fields#data
     */
    @Nullable
    public StringArray getData() {
        return obtainWrapped(FIELD_Data, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for data
     * 
     * @see EthicalConsiderations.Fields#data
     */
    public EthicalConsiderations setData(StringArray value, SetMode mode) {
        putWrapped(FIELD_Data, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for data
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EthicalConsiderations.Fields#data
     */
    public EthicalConsiderations setData(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Data, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for humanLife
     * 
     * @see EthicalConsiderations.Fields#humanLife
     */
    public boolean hasHumanLife() {
        return contains(FIELD_HumanLife);
    }

    /**
     * Remover for humanLife
     * 
     * @see EthicalConsiderations.Fields#humanLife
     */
    public void removeHumanLife() {
        remove(FIELD_HumanLife);
    }

    /**
     * Getter for humanLife
     * 
     * @see EthicalConsiderations.Fields#humanLife
     */
    public StringArray getHumanLife(GetMode mode) {
        return obtainWrapped(FIELD_HumanLife, StringArray.class, mode);
    }

    /**
     * Getter for humanLife
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EthicalConsiderations.Fields#humanLife
     */
    @Nullable
    public StringArray getHumanLife() {
        return obtainWrapped(FIELD_HumanLife, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for humanLife
     * 
     * @see EthicalConsiderations.Fields#humanLife
     */
    public EthicalConsiderations setHumanLife(StringArray value, SetMode mode) {
        putWrapped(FIELD_HumanLife, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for humanLife
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EthicalConsiderations.Fields#humanLife
     */
    public EthicalConsiderations setHumanLife(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_HumanLife, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for mitigations
     * 
     * @see EthicalConsiderations.Fields#mitigations
     */
    public boolean hasMitigations() {
        return contains(FIELD_Mitigations);
    }

    /**
     * Remover for mitigations
     * 
     * @see EthicalConsiderations.Fields#mitigations
     */
    public void removeMitigations() {
        remove(FIELD_Mitigations);
    }

    /**
     * Getter for mitigations
     * 
     * @see EthicalConsiderations.Fields#mitigations
     */
    public StringArray getMitigations(GetMode mode) {
        return obtainWrapped(FIELD_Mitigations, StringArray.class, mode);
    }

    /**
     * Getter for mitigations
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EthicalConsiderations.Fields#mitigations
     */
    @Nullable
    public StringArray getMitigations() {
        return obtainWrapped(FIELD_Mitigations, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for mitigations
     * 
     * @see EthicalConsiderations.Fields#mitigations
     */
    public EthicalConsiderations setMitigations(StringArray value, SetMode mode) {
        putWrapped(FIELD_Mitigations, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for mitigations
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EthicalConsiderations.Fields#mitigations
     */
    public EthicalConsiderations setMitigations(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Mitigations, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for risksAndHarms
     * 
     * @see EthicalConsiderations.Fields#risksAndHarms
     */
    public boolean hasRisksAndHarms() {
        return contains(FIELD_RisksAndHarms);
    }

    /**
     * Remover for risksAndHarms
     * 
     * @see EthicalConsiderations.Fields#risksAndHarms
     */
    public void removeRisksAndHarms() {
        remove(FIELD_RisksAndHarms);
    }

    /**
     * Getter for risksAndHarms
     * 
     * @see EthicalConsiderations.Fields#risksAndHarms
     */
    public StringArray getRisksAndHarms(GetMode mode) {
        return obtainWrapped(FIELD_RisksAndHarms, StringArray.class, mode);
    }

    /**
     * Getter for risksAndHarms
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EthicalConsiderations.Fields#risksAndHarms
     */
    @Nullable
    public StringArray getRisksAndHarms() {
        return obtainWrapped(FIELD_RisksAndHarms, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for risksAndHarms
     * 
     * @see EthicalConsiderations.Fields#risksAndHarms
     */
    public EthicalConsiderations setRisksAndHarms(StringArray value, SetMode mode) {
        putWrapped(FIELD_RisksAndHarms, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for risksAndHarms
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EthicalConsiderations.Fields#risksAndHarms
     */
    public EthicalConsiderations setRisksAndHarms(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_RisksAndHarms, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for useCases
     * 
     * @see EthicalConsiderations.Fields#useCases
     */
    public boolean hasUseCases() {
        return contains(FIELD_UseCases);
    }

    /**
     * Remover for useCases
     * 
     * @see EthicalConsiderations.Fields#useCases
     */
    public void removeUseCases() {
        remove(FIELD_UseCases);
    }

    /**
     * Getter for useCases
     * 
     * @see EthicalConsiderations.Fields#useCases
     */
    public StringArray getUseCases(GetMode mode) {
        return obtainWrapped(FIELD_UseCases, StringArray.class, mode);
    }

    /**
     * Getter for useCases
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EthicalConsiderations.Fields#useCases
     */
    @Nullable
    public StringArray getUseCases() {
        return obtainWrapped(FIELD_UseCases, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for useCases
     * 
     * @see EthicalConsiderations.Fields#useCases
     */
    public EthicalConsiderations setUseCases(StringArray value, SetMode mode) {
        putWrapped(FIELD_UseCases, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for useCases
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EthicalConsiderations.Fields#useCases
     */
    public EthicalConsiderations setUseCases(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_UseCases, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public EthicalConsiderations clone()
        throws CloneNotSupportedException
    {
        return ((EthicalConsiderations) super.clone());
    }

    @Override
    public EthicalConsiderations copy()
        throws CloneNotSupportedException
    {
        return ((EthicalConsiderations) super.copy());
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

        /**
         * Does the MLModel use any sensitive data (e.g., protected classes)?
         * 
         */
        public PathSpec data() {
            return new PathSpec(getPathComponents(), "data");
        }

        /**
         * Does the MLModel use any sensitive data (e.g., protected classes)?
         * 
         */
        public PathSpec data(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "data");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         *  Is the MLModel intended to inform decisions about matters central to human life or flourishing – e.g., health or safety? Or could it be used in such a way?
         * 
         */
        public PathSpec humanLife() {
            return new PathSpec(getPathComponents(), "humanLife");
        }

        /**
         *  Is the MLModel intended to inform decisions about matters central to human life or flourishing – e.g., health or safety? Or could it be used in such a way?
         * 
         */
        public PathSpec humanLife(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "humanLife");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * What risk mitigation strategies were used during MLModel development?
         * 
         */
        public PathSpec mitigations() {
            return new PathSpec(getPathComponents(), "mitigations");
        }

        /**
         * What risk mitigation strategies were used during MLModel development?
         * 
         */
        public PathSpec mitigations(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "mitigations");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * What risks may be present in MLModel usage? Try to identify the potential recipients, likelihood, and magnitude of harms. If these cannot be determined, note that they were considered but remain unknown.
         * 
         */
        public PathSpec risksAndHarms() {
            return new PathSpec(getPathComponents(), "risksAndHarms");
        }

        /**
         * What risks may be present in MLModel usage? Try to identify the potential recipients, likelihood, and magnitude of harms. If these cannot be determined, note that they were considered but remain unknown.
         * 
         */
        public PathSpec risksAndHarms(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "risksAndHarms");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Are there any known MLModel use cases that are especially fraught? This may connect directly to the intended use section
         * 
         */
        public PathSpec useCases() {
            return new PathSpec(getPathComponents(), "useCases");
        }

        /**
         * Are there any known MLModel use cases that are especially fraught? This may connect directly to the intended use section
         * 
         */
        public PathSpec useCases(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "useCases");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

}
