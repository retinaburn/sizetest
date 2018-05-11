package io.springfox.custom;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "transfers")
public interface MyApi {

    @ApiOperation(value = "<p>Deposits Transfer</p>", notes = "", response = Void.class, tags = { "Transfer", })
    @RequestMapping(value = "/depositTransfer/{etransferId}", produces = { "application/json" }, consumes = {
        "application/json" }, method = RequestMethod.POST)
    ResponseEntity<Void> depositIncomingTransfer(@ApiParam(value = "", required = true) @RequestBody RequestDO incomingRDO,
        @ApiParam(value = "", required = true) @PathVariable("transferId") String etransferId);

    @ApiOperation(value = "<p>Get Transfer</p>", notes = "", response = Void.class, tags = { "Transfer", })
    @RequestMapping(value = "/incomingtransfers/{etransferId}", produces = { "application/json" }, method = RequestMethod.GET)
    ResponseEntity<Void> getIncomingTransfer(
        @Pattern(regexp = "^[A-Za-z0-9]{8,16}$") @Size(min = 8, max = 16) @ApiParam(value = "Transfer Id", required = true) @PathVariable("transferId") String transferId);

}
