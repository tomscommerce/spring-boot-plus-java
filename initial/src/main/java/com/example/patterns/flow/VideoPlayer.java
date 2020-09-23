package com.example.patterns.flow;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscription;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VideoPlayer implements Flow.Subscriber<VideoFrame> {
	 Logger log = LoggerFactory.getLogger(VideoPlayer.class);
	
	private Subscription subscription;

	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription = subscription;
		subscription.request(1);
	}

	@Override
	public void onNext(VideoFrame item) {
		log.info("play #{}" + item.getNumber());
	}

	@Override
	public void onError(Throwable throwable) {
        log.error("There is an error in video streaming:{}" , throwable.getMessage());
		
	}

	@Override
	public void onComplete() {
        log.info("Video has ended");
		
	}

	
}
