package com.pentaho.metaverse.analyzer.kettle.jobentry;

import com.pentaho.metaverse.analyzer.kettle.DatabaseConnectionAnalyzer;
import org.apache.commons.lang.ArrayUtils;
import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.di.job.entry.JobEntryInterface;

import java.util.Arrays;
import java.util.List;

/**
 * User: RFellows Date: 3/6/15
 */
public class JobEntryDatabaseConnectionAnalyzer extends DatabaseConnectionAnalyzer<JobEntryInterface> {

  @Override
  public List<DatabaseMeta> getUsedConnections( JobEntryInterface meta ) {
    if ( meta != null ) {
      DatabaseMeta[] dbMetas = meta.getUsedDatabaseConnections();
      List<DatabaseMeta> databaseMetas = null;
      if ( !ArrayUtils.isEmpty( dbMetas ) ) {
        databaseMetas = Arrays.asList( dbMetas );
      }
      return databaseMetas;
    } else {
      return null;
    }
  }

}