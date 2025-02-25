package net.gbm.countries.infrastructure.inbound.rest;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.extern.slf4j.Slf4j;
import net.gbm.countries.application.interfaces.inbound.ProcessRequest;
import net.gbm.countries.utils.defaults.CodeMessage;
import net.gbm.countries.utils.errors.dtos.ErrorResponse;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.slf4j.MDC;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/countries")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
@Slf4j
public class RestAPI {
    @Inject
    ProcessRequest processRequest;
    @GET
    @Path("/{country}")
    @APIResponses({
            @APIResponse(responseCode = CodeMessage.Code200,
                    description = "Reservation confirmed"
            ),
            @APIResponse(
                    responseCode = "400",
                    description = CodeMessage.Code400,
                    content = @Content(mediaType = APPLICATION_JSON,
                            schema = @Schema(implementation = ErrorResponse.class))
            ),
            @APIResponse(
                    responseCode = "401",
                    description = CodeMessage.Code401,
                    content = @Content(mediaType = APPLICATION_JSON,
                            schema = @Schema(implementation = ErrorResponse.class))
            )
    })
    public Response getRequest(@PathParam("country") String country) {
        log.info("Request: {}", country);

        return Response.ok(processRequest.process(country))
                .header("TRNID", MDC.get("trnID"))
                .build();
    }
}
