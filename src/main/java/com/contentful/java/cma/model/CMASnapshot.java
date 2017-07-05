package com.contentful.java.cma.model;

/**
 * This model represents a snapshot of a specific resource.
 */
public class CMASnapshot extends CMAResource {

  CMAResource snapshot;

  /**
   * Create a new snapshot.
   * <p>
   * Used for internal testing and json parsing only.
   */
  public CMASnapshot() {
    super(CMAType.Snapshot);
  }

  /**
   * @return the actual data of the snapshot
   */
  public CMAResource getSnapshot() {
    return snapshot;
  }
}
