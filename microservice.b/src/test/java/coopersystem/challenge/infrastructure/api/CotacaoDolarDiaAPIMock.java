package coopersystem.challenge.infrastructure.api;

import coopersystem.challenge.domain.model.external.CotacaoDolarAPI.CotacaoDolarDiaResponse;
import coopersystem.challenge.domain.model.internal.Cotacao;
import coopersystem.challenge.domain.model.internal.CotacaoResponse;
import io.quarkus.test.Mock;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import java.math.BigDecimal;

@Mock
@ApplicationScoped
@RestClient
public class CotacaoDolarDiaAPIMock implements CotacaoDolarAPI {

    @Override
    public CotacaoDolarDiaResponse findCotacaoDolar(String dataCotacao) {
        return new CotacaoDolarDiaResponse("2023-03-03 12:00:00.000", new BigDecimal("5.04730"), new BigDecimal("5.04790"));
    }
}
