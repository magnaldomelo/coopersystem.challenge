#Microservice A
cd microservice.a
./mvnw clean package -Dquarkus.container-image.build=true -DskipTests
docker build -t magnaldomelo/microservice.a:1.0.0-SNAPSHOT .

cd ..
cd microservice.b

#Microservice A
./mvnw clean package -Dquarkus.container-image.build=true -DskipTests
docker build -t magnaldomelo/microservice.b:1.0.0-SNAPSHOT .

cd ..
docker-compose up
