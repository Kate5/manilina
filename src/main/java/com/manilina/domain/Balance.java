package com.manilina.domain;

import com.manilina.reference.Currency;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by backendlessdev on 12/21/14.
 */
public class Balance
{
  private String id;
  private String accountId;
  private String billId;
  private Long amountRest;
  private Long amountDelta;
  private Long amountInit;
  private Currency currencyId;
  private Timestamp created;
  private Timestamp changed;

  public String getId()
  {
    return id;
  }

  public void setId( String id )
  {
    this.id = id;
  }

  public String getAccountId()
  {
    return accountId;
  }

  public void setAccountId( String accountId )
  {
    this.accountId = accountId;
  }

  public String getBillId()
  {
    return billId;
  }

  public void setBillId( String billId )
  {
    this.billId = billId;
  }

  public Long getAmountRest()
  {
    return amountRest;
  }

  public void setAmountRest( Long amountRest )
  {
    this.amountRest = amountRest;
  }

  public Long getAmountDelta()
  {
    return amountDelta;
  }

  public void setAmountDelta( Long amountDelta )
  {
    this.amountDelta = amountDelta;
  }

  public Long getAmountInit()
  {
    return amountInit;
  }

  public void setAmountInit( Long amountInit )
  {
    this.amountInit = amountInit;
  }

  public Currency getCurrencyId()
  {
    return currencyId;
  }

  public void setCurrencyId( Currency currencyId )
  {
    this.currencyId = currencyId;
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
}
