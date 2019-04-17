# spring-cloud-services
Pivotal Spring Cloud Services Demo

Clone the repository

Config Server Demo
1. Import and build cloud-config project in eclipse
2. Create cloud config pcf service provided by the SCS tile
3. cf update-service config-server -c '{"git": {"uri": "https://github.com/pivotal-ben-chacko/spring-cloud-services.git"}}'
4. Wait for creation of service
5. From root directory run 'cf push'
6. Now if you browse to the following endpoint you should see a greeting, http://<app route>/hi
