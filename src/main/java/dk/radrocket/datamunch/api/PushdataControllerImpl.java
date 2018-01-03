package dk.radrocket.datamunch.api;

import dk.radrocket.datamunch.api.spec.PushdataController;
import dk.radrocket.datamunch.model.DataSet;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

/**
 * A light controller for pushing data updates in XML format. Returns an empty response with status 200,OK.
 */
@RestController
public class PushdataControllerImpl implements PushdataController {

    @Override
    @PostMapping("data")
    @Consumes(MediaType.APPLICATION_XML)
    @ResponseStatus(value = HttpStatus.OK)
    public void pushData(@ApiParam(value = "update Data object", required = true) @RequestBody DataSet dataSet) {
        System.out.println(dataSet);
    }
}
