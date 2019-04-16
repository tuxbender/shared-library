#!/usr/bin/env groovy

def call(string message_) {
	 slackSend color: "good", message: message_
}

