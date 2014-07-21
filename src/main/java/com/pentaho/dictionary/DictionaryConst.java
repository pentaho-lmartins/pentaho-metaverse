package com.pentaho.dictionary;


/**
 * Constants used in the graph building and reading.
 * All data flow links must be left to right (source to destination).
 * All structural links must be high to low (container to containee). 
 * @author jdixon
 *
 */
public class DictionaryConst {

  /**
   * Property key for "type". Value could be NODE_TYPE_TRANS or NODE_TYPE_CONTENT etc
   */
  public static final String PROPERTY_TYPE = "type";

  /**
   * Property key for "category". If the type is NODE_TYPE_TRANS, the category could be
   * "ETL" etc
   */
  public static final String PROPERTY_CATEGORY = "category";

  /**
   * Property key for "id"
   */
  public static final String PROPERTY_ID = "id";

  /**
   * Property key for "name"
   */
  public static final String PROPERTY_NAME = "name";

  /**
   * Property key for "author"
   */
  public static final String PROPERTY_AUTHOR = "author";

  /**
   * Property key for "last modified"
   */
  public static final String PROPERTY_LAST_MODIFED = "lastmodified";

  /**
   * Label for an "executes" edge in the graph, e.g. a job executes a transformation
   */
  public static final String LINK_EXECUTES = "executes";

  /**
   * Label for an "is a" edge in the graph, e.g. a ktr instance is a transformation
   */
  public static final String LINK_IS_A = "isa";

  /**
   * Label for an "contains" edge in the graph, e.g. a transformation contains a step
   */
  public static final String LINK_CONTAINS = "contains";

  /**
   * Label for an "defines" edge in the graph, e.g. a transformation contains a step
   */
  public static final String LINK_DEFINES = "defines";

  /**
   * Label for an "populates" edge in the graph, e.g. a transformation field populates a table column.
   */
  public static final String LINK_POPULATES = "populates";

  /**
   * Label for an "is ready by" edge in the graph, e.g. a text file is ready by a transformation step
   */
  public static final String LINK_READBY = "isreadby";

  /**
   * Label for an "writes to" edge in the graph, e.g. a table output step writes to a table
   */
  public static final String LINK_WRITESTO = "writesto";

  /**
   * Label for a "used by" edge in the graph, e.g. a databaseMeta is used by a step
   */
  public static final String LINK_USEDBY = "usedby";

  /**
   * Label for an "creates" edge in the graph, e.g. a transformation step creates a transformation field
   */
  public static final String LINK_CREATES = "creates";

  /*
   * This is a set of known content types
   */
  public static final String NODE_TYPE_JOB = "kjb";
  public static final String NODE_TYPE_TRANS = "ktr";
  public static final String NODE_TYPE_TRANS_STEP = "transtep";
  public static final String NODE_TYPE_JOB_ENTRY = "jobentry";
  public static final String NODE_TYPE_DATASOURCE = "datasource";
  public static final String NODE_TYPE_DATA_TABLE = "table";
  public static final String NODE_TYPE_TRANS_FIELD = "transfield";
  public static final String NODE_TYPE_DATA_COLUMN = "column";
  public static final String NODE_TYPE_FILE = "file";
  public static final String NODE_TYPE_FILE_FIELD = "filefield";
  public static final String NODE_TYPE_WEBSERVICE = "service";
  public static final String NODE_TYPE_LOGICAL_MODEL = "model";
  public static final String NODE_TYPE_LOGICAL_HIERARCHY = "modelhier";
  public static final String NODE_TYPE_LOGICAL_FIELD = "modelfield";
  public static final String NODE_TYPE_USER_CONTENT = "content";

  public static final String NODE_VIRTUAL = "virtual";

}
