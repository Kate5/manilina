package com.manilina.domain;

import com.manilina.reference.Currency;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by backendlessdev on 12/21/14.
 */
public class Bill
{
  private String id;
  private String creditId;
  private String debitId;
  private Holder holderIdCreditor;
  private Holder holderIdDebtor;
  private Currency currencyId;
  private Timestamp stamp;
  private byte[] sign;
  private String key;
  private Date operationDate;
  private Time operationTime;

  public String getId()
  {
    return id;
  }

  public void setId( String id )
  {
    this.id = id;
  }

  public String getCreditId()
  {
    return creditId;
  }

  public void setCreditId( String creditId )
  {
    this.creditId = creditId;
  }

  public String getDebitId()
  {
    return debitId;
  }

  public void setDebitId( String debitId )
  {
    this.debitId = debitId;
  }

  public Holder getHolderIdCreditor()
  {
    return holderIdCreditor;
  }

  public void setHolderIdCreditor( Holder holderIdCreditor )
  {
    this.holderIdCreditor = holderIdCreditor;
  }

  public Holder getHolderIdDebtor()
  {
    return holderIdDebtor;
  }

  public void setHolderIdDebtor( Holder holderIdDebtor )
  {
    this.holderIdDebtor = holderIdDebtor;
  }

  public Currency getCurrencyId()
  {
    return currencyId;
  }

  public void setCurrencyId( Currency currencyId )
  {
    this.currencyId = currencyId;
  }

  public Timestamp getStamp()
  {
    return stamp;
  }

  public void setStamp( Timestamp stamp )
  {
    this.stamp = stamp;
  }

  public byte[] getSign()
  {
    return sign;
  }

  public void setSign( byte[] sign )
  {
    this.sign = sign;
  }

  public String getKey()
  {
    return key;
  }

  public void setKey( String key )
  {
    this.key = key;
  }

  public Date getOperationDate()
  {
    return operationDate;
  }

  public void setOperationDate( Date operationDate )
  {
    this.operationDate = operationDate;
  }

  public Time getOperationTime()
  {
    return operationTime;
  }

  public void setOperationTime( Time operationTime )
  {
    this.operationTime = operationTime;
  }
}
