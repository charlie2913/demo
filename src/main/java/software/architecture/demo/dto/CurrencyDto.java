package software.architecture.demo.dto;

import java.math.BigDecimal;

public class CurrencyDto {

    private boolean success;
    private RequestDto query;
    private DataDto info;
    private String date;
    private BigDecimal result;


    public CurrencyDto() {
    }
    public CurrencyDto(boolean success, RequestDto query, DataDto info, String date, BigDecimal result) {
        this.success = success;
        this.query = query;
        this.info = info;
        this.date = date;
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public RequestDto getQuery() {
        return query;
    }

    public void setQuery(RequestDto query) {
        this.query = query;
    }

    public DataDto getInfo() {
        return info;
    }

    public void setInfo(DataDto info) {
        this.info = info;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "CurrencyDto{" +
                "success=" + success +
                ", query=" + query +
                ", info=" + info +
                ", date='" + date + '\'' +
                ", result=" + result +
                '}';
    }
}

