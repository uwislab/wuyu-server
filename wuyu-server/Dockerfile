# 使用 Maven 镜像并指定 JDK 8 作为构建环境
FROM maven:3.8.6-jdk-8 AS build
WORKDIR /app
COPY . .
# 构建项目（跳过测试）
RUN mvn clean package -DskipTests

# 使用 OpenJDK 8 作为运行时环境
FROM openjdk:8-jdk
COPY --from=build /app/target/*.jar /app/app.jar
EXPOSE 9080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
