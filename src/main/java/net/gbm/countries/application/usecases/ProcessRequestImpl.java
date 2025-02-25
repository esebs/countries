package net.gbm.countries.application.usecases;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.gbm.countries.application.interfaces.inbound.ProcessRequest;
import net.gbm.countries.application.interfaces.outbound.GetData;
import net.gbm.countries.utils.defaults.CodeMessage;

@ApplicationScoped
@Slf4j
public class ProcessRequestImpl implements ProcessRequest {
    @Inject
    GetData getData;
    @Override
    public String process(String country) {
        String response = getData.getCountryFromCode(country);
        log.info("Response: {}", response);
        return response;
    }
}
