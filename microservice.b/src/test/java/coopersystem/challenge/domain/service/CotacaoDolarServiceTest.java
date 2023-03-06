package coopersystem.challenge.domain.service;

import coopersystem.challenge.domain.model.internal.Cotacao;
import coopersystem.challenge.domain.model.internal.CotacaoResponse;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.math.BigDecimal;

@QuarkusTest
public class CotacaoDolarServiceTest {

    @Inject
    CotacaoDolarService cotacaoDolarService;

    public static final Cotacao COTACAO_SOLICITADA = Cotacao.builder().cotacaoCompra(new BigDecimal("5.04730"))
            .cotacaoVenda(new BigDecimal("5.04790")).dataHoraCotacao("2023-03-03 12:00:00.000").build();

    public static final Cotacao COTACAO_ULTIMO_DIA_UTIL_ANTERIOR = Cotacao.builder().cotacaoCompra(new BigDecimal("5.07530"))
            .cotacaoVenda(new BigDecimal("5.07490")).dataHoraCotacao("2023-03-02 12:00:00.000").build();
    public static final CotacaoResponse COTACAO_VALUE = CotacaoResponse.builder().cotacaoSolicitada(COTACAO_SOLICITADA)
            .cotacaoUltimoDiaUtilAnterior(COTACAO_ULTIMO_DIA_UTIL_ANTERIOR).build();

    private static final String DATA_COTACAO_FORMAT = "MM-dd-yyyy";

    @Test
    void testGetCotacaoDolarDia() {
        Assertions.assertEquals(COTACAO_VALUE, cotacaoDolarService.findCotacaoDolar("03-03-2023"));
    }
}
