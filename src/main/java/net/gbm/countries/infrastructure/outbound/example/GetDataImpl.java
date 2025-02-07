package net.gbm.countries.infrastructure.outbound.example;

import jakarta.enterprise.context.RequestScoped;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import net.gbm.countries.application.interfaces.outbound.GetData;
import net.gbm.countries.infrastructure.inbound.rest.dto.request.RequestDTO;


@RequestScoped
@Slf4j
public class GetDataImpl implements GetData {


    @SneakyThrows
    public boolean get(RequestDTO requestDTO) {
        return true;
    }
}
