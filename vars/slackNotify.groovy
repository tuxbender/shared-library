#!/usr/bin/env groovy

def call(String message_) {
	 slackSend color: "good", message: message_
}

