package com.manilina.domain;

import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by backendlessdev on 12/21/14.
 */
public class Account
{
  private String id;
  private String holderId;
  private String key;
  private String hash;
  private Collection<String> device;
  private Timestamp created;
  private Timestamp changed;
  private byte state;

  public String getId()
  {
    return id;
  }

  public void setId( String id )
  {
    this.id = id;
  }

  public String getHolderId()
  {
    return holderId;
  }

  public void setHolderId( String holderId )
  {
    this.holderId = holderId;
  }

  public String getKey()
  {
    return key;
  }

  public void setKey( String key )
  {
    this.key = key;
  }

  public String getHash()
  {
    return hash;
  }

  public void setHash( String hash )
  {
    this.hash = hash;
  }

  public Collection<String> getDevice()
  {
    return device;
  }

  public void setDevice( Collection<String> device )
  {
    this.device = device;
  }

  public Timestamp getCreated()
  {
    return created;
  }

  public void setCreated( Timestamp created )
  {
    this.created = created;
  }

  public Timestamp getChanged()
  {
    return changed;
  }

  public void setChanged( Timestamp changed )
  {
    this.changed = changed;
  }

  public byte getState()
  {
    return state;
  }

  public void setState( byte state )
  {
    this.state = state;
  }
}
