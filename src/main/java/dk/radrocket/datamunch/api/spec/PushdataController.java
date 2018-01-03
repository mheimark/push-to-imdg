package dk.radrocket.datamunch.api.spec;


import dk.radrocket.datamunch.model.DataSet;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;

@Api(basePath = "/api", value = "Data", description = "Data operations")
public interface PushdataController {

    @ApiOperation(value = "Update data", notes = "Updates data set")
    @ApiResponse(code = 200, message = "")
    public void pushData(@ApiParam(value = "update Data object", required = true) DataSet dataSet);
}
