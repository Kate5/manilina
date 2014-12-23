package com.manilina.domain;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by backendlessdev on 12/23/14.
 */
public class Community
{
  private String id;
  private List<String> holdersId;
  private String title;
  private Timestamp created;
  private Timestamp updated;

  public String getId()
  {
    return id;
  }

  public void setId( String id )
  {
    this.id = id;
  }

  public List<String> getHoldersId()
  {
    return holdersId;
  }

  public void setHoldersId( List<String> holdersId )
  {
    this.holdersId = holdersId;
  }

  public String getTitle()
  {
    return title;
  }

  public void setTitle( String title )
  {
    this.title = title;
  }

  public Timestamp getCreated()
  {
    return created;
  }

  public void setCreated( Timestamp created )
  {
    this.created = created;
  }

  public Timestamp getUpdated()
  {
    return updated;
  }

  public void setUpdated( Timestamp updated )
  {
    this.updated = updated;
  }
}
