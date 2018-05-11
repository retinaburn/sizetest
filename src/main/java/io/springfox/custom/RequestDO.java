package io.springfox.custom;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class RequestDO {
    String transferId;

    @NotNull
    @Pattern(regexp = "^[A-Za-z0-9]{8,16}$")
    @Size(min = 8, max = 16)
    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }
}
