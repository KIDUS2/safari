FROM 23288/wildflypostgresql-connection
ADD  target/Safaricomtest.war  /opt/jboss/wildfly/standalone/deployments/
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]