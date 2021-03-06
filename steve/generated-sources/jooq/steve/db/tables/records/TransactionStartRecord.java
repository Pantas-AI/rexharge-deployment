/*
 * This file is generated by jOOQ.
 */
package jooq.steve.db.tables.records;


import jooq.steve.db.tables.TransactionStart;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TransactionStartRecord extends UpdatableRecordImpl<TransactionStartRecord> implements Record6<Integer, Integer, String, DateTime, String, DateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>stevedb.transaction_start.transaction_pk</code>.
     */
    public TransactionStartRecord setTransactionPk(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction_start.transaction_pk</code>.
     */
    public Integer getTransactionPk() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>stevedb.transaction_start.connector_pk</code>.
     */
    public TransactionStartRecord setConnectorPk(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction_start.connector_pk</code>.
     */
    public Integer getConnectorPk() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>stevedb.transaction_start.id_tag</code>.
     */
    public TransactionStartRecord setIdTag(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction_start.id_tag</code>.
     */
    public String getIdTag() {
        return (String) get(2);
    }

    /**
     * Setter for <code>stevedb.transaction_start.start_timestamp</code>.
     */
    public TransactionStartRecord setStartTimestamp(DateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction_start.start_timestamp</code>.
     */
    public DateTime getStartTimestamp() {
        return (DateTime) get(3);
    }

    /**
     * Setter for <code>stevedb.transaction_start.start_value</code>.
     */
    public TransactionStartRecord setStartValue(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction_start.start_value</code>.
     */
    public String getStartValue() {
        return (String) get(4);
    }

    /**
     * Setter for <code>stevedb.transaction_start.event_timestamp</code>.
     */
    public TransactionStartRecord setEventTimestamp(DateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.transaction_start.event_timestamp</code>.
     */
    public DateTime getEventTimestamp() {
        return (DateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, String, DateTime, String, DateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Integer, String, DateTime, String, DateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TransactionStart.TRANSACTION_START.TRANSACTION_PK;
    }

    @Override
    public Field<Integer> field2() {
        return TransactionStart.TRANSACTION_START.CONNECTOR_PK;
    }

    @Override
    public Field<String> field3() {
        return TransactionStart.TRANSACTION_START.ID_TAG;
    }

    @Override
    public Field<DateTime> field4() {
        return TransactionStart.TRANSACTION_START.START_TIMESTAMP;
    }

    @Override
    public Field<String> field5() {
        return TransactionStart.TRANSACTION_START.START_VALUE;
    }

    @Override
    public Field<DateTime> field6() {
        return TransactionStart.TRANSACTION_START.EVENT_TIMESTAMP;
    }

    @Override
    public Integer component1() {
        return getTransactionPk();
    }

    @Override
    public Integer component2() {
        return getConnectorPk();
    }

    @Override
    public String component3() {
        return getIdTag();
    }

    @Override
    public DateTime component4() {
        return getStartTimestamp();
    }

    @Override
    public String component5() {
        return getStartValue();
    }

    @Override
    public DateTime component6() {
        return getEventTimestamp();
    }

    @Override
    public Integer value1() {
        return getTransactionPk();
    }

    @Override
    public Integer value2() {
        return getConnectorPk();
    }

    @Override
    public String value3() {
        return getIdTag();
    }

    @Override
    public DateTime value4() {
        return getStartTimestamp();
    }

    @Override
    public String value5() {
        return getStartValue();
    }

    @Override
    public DateTime value6() {
        return getEventTimestamp();
    }

    @Override
    public TransactionStartRecord value1(Integer value) {
        setTransactionPk(value);
        return this;
    }

    @Override
    public TransactionStartRecord value2(Integer value) {
        setConnectorPk(value);
        return this;
    }

    @Override
    public TransactionStartRecord value3(String value) {
        setIdTag(value);
        return this;
    }

    @Override
    public TransactionStartRecord value4(DateTime value) {
        setStartTimestamp(value);
        return this;
    }

    @Override
    public TransactionStartRecord value5(String value) {
        setStartValue(value);
        return this;
    }

    @Override
    public TransactionStartRecord value6(DateTime value) {
        setEventTimestamp(value);
        return this;
    }

    @Override
    public TransactionStartRecord values(Integer value1, Integer value2, String value3, DateTime value4, String value5, DateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TransactionStartRecord
     */
    public TransactionStartRecord() {
        super(TransactionStart.TRANSACTION_START);
    }

    /**
     * Create a detached, initialised TransactionStartRecord
     */
    public TransactionStartRecord(Integer transactionPk, Integer connectorPk, String idTag, DateTime startTimestamp, String startValue, DateTime eventTimestamp) {
        super(TransactionStart.TRANSACTION_START);

        setTransactionPk(transactionPk);
        setConnectorPk(connectorPk);
        setIdTag(idTag);
        setStartTimestamp(startTimestamp);
        setStartValue(startValue);
        setEventTimestamp(eventTimestamp);
    }
}
