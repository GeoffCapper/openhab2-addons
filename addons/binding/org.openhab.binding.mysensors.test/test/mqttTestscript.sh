#!/bin/sh

# Request I_TIME
mosquitto_pub -t "mygateway1-out/172/255/3/0/1" -m ""

# Represent Humidity
mosquitto_pub -t "mygateway1-out/173/0/0/0/7" -m "2.2.0"

# Set Humidity
mosquitto_pub -t "mygateway1-out/173/0/1/0/1" -m "48"

#### Represent Dimmer
mosquitto_pub -t "mygateway1-out/172/7/0/0/4" -m "2.2.0"

# Set dimmer status
mosquitto_pub -t "mygateway1-out/172/7/1/0/3" -m "49"