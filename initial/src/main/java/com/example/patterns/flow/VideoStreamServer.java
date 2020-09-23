package com.example.patterns.flow;

import java.util.concurrent.Executors;
import java.util.concurrent.SubmissionPublisher;

public class VideoStreamServer extends SubmissionPublisher<VideoFrame> {
	
	public VideoStreamServer() {
		super(Executors.newSingleThreadExecutor(), 5);
		
		
		
	}
	

}
