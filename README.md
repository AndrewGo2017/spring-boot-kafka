# Kafka Producer/Consume example
## Cmd commands (/kafka_home)
### Start zookeeper
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties - start zookeeper
### Start kafka
.\bin\windows\kafka-server-start.bat .\config\server.properties
### Create topic 
.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic kafkaexample
### Show topic list
.\bin\windows\kafka-topics.bat --list --zookeeper localhost:2181
### Show topic messages
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic kafkaexample --from-beginning
### Delete topic 
firs you need set property: delete.topic.enable=true
.\bin\windows\kafka-topics.bat --zookeeper localhost:2181 --delete --topic kafkaexample

