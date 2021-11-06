
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * MLFeature Data Type
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/MLFeatureDataType.pdl.")
public enum MLFeatureDataType {


    /**
     * Useless data is unique, discrete data with no potential relationship with the outcome variable.
     * A useless feature has high cardinality. An example would be bank account numbers that were generated randomly.
     * 
     */
    USELESS,

    /**
     * Nominal data is made of discrete values with no numerical relationship between the different categories — mean and median are meaningless.
     * Animal species is one example. For example, pig is not higher than bird and lower than fish.
     * 
     */
    NOMINAL,

    /**
     * Ordinal data are discrete integers that can be ranked or sorted.
     * For example, the distance between first and second may not be the same as the distance between second and third.
     * 
     */
    ORDINAL,

    /**
     * Binary data is discrete data that can be in only one of two categories — either yes or no, 1 or 0, off or on, etc
     * 
     */
    BINARY,

    /**
     * Count data is discrete whole number data — no negative numbers here.
     * Count data often has many small values, such as zero and one.
     * 
     */
    COUNT,

    /**
     * Time data is a cyclical, repeating continuous form of data.
     * The relevant time features can be any period— daily, weekly, monthly, annual, etc.
     * 
     */
    TIME,

    /**
     * Interval data has equal spaces between the numbers and does not represent a temporal pattern.
     * Examples include percentages, temperatures, and income.
     * 
     */
    INTERVAL,

    /**
     * Image Data
     * 
     */
    IMAGE,

    /**
     * Video Data
     * 
     */
    VIDEO,

    /**
     * Audio Data
     * 
     */
    AUDIO,

    /**
     * Text Data
     * 
     */
    TEXT,

    /**
     * Mapping Data Type ex: dict, map
     * 
     */
    MAP,

    /**
     * Sequence Data Type ex: list, tuple, range
     * 
     */
    SEQUENCE,

    /**
     * Set Data Type ex: set, frozenset
     * 
     */
    SET,

    /**
     * Continuous data are made of uncountable values, often the result of a measurement such as height, weight, age etc.
     * 
     */
    CONTINUOUS,

    /**
     * Bytes data are binary-encoded values that can represent complex objects.
     * 
     */
    BYTE,

    /**
     * Unknown data are data that we don't know the type for.
     * 
     */
    UNKNOWN,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**MLFeature Data Type*/enum MLFeatureDataType{/**Useless data is unique, discrete data with no potential relationship with the outcome variable.\nA useless feature has high cardinality. An example would be bank account numbers that were generated randomly.*/USELESS/**Nominal data is made of discrete values with no numerical relationship between the different categories \u2014 mean and median are meaningless.\nAnimal species is one example. For example, pig is not higher than bird and lower than fish.*/NOMINAL/**Ordinal data are discrete integers that can be ranked or sorted.\nFor example, the distance between first and second may not be the same as the distance between second and third.*/ORDINAL/**Binary data is discrete data that can be in only one of two categories \u2014 either yes or no, 1 or 0, off or on, etc*/BINARY/**Count data is discrete whole number data \u2014 no negative numbers here.\nCount data often has many small values, such as zero and one.*/COUNT/**Time data is a cyclical, repeating continuous form of data.\nThe relevant time features can be any period\u2014 daily, weekly, monthly, annual, etc.*/TIME/**Interval data has equal spaces between the numbers and does not represent a temporal pattern.\nExamples include percentages, temperatures, and income.*/INTERVAL/**Image Data*/IMAGE/**Video Data*/VIDEO/**Audio Data*/AUDIO/**Text Data*/TEXT/**Mapping Data Type ex: dict, map*/MAP/**Sequence Data Type ex: list, tuple, range*/SEQUENCE/**Set Data Type ex: set, frozenset*/SET/**Continuous data are made of uncountable values, often the result of a measurement such as height, weight, age etc.*/CONTINUOUS/**Bytes data are binary-encoded values that can represent complex objects.*/BYTE/**Unknown data are data that we don't know the type for.*/UNKNOWN}", SchemaFormatType.PDL));

}
