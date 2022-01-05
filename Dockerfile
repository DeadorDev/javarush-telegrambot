FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=test_deador_bot
ENV BOT_TOKEN=5017881888:AAGBuUs1aRK8AqxhD0xCBfB0T95R4UgDxp8
ENV BOT_DB_USERNAME=Deador
ENV BOT_DB_PASSWORD=DeadorAndrii
COPY ${JAR_FILE} javarush-telegrambot-0.3.4-SNAPSHOT.jar
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-Dspring.datasource.password=${BOT_DB_PASSWORD}", "-Dbot.username=${BOT_NAME}", "-jar", "/javarush-telegrambot-0.3.4-SNAPSHOT.jar"]