package com.manilina.domain;

/**
 * Created by backendlessdev on 12/21/14.
 */
public class Holder
{
  private String id;
  private String name;
  private String key;
  private String hash;
  private byte state;

  public String getId()
  {
    return id;
  }

  public void setId( String id )
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName( String name )
  {
    this.name = name;
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

  public byte getState()
  {
    return state;
  }

  public void setState( byte state )
  {
    this.state = state;
  }
}
