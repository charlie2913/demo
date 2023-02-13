package software.architecture.demo.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DataDto {
    private BigInteger timestamp;
    private BigDecimal rate;

    public DataDto(BigInteger timestamp, BigDecimal rate) {
        this.timestamp = timestamp;
        this.rate = rate;
    }

    public DataDto() {
    }

    public BigInteger getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(BigInteger timestamp) {
        this.timestamp = timestamp;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "DataDto{" +
                "timestamp=" + timestamp +
                ", rate=" + rate +
                '}';
    }
}