/*
 * This file is generated by jOOQ.
 */
package org.jooq.covspectrum.tables.records;


import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.covspectrum.tables.SpectrumNewInterestingVariant;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpectrumNewInterestingVariantRecord extends UpdatableRecordImpl<SpectrumNewInterestingVariantRecord> implements Record5<Integer, LocalDateTime, String, JSONB, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.spectrum_new_interesting_variant.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.spectrum_new_interesting_variant.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.spectrum_new_interesting_variant.insertion_timestamp</code>.
     */
    public void setInsertionTimestamp(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.spectrum_new_interesting_variant.insertion_timestamp</code>.
     */
    public LocalDateTime getInsertionTimestamp() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.spectrum_new_interesting_variant.country</code>.
     */
    public void setCountry(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.spectrum_new_interesting_variant.country</code>.
     */
    public String getCountry() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.spectrum_new_interesting_variant.data_type</code>.
     */
    public void setDataType(JSONB value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.spectrum_new_interesting_variant.data_type</code>.
     */
    public JSONB getDataType() {
        return (JSONB) get(3);
    }

    /**
     * Setter for <code>public.spectrum_new_interesting_variant.result</code>.
     */
    public void setResult(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.spectrum_new_interesting_variant.result</code>.
     */
    public String getResult() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, LocalDateTime, String, JSONB, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, LocalDateTime, String, JSONB, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return SpectrumNewInterestingVariant.SPECTRUM_NEW_INTERESTING_VARIANT.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return SpectrumNewInterestingVariant.SPECTRUM_NEW_INTERESTING_VARIANT.INSERTION_TIMESTAMP;
    }

    @Override
    public Field<String> field3() {
        return SpectrumNewInterestingVariant.SPECTRUM_NEW_INTERESTING_VARIANT.COUNTRY;
    }

    @Override
    public Field<JSONB> field4() {
        return SpectrumNewInterestingVariant.SPECTRUM_NEW_INTERESTING_VARIANT.DATA_TYPE;
    }

    @Override
    public Field<String> field5() {
        return SpectrumNewInterestingVariant.SPECTRUM_NEW_INTERESTING_VARIANT.RESULT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public LocalDateTime component2() {
        return getInsertionTimestamp();
    }

    @Override
    public String component3() {
        return getCountry();
    }

    @Override
    public JSONB component4() {
        return getDataType();
    }

    @Override
    public String component5() {
        return getResult();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public LocalDateTime value2() {
        return getInsertionTimestamp();
    }

    @Override
    public String value3() {
        return getCountry();
    }

    @Override
    public JSONB value4() {
        return getDataType();
    }

    @Override
    public String value5() {
        return getResult();
    }

    @Override
    public SpectrumNewInterestingVariantRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public SpectrumNewInterestingVariantRecord value2(LocalDateTime value) {
        setInsertionTimestamp(value);
        return this;
    }

    @Override
    public SpectrumNewInterestingVariantRecord value3(String value) {
        setCountry(value);
        return this;
    }

    @Override
    public SpectrumNewInterestingVariantRecord value4(JSONB value) {
        setDataType(value);
        return this;
    }

    @Override
    public SpectrumNewInterestingVariantRecord value5(String value) {
        setResult(value);
        return this;
    }

    @Override
    public SpectrumNewInterestingVariantRecord values(Integer value1, LocalDateTime value2, String value3, JSONB value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SpectrumNewInterestingVariantRecord
     */
    public SpectrumNewInterestingVariantRecord() {
        super(SpectrumNewInterestingVariant.SPECTRUM_NEW_INTERESTING_VARIANT);
    }

    /**
     * Create a detached, initialised SpectrumNewInterestingVariantRecord
     */
    public SpectrumNewInterestingVariantRecord(Integer id, LocalDateTime insertionTimestamp, String country, JSONB dataType, String result) {
        super(SpectrumNewInterestingVariant.SPECTRUM_NEW_INTERESTING_VARIANT);

        setId(id);
        setInsertionTimestamp(insertionTimestamp);
        setCountry(country);
        setDataType(dataType);
        setResult(result);
    }
}