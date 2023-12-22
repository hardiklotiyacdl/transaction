package com.tsb.transaction.model.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class TransactionResponse {

    @JsonProperty("AccountId")
    private String AccountId;

    @JsonProperty("TransactionId")
    private String TransactionId;

    @JsonProperty("TransactionReference")
    private String TransactionReference;

    @JsonProperty("Amount")
    private Amount Amount;

    @JsonProperty("CreditDebitIndicator")
    private String CreditDebitIndicator;

    @JsonProperty("Status")
    private String Status;

    @JsonProperty("BookingDateTime")
    private String BookingDateTime;

    @JsonProperty("ValueDateTime")
    private String ValueDateTime;

    @JsonProperty("TransactionInformation")
    private String TransactionInformation;

    @JsonProperty("BankTransactionCode")
    private BankTransactionCode BankTransactionCode;

    @JsonProperty("ProprietaryBankTransactionCode")
    private ProprietaryBankTransactionCode ProprietaryBankTransactionCode;

    @JsonProperty("Balance")
    private Balance Balance;


}
