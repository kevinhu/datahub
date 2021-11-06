
package com.linkedin.dataset;

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
 * Stats corresponding to fields in a dataset
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetFieldProfile.pdl.")
public class DatasetFieldProfile
    extends RecordTemplate
{

    private final static DatasetFieldProfile.Fields _fields = new DatasetFieldProfile.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Stats corresponding to fields in a dataset*/record DatasetFieldProfile{fieldPath:string,uniqueCount:optional long,uniqueProportion:optional float,nullCount:optional long,nullProportion:optional float,min:optional string,max:optional string,mean:optional string,median:optional string,stdev:optional string,quantiles:optional array[record Quantile{quantile:string,value:string}]distinctValueFrequencies:optional array[record ValueFrequency{value:string,frequency:long}]histogram:optional record Histogram{boundaries:array[string]heights:array[float]}sampleValues:optional array[string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_FieldPath = SCHEMA.getField("fieldPath");
    private final static RecordDataSchema.Field FIELD_UniqueCount = SCHEMA.getField("uniqueCount");
    private final static RecordDataSchema.Field FIELD_UniqueProportion = SCHEMA.getField("uniqueProportion");
    private final static RecordDataSchema.Field FIELD_NullCount = SCHEMA.getField("nullCount");
    private final static RecordDataSchema.Field FIELD_NullProportion = SCHEMA.getField("nullProportion");
    private final static RecordDataSchema.Field FIELD_Min = SCHEMA.getField("min");
    private final static RecordDataSchema.Field FIELD_Max = SCHEMA.getField("max");
    private final static RecordDataSchema.Field FIELD_Mean = SCHEMA.getField("mean");
    private final static RecordDataSchema.Field FIELD_Median = SCHEMA.getField("median");
    private final static RecordDataSchema.Field FIELD_Stdev = SCHEMA.getField("stdev");
    private final static RecordDataSchema.Field FIELD_Quantiles = SCHEMA.getField("quantiles");
    private final static RecordDataSchema.Field FIELD_DistinctValueFrequencies = SCHEMA.getField("distinctValueFrequencies");
    private final static RecordDataSchema.Field FIELD_Histogram = SCHEMA.getField("histogram");
    private final static RecordDataSchema.Field FIELD_SampleValues = SCHEMA.getField("sampleValues");

    public DatasetFieldProfile() {
        super(new DataMap(), SCHEMA, 6);
    }

    public DatasetFieldProfile(DataMap data) {
        super(data, SCHEMA);
    }

    public static DatasetFieldProfile.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for fieldPath
     * 
     * @see DatasetFieldProfile.Fields#fieldPath
     */
    public boolean hasFieldPath() {
        return contains(FIELD_FieldPath);
    }

    /**
     * Remover for fieldPath
     * 
     * @see DatasetFieldProfile.Fields#fieldPath
     */
    public void removeFieldPath() {
        remove(FIELD_FieldPath);
    }

    /**
     * Getter for fieldPath
     * 
     * @see DatasetFieldProfile.Fields#fieldPath
     */
    public String getFieldPath(GetMode mode) {
        return obtainDirect(FIELD_FieldPath, String.class, mode);
    }

    /**
     * Getter for fieldPath
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetFieldProfile.Fields#fieldPath
     */
    @Nonnull
    public String getFieldPath() {
        return obtainDirect(FIELD_FieldPath, String.class, GetMode.STRICT);
    }

    /**
     * Setter for fieldPath
     * 
     * @see DatasetFieldProfile.Fields#fieldPath
     */
    public DatasetFieldProfile setFieldPath(String value, SetMode mode) {
        putDirect(FIELD_FieldPath, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for fieldPath
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#fieldPath
     */
    public DatasetFieldProfile setFieldPath(
        @Nonnull
        String value) {
        putDirect(FIELD_FieldPath, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for uniqueCount
     * 
     * @see DatasetFieldProfile.Fields#uniqueCount
     */
    public boolean hasUniqueCount() {
        return contains(FIELD_UniqueCount);
    }

    /**
     * Remover for uniqueCount
     * 
     * @see DatasetFieldProfile.Fields#uniqueCount
     */
    public void removeUniqueCount() {
        remove(FIELD_UniqueCount);
    }

    /**
     * Getter for uniqueCount
     * 
     * @see DatasetFieldProfile.Fields#uniqueCount
     */
    public Long getUniqueCount(GetMode mode) {
        return obtainDirect(FIELD_UniqueCount, Long.class, mode);
    }

    /**
     * Getter for uniqueCount
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#uniqueCount
     */
    @Nullable
    public Long getUniqueCount() {
        return obtainDirect(FIELD_UniqueCount, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for uniqueCount
     * 
     * @see DatasetFieldProfile.Fields#uniqueCount
     */
    public DatasetFieldProfile setUniqueCount(Long value, SetMode mode) {
        putDirect(FIELD_UniqueCount, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for uniqueCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#uniqueCount
     */
    public DatasetFieldProfile setUniqueCount(
        @Nonnull
        Long value) {
        putDirect(FIELD_UniqueCount, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for uniqueCount
     * 
     * @see DatasetFieldProfile.Fields#uniqueCount
     */
    public DatasetFieldProfile setUniqueCount(long value) {
        putDirect(FIELD_UniqueCount, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for uniqueProportion
     * 
     * @see DatasetFieldProfile.Fields#uniqueProportion
     */
    public boolean hasUniqueProportion() {
        return contains(FIELD_UniqueProportion);
    }

    /**
     * Remover for uniqueProportion
     * 
     * @see DatasetFieldProfile.Fields#uniqueProportion
     */
    public void removeUniqueProportion() {
        remove(FIELD_UniqueProportion);
    }

    /**
     * Getter for uniqueProportion
     * 
     * @see DatasetFieldProfile.Fields#uniqueProportion
     */
    public Float getUniqueProportion(GetMode mode) {
        return obtainDirect(FIELD_UniqueProportion, Float.class, mode);
    }

    /**
     * Getter for uniqueProportion
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#uniqueProportion
     */
    @Nullable
    public Float getUniqueProportion() {
        return obtainDirect(FIELD_UniqueProportion, Float.class, GetMode.STRICT);
    }

    /**
     * Setter for uniqueProportion
     * 
     * @see DatasetFieldProfile.Fields#uniqueProportion
     */
    public DatasetFieldProfile setUniqueProportion(Float value, SetMode mode) {
        putDirect(FIELD_UniqueProportion, Float.class, Float.class, value, mode);
        return this;
    }

    /**
     * Setter for uniqueProportion
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#uniqueProportion
     */
    public DatasetFieldProfile setUniqueProportion(
        @Nonnull
        Float value) {
        putDirect(FIELD_UniqueProportion, Float.class, Float.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for uniqueProportion
     * 
     * @see DatasetFieldProfile.Fields#uniqueProportion
     */
    public DatasetFieldProfile setUniqueProportion(float value) {
        putDirect(FIELD_UniqueProportion, Float.class, Float.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for nullCount
     * 
     * @see DatasetFieldProfile.Fields#nullCount
     */
    public boolean hasNullCount() {
        return contains(FIELD_NullCount);
    }

    /**
     * Remover for nullCount
     * 
     * @see DatasetFieldProfile.Fields#nullCount
     */
    public void removeNullCount() {
        remove(FIELD_NullCount);
    }

    /**
     * Getter for nullCount
     * 
     * @see DatasetFieldProfile.Fields#nullCount
     */
    public Long getNullCount(GetMode mode) {
        return obtainDirect(FIELD_NullCount, Long.class, mode);
    }

    /**
     * Getter for nullCount
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#nullCount
     */
    @Nullable
    public Long getNullCount() {
        return obtainDirect(FIELD_NullCount, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for nullCount
     * 
     * @see DatasetFieldProfile.Fields#nullCount
     */
    public DatasetFieldProfile setNullCount(Long value, SetMode mode) {
        putDirect(FIELD_NullCount, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for nullCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#nullCount
     */
    public DatasetFieldProfile setNullCount(
        @Nonnull
        Long value) {
        putDirect(FIELD_NullCount, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for nullCount
     * 
     * @see DatasetFieldProfile.Fields#nullCount
     */
    public DatasetFieldProfile setNullCount(long value) {
        putDirect(FIELD_NullCount, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for nullProportion
     * 
     * @see DatasetFieldProfile.Fields#nullProportion
     */
    public boolean hasNullProportion() {
        return contains(FIELD_NullProportion);
    }

    /**
     * Remover for nullProportion
     * 
     * @see DatasetFieldProfile.Fields#nullProportion
     */
    public void removeNullProportion() {
        remove(FIELD_NullProportion);
    }

    /**
     * Getter for nullProportion
     * 
     * @see DatasetFieldProfile.Fields#nullProportion
     */
    public Float getNullProportion(GetMode mode) {
        return obtainDirect(FIELD_NullProportion, Float.class, mode);
    }

    /**
     * Getter for nullProportion
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#nullProportion
     */
    @Nullable
    public Float getNullProportion() {
        return obtainDirect(FIELD_NullProportion, Float.class, GetMode.STRICT);
    }

    /**
     * Setter for nullProportion
     * 
     * @see DatasetFieldProfile.Fields#nullProportion
     */
    public DatasetFieldProfile setNullProportion(Float value, SetMode mode) {
        putDirect(FIELD_NullProportion, Float.class, Float.class, value, mode);
        return this;
    }

    /**
     * Setter for nullProportion
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#nullProportion
     */
    public DatasetFieldProfile setNullProportion(
        @Nonnull
        Float value) {
        putDirect(FIELD_NullProportion, Float.class, Float.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for nullProportion
     * 
     * @see DatasetFieldProfile.Fields#nullProportion
     */
    public DatasetFieldProfile setNullProportion(float value) {
        putDirect(FIELD_NullProportion, Float.class, Float.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for min
     * 
     * @see DatasetFieldProfile.Fields#min
     */
    public boolean hasMin() {
        return contains(FIELD_Min);
    }

    /**
     * Remover for min
     * 
     * @see DatasetFieldProfile.Fields#min
     */
    public void removeMin() {
        remove(FIELD_Min);
    }

    /**
     * Getter for min
     * 
     * @see DatasetFieldProfile.Fields#min
     */
    public String getMin(GetMode mode) {
        return obtainDirect(FIELD_Min, String.class, mode);
    }

    /**
     * Getter for min
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#min
     */
    @Nullable
    public String getMin() {
        return obtainDirect(FIELD_Min, String.class, GetMode.STRICT);
    }

    /**
     * Setter for min
     * 
     * @see DatasetFieldProfile.Fields#min
     */
    public DatasetFieldProfile setMin(String value, SetMode mode) {
        putDirect(FIELD_Min, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for min
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#min
     */
    public DatasetFieldProfile setMin(
        @Nonnull
        String value) {
        putDirect(FIELD_Min, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for max
     * 
     * @see DatasetFieldProfile.Fields#max
     */
    public boolean hasMax() {
        return contains(FIELD_Max);
    }

    /**
     * Remover for max
     * 
     * @see DatasetFieldProfile.Fields#max
     */
    public void removeMax() {
        remove(FIELD_Max);
    }

    /**
     * Getter for max
     * 
     * @see DatasetFieldProfile.Fields#max
     */
    public String getMax(GetMode mode) {
        return obtainDirect(FIELD_Max, String.class, mode);
    }

    /**
     * Getter for max
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#max
     */
    @Nullable
    public String getMax() {
        return obtainDirect(FIELD_Max, String.class, GetMode.STRICT);
    }

    /**
     * Setter for max
     * 
     * @see DatasetFieldProfile.Fields#max
     */
    public DatasetFieldProfile setMax(String value, SetMode mode) {
        putDirect(FIELD_Max, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for max
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#max
     */
    public DatasetFieldProfile setMax(
        @Nonnull
        String value) {
        putDirect(FIELD_Max, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for mean
     * 
     * @see DatasetFieldProfile.Fields#mean
     */
    public boolean hasMean() {
        return contains(FIELD_Mean);
    }

    /**
     * Remover for mean
     * 
     * @see DatasetFieldProfile.Fields#mean
     */
    public void removeMean() {
        remove(FIELD_Mean);
    }

    /**
     * Getter for mean
     * 
     * @see DatasetFieldProfile.Fields#mean
     */
    public String getMean(GetMode mode) {
        return obtainDirect(FIELD_Mean, String.class, mode);
    }

    /**
     * Getter for mean
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#mean
     */
    @Nullable
    public String getMean() {
        return obtainDirect(FIELD_Mean, String.class, GetMode.STRICT);
    }

    /**
     * Setter for mean
     * 
     * @see DatasetFieldProfile.Fields#mean
     */
    public DatasetFieldProfile setMean(String value, SetMode mode) {
        putDirect(FIELD_Mean, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for mean
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#mean
     */
    public DatasetFieldProfile setMean(
        @Nonnull
        String value) {
        putDirect(FIELD_Mean, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for median
     * 
     * @see DatasetFieldProfile.Fields#median
     */
    public boolean hasMedian() {
        return contains(FIELD_Median);
    }

    /**
     * Remover for median
     * 
     * @see DatasetFieldProfile.Fields#median
     */
    public void removeMedian() {
        remove(FIELD_Median);
    }

    /**
     * Getter for median
     * 
     * @see DatasetFieldProfile.Fields#median
     */
    public String getMedian(GetMode mode) {
        return obtainDirect(FIELD_Median, String.class, mode);
    }

    /**
     * Getter for median
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#median
     */
    @Nullable
    public String getMedian() {
        return obtainDirect(FIELD_Median, String.class, GetMode.STRICT);
    }

    /**
     * Setter for median
     * 
     * @see DatasetFieldProfile.Fields#median
     */
    public DatasetFieldProfile setMedian(String value, SetMode mode) {
        putDirect(FIELD_Median, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for median
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#median
     */
    public DatasetFieldProfile setMedian(
        @Nonnull
        String value) {
        putDirect(FIELD_Median, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for stdev
     * 
     * @see DatasetFieldProfile.Fields#stdev
     */
    public boolean hasStdev() {
        return contains(FIELD_Stdev);
    }

    /**
     * Remover for stdev
     * 
     * @see DatasetFieldProfile.Fields#stdev
     */
    public void removeStdev() {
        remove(FIELD_Stdev);
    }

    /**
     * Getter for stdev
     * 
     * @see DatasetFieldProfile.Fields#stdev
     */
    public String getStdev(GetMode mode) {
        return obtainDirect(FIELD_Stdev, String.class, mode);
    }

    /**
     * Getter for stdev
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#stdev
     */
    @Nullable
    public String getStdev() {
        return obtainDirect(FIELD_Stdev, String.class, GetMode.STRICT);
    }

    /**
     * Setter for stdev
     * 
     * @see DatasetFieldProfile.Fields#stdev
     */
    public DatasetFieldProfile setStdev(String value, SetMode mode) {
        putDirect(FIELD_Stdev, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for stdev
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#stdev
     */
    public DatasetFieldProfile setStdev(
        @Nonnull
        String value) {
        putDirect(FIELD_Stdev, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for quantiles
     * 
     * @see DatasetFieldProfile.Fields#quantiles
     */
    public boolean hasQuantiles() {
        return contains(FIELD_Quantiles);
    }

    /**
     * Remover for quantiles
     * 
     * @see DatasetFieldProfile.Fields#quantiles
     */
    public void removeQuantiles() {
        remove(FIELD_Quantiles);
    }

    /**
     * Getter for quantiles
     * 
     * @see DatasetFieldProfile.Fields#quantiles
     */
    public QuantileArray getQuantiles(GetMode mode) {
        return obtainWrapped(FIELD_Quantiles, QuantileArray.class, mode);
    }

    /**
     * Getter for quantiles
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#quantiles
     */
    @Nullable
    public QuantileArray getQuantiles() {
        return obtainWrapped(FIELD_Quantiles, QuantileArray.class, GetMode.STRICT);
    }

    /**
     * Setter for quantiles
     * 
     * @see DatasetFieldProfile.Fields#quantiles
     */
    public DatasetFieldProfile setQuantiles(QuantileArray value, SetMode mode) {
        putWrapped(FIELD_Quantiles, QuantileArray.class, value, mode);
        return this;
    }

    /**
     * Setter for quantiles
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#quantiles
     */
    public DatasetFieldProfile setQuantiles(
        @Nonnull
        QuantileArray value) {
        putWrapped(FIELD_Quantiles, QuantileArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for distinctValueFrequencies
     * 
     * @see DatasetFieldProfile.Fields#distinctValueFrequencies
     */
    public boolean hasDistinctValueFrequencies() {
        return contains(FIELD_DistinctValueFrequencies);
    }

    /**
     * Remover for distinctValueFrequencies
     * 
     * @see DatasetFieldProfile.Fields#distinctValueFrequencies
     */
    public void removeDistinctValueFrequencies() {
        remove(FIELD_DistinctValueFrequencies);
    }

    /**
     * Getter for distinctValueFrequencies
     * 
     * @see DatasetFieldProfile.Fields#distinctValueFrequencies
     */
    public ValueFrequencyArray getDistinctValueFrequencies(GetMode mode) {
        return obtainWrapped(FIELD_DistinctValueFrequencies, ValueFrequencyArray.class, mode);
    }

    /**
     * Getter for distinctValueFrequencies
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#distinctValueFrequencies
     */
    @Nullable
    public ValueFrequencyArray getDistinctValueFrequencies() {
        return obtainWrapped(FIELD_DistinctValueFrequencies, ValueFrequencyArray.class, GetMode.STRICT);
    }

    /**
     * Setter for distinctValueFrequencies
     * 
     * @see DatasetFieldProfile.Fields#distinctValueFrequencies
     */
    public DatasetFieldProfile setDistinctValueFrequencies(ValueFrequencyArray value, SetMode mode) {
        putWrapped(FIELD_DistinctValueFrequencies, ValueFrequencyArray.class, value, mode);
        return this;
    }

    /**
     * Setter for distinctValueFrequencies
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#distinctValueFrequencies
     */
    public DatasetFieldProfile setDistinctValueFrequencies(
        @Nonnull
        ValueFrequencyArray value) {
        putWrapped(FIELD_DistinctValueFrequencies, ValueFrequencyArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for histogram
     * 
     * @see DatasetFieldProfile.Fields#histogram
     */
    public boolean hasHistogram() {
        return contains(FIELD_Histogram);
    }

    /**
     * Remover for histogram
     * 
     * @see DatasetFieldProfile.Fields#histogram
     */
    public void removeHistogram() {
        remove(FIELD_Histogram);
    }

    /**
     * Getter for histogram
     * 
     * @see DatasetFieldProfile.Fields#histogram
     */
    public Histogram getHistogram(GetMode mode) {
        return obtainWrapped(FIELD_Histogram, Histogram.class, mode);
    }

    /**
     * Getter for histogram
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#histogram
     */
    @Nullable
    public Histogram getHistogram() {
        return obtainWrapped(FIELD_Histogram, Histogram.class, GetMode.STRICT);
    }

    /**
     * Setter for histogram
     * 
     * @see DatasetFieldProfile.Fields#histogram
     */
    public DatasetFieldProfile setHistogram(Histogram value, SetMode mode) {
        putWrapped(FIELD_Histogram, Histogram.class, value, mode);
        return this;
    }

    /**
     * Setter for histogram
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#histogram
     */
    public DatasetFieldProfile setHistogram(
        @Nonnull
        Histogram value) {
        putWrapped(FIELD_Histogram, Histogram.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for sampleValues
     * 
     * @see DatasetFieldProfile.Fields#sampleValues
     */
    public boolean hasSampleValues() {
        return contains(FIELD_SampleValues);
    }

    /**
     * Remover for sampleValues
     * 
     * @see DatasetFieldProfile.Fields#sampleValues
     */
    public void removeSampleValues() {
        remove(FIELD_SampleValues);
    }

    /**
     * Getter for sampleValues
     * 
     * @see DatasetFieldProfile.Fields#sampleValues
     */
    public StringArray getSampleValues(GetMode mode) {
        return obtainWrapped(FIELD_SampleValues, StringArray.class, mode);
    }

    /**
     * Getter for sampleValues
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#sampleValues
     */
    @Nullable
    public StringArray getSampleValues() {
        return obtainWrapped(FIELD_SampleValues, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for sampleValues
     * 
     * @see DatasetFieldProfile.Fields#sampleValues
     */
    public DatasetFieldProfile setSampleValues(StringArray value, SetMode mode) {
        putWrapped(FIELD_SampleValues, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for sampleValues
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#sampleValues
     */
    public DatasetFieldProfile setSampleValues(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_SampleValues, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DatasetFieldProfile clone()
        throws CloneNotSupportedException
    {
        return ((DatasetFieldProfile) super.clone());
    }

    @Override
    public DatasetFieldProfile copy()
        throws CloneNotSupportedException
    {
        return ((DatasetFieldProfile) super.copy());
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

        public PathSpec fieldPath() {
            return new PathSpec(getPathComponents(), "fieldPath");
        }

        public PathSpec uniqueCount() {
            return new PathSpec(getPathComponents(), "uniqueCount");
        }

        public PathSpec uniqueProportion() {
            return new PathSpec(getPathComponents(), "uniqueProportion");
        }

        public PathSpec nullCount() {
            return new PathSpec(getPathComponents(), "nullCount");
        }

        public PathSpec nullProportion() {
            return new PathSpec(getPathComponents(), "nullProportion");
        }

        public PathSpec min() {
            return new PathSpec(getPathComponents(), "min");
        }

        public PathSpec max() {
            return new PathSpec(getPathComponents(), "max");
        }

        public PathSpec mean() {
            return new PathSpec(getPathComponents(), "mean");
        }

        public PathSpec median() {
            return new PathSpec(getPathComponents(), "median");
        }

        public PathSpec stdev() {
            return new PathSpec(getPathComponents(), "stdev");
        }

        public com.linkedin.dataset.QuantileArray.Fields quantiles() {
            return new com.linkedin.dataset.QuantileArray.Fields(getPathComponents(), "quantiles");
        }

        public PathSpec quantiles(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "quantiles");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        public com.linkedin.dataset.ValueFrequencyArray.Fields distinctValueFrequencies() {
            return new com.linkedin.dataset.ValueFrequencyArray.Fields(getPathComponents(), "distinctValueFrequencies");
        }

        public PathSpec distinctValueFrequencies(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "distinctValueFrequencies");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        public com.linkedin.dataset.Histogram.Fields histogram() {
            return new com.linkedin.dataset.Histogram.Fields(getPathComponents(), "histogram");
        }

        public PathSpec sampleValues() {
            return new PathSpec(getPathComponents(), "sampleValues");
        }

        public PathSpec sampleValues(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "sampleValues");
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
