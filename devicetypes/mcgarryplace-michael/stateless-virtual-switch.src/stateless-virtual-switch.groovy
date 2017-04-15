/**
 *  Copyright 2017 mcgarryplace-michael
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 *  Stateless Virtual Switch
 *
 *  Author: Michael McGarry
 *
 *  Date: 2017-04-15
 */
metadata {
	definition (name: "Stateless Virtual Switch", namespace: "mcgarryplace-michael", author: "Michael McGarry") {
		capability "Actuator"
		capability "Switch"
		capability "Sensor"
	}

	// simulator metadata
	simulator {
	}

	// UI tile definitions
	tiles {
 		standardTile("pushOn", "device.button", width: 1, height: 1, decoration: "flat") {
			state "default", label: "On", backgroundColor: "#ffffff", action: "pushOn"
		} 
        
 		standardTile("pushOff", "device.button", width: 1, height: 1, decoration: "flat") {
			state "default", label: "Off", backgroundColor: "#ffffff", action: "pushOff"
		}   
        
		main (["pushOn", "pushOff"])
		details (["pushOn", "pushOff"])
	}
}

def parse(String description) {
}

def pushOn() {
	sendEvent(name: "switch", value: "on", isStateChange: true)
}

def pushOff() {
	sendEvent(name: "switch", value: "off", isStateChange: true)
}