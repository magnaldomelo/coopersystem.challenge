# Sistema de cotação do dolar

O sistema de cotação do dolar consome uma API externa do Banco Central do Brasil. 

# Tecnologias utilizadas

Microservice A: Consome a API de Consulta do Dolar do BCB. Desenvolvida em Java com o Framework Quarkus, provê um endpoint de consulta, aplicando regras de validação e posteriormente buscando
as informações de Cotação do Dollar no BCB.

curl --request GET \
  --url 'http://localhost:8181/api/v1/dolar_cotacao?data_cotacao=03-03-2023' \
  --header 'Content-Type: application/json'  
  
# swagger

O Swagger foi utilizado no Microservice, podendo ser acessado pela url:

http://localhost:8181/q/swagger-ui

# docker

Foi utilizado o docker compose foi utilizado e pode ser executado com o seguinte comando:

docker-compose up

# Executar Aplicação

Caso deseje executar a aplicação de forma direta, sem o docker compose, basta executar o seguinte comando:

./mvnw clean package -Dquarkus.container-image.build=true -DskipTests

# Testes

Foram desenvolvidos Testes Unitários.
Também foram feitos testes de integração para aferição das Regras de Validação.
