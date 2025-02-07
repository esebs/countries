package net.gbm.countries.application.interfaces.inbound;

import net.gbm.countries.infrastructure.inbound.rest.dto.request.RequestDTO;
import net.gbm.countries.infrastructure.inbound.rest.dto.response.ResponseDTO;

public interface ProcessRequest {
    ResponseDTO process(RequestDTO requestDTO);
}
