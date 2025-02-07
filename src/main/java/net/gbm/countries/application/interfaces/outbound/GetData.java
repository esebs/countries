package net.gbm.countries.application.interfaces.outbound;

import net.gbm.countries.infrastructure.inbound.rest.dto.request.RequestDTO;

public interface GetData {
    boolean get(RequestDTO requestDTO);
}
