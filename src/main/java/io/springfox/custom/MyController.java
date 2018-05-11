package io.springfox.custom;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.annotations.ApiParam;

@Controller
public class MyController implements MyApi {

    public ResponseEntity<Void> depositIncomingTransfer(@ApiParam(value = "", required = true) @RequestBody RequestDO incomingRDO,
        @ApiParam(value = "", required = true) @PathVariable("etransferId") String etransferId) {

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getIncomingTransfer(
        @Pattern(regexp = "^[A-Za-z0-9]{8,16}$") @Size(min = 8, max = 16) @ApiParam(value = "Transfer Id", required = true) @PathVariable("etransferId") String transferId) {

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
